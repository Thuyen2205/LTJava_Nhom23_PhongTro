/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntt.repository;

import com.ntt.pojo.TaiKhoan;
import java.util.List;

/**
 *
 * @author ThanhThuyen
 */
public interface TaiKhoanRepository {
    boolean addTaiKhoan(TaiKhoan taikhoan);
    List<TaiKhoan> getTaiKhoan(String username);
}
