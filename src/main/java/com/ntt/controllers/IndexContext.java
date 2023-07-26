/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.controllers;


import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ThanhThuyen
 */
@Controller

public class IndexContext {
    
    @Autowired
    private LocalSessionFactoryBean facrory;
    
    @RequestMapping("/")
    @Transactional
    public String index(Model model){
        Session s=this.facrory.getObject().getCurrentSession();
        Query q=s.createQuery("From NhaTro");
        model.addAttribute("phongtro", q.getResultList());
        return "index";
    }
}