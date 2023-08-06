/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.controllers;

import com.ntt.pojo.NguoiDung;
import com.ntt.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ThanhThuyen
 */
@Controller
@Transactional
public class DangKiController {

    
    @Autowired
    private TaiKhoanService taikhoanDetailsService;

//    @RequestMapping("/dangki")
//    public String dangki() {
//        return "dangki";
//    }

    @GetMapping("/dangki")
    public String dangkiView(Model model) {
        model.addAttribute("user", new NguoiDung());
        return "dangki";

    }

    @PostMapping("/dangki")
    public String dangki(Model model, @ModelAttribute(value = "user") NguoiDung nguoidung) {

        String errMsg = "";
        if (nguoidung.getMatKhau().equals(nguoidung.getXacNhanMatKhau())) {
            if (this.taikhoanDetailsService.addTaiKhoan(nguoidung) == true) {
                return "redirect:/dangnhap";
            } else {
                errMsg = "Đã có lỗi xãy ra";
            }
        } else {
            errMsg = "Mật khẩu không khớp";
        }
        model.addAttribute("arrMsg", errMsg);
        return "dangki";
    }
}
