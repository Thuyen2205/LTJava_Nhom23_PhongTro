/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.ntt.pojo.BaiViet;
import com.ntt.service.BaiVietService;
import com.ntt.service.LoaiBaiVietService;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ThanhThuyen
 */
@Controller
@Transactional
public class BaiVietController {

    @Autowired
    private Cloudinary cloudinary;
    @Autowired
    private BaiVietService baivietService;
    @Autowired
    private LoaiBaiVietService loaiBaiViet;

    @GetMapping("/dangbai")
    public String list(Model model, Authentication authen) {
        model.addAttribute("baiviet_role", this.loaiBaiViet.getLoaiBaiViet());
        model.addAttribute("baiviet", new BaiViet());
        return "dangbai";

    }

//    @ModelAttribute
//    public void Comm(Model model) {
//      
//    }

    @PostMapping("/dangbai")
    public String add(Model model, @ModelAttribute(value = "baiviet") BaiViet baiviet) {
        String errMsg = "";
        if (this.baivietService.addBaiViet(baiviet) == true) {

            return "redirect:/";
        } else {
            errMsg = "Đã có lỗi xãy ra";
        }

        return "baiviet";

    }
}
