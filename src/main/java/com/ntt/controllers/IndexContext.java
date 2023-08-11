/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.controllers;


import com.ntt.pojo.NguoiDung;
import com.ntt.service.BaiVietService;
import com.ntt.service.TaiKhoanService;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author ThanhThuyen
 */
@Controller

public class IndexContext {
    
    @Autowired
    private BaiVietService baiviet;
    @Autowired
    private TaiKhoanService taikhoan;
    @Autowired
    private BaiVietService baivietService;
    @RequestMapping("/")
    @Transactional
    public String index(Model model, NguoiDung nguoidung,Authentication authen){
        if(authen!=null)
        {
             model.addAttribute("taikhoan",this.taikhoan.getTaiKhoan(authen.getName()).get(0));
        }
       
       
        model.addAttribute("baiviet", this.baiviet.getBaiViet());
        return "index";
    }
}
