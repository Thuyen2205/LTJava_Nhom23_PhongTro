/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.repository.impl;

import com.ntt.pojo.TaiKhoan;
import com.ntt.repository.TaiKhoanRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ThanhThuyen
 */
@Repository
@Transactional
public class TaiKhoanRepositoryImpl implements TaiKhoanRepository{
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Override
    public boolean addTaiKhoan(TaiKhoan taikhoan) {
        Session session= this.sessionFactory.getObject().getCurrentSession();
        try{
           session.save(taikhoan);
           return true;
        }catch(HibernateException ex){
            System.err.println(ex.getMessage()); 
        }
        return false;
    }

    @Override
    public List<TaiKhoan> getTaiKhoan(String username) {
        Session s= this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder= s.getCriteriaBuilder();
        CriteriaQuery<TaiKhoan> query= builder.createQuery(TaiKhoan.class);
        Root root=query.from(TaiKhoan.class);
        query= query.select(root);
        
        if(!username.isEmpty())
        {
            Predicate p =builder.equal(root.get("tenTaiKhoan").as(String.class), username.trim());
            query =query.where(p);
        }
        
        Query q = s.createQuery(query);
        return q.getResultList();
    }
    
}
