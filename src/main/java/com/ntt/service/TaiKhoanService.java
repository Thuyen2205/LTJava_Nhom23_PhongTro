/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntt.service;

import com.ntt.pojo.TaiKhoan;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author ThanhThuyen
 */
public interface TaiKhoanService extends UserDetailsService {

    boolean addTaiKhoan(TaiKhoan taikhoan);

    List<TaiKhoan> getTaiKhoan(String username);

}
