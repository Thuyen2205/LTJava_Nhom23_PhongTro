/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.ntt.pojo.TinChoThue;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ThanhThuyen
 */

@Controller
public class BaiVietController {
    @Autowired
    private Cloudinary cloudinary;
    
    @GetMapping("/dangbai")
    public String list(Model model){
        
        model.addAttribute("baiviet", new TinChoThue());
        return "dangbai";
    
    }
    
    @PostMapping("/dangbai")
    public String add(@ModelAttribute(value="baiviet") TinChoThue baiviet ){
        try {
            Map r= this.cloudinary.uploader().upload(baiviet.getFile().getBytes(),
                    ObjectUtils.asMap("resource_type","auto"));
            baiviet.setHinhAnh(r.get("resoure_url").toString());
            return "redirect:/";
        } catch (IOException ex) {
            System.err.println("== ADD BaiViet =="+ex.getMessage());
        }
        
        return "baiviet";
    
    }
}
