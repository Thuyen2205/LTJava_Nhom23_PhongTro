/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.controllers;

import com.ntt.pojo.NguoiDung;
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
@Transactional
public class DangNhapController {
     @Autowired
    private LocalSessionFactoryBean facrory;
    
    @RequestMapping("/dangnhap")
    public String dangNhap(){
        return "dangnhap";
    }
    
    @RequestMapping("/chutro")
    public String dangNhapChuTro(){
        return "chutro";
    }
    
    @RequestMapping("/admin")
    public String dangNhapAdmin(){
        return "admin";
    }
    
   
}
