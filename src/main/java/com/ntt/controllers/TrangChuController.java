/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ThanhThuyen
 */
@Controller
@Transactional
public class TrangChuController {

    @Autowired
    private LocalSessionFactoryBean facrory;

    @RequestMapping("/trangchu")
    public String trangchu() {
        return "trangchu";
    }
}
