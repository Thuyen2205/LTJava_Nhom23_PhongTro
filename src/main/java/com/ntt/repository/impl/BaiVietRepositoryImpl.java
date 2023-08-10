/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.repository.impl;

import com.ntt.pojo.BaiViet;

import com.ntt.repository.BaiVietRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
public class BaiVietRepositoryImpl implements BaiVietRepository{
    
    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<BaiViet> getBaiViet() {
        Session s= this.factory.getObject().getCurrentSession();
        Query q=s.createQuery("From BaiViet");
        return q.getResultList();
    }

//    @Override
//    public boolean addBaiViet(BaiViet baiviet) {
//        Session s=this.factory.getObject().getCurrentSession();
//        try {
//            s.save(baiviet);
//            return true;
//        } catch (HibernateException e) {
//            System.err.println(e.getMessage());
//        }
//        return false;
//        
//    }

    
}
