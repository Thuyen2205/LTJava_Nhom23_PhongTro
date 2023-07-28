/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.service.impl;

import com.ntt.pojo.TaiKhoan;
import com.ntt.repository.TaiKhoanRepository;
import com.ntt.service.TaiKhoanService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author ThanhThuyen
 */
@Service("taikhoanDetailsService")
public class TaiKhoanServiceImpl implements TaiKhoanService{
    @Autowired
    private TaiKhoanRepository taikhoanRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public boolean addTaiKhoan(TaiKhoan taikhoan) {
        
        String pass=taikhoan.getMatKhau(); 
        taikhoan.setMatKhau(this.passwordEncoder.encode(pass));
        taikhoan.setLoaiTaiKhoan(TaiKhoan.KhachHang);
       return this.taikhoanRepository.addTaiKhoan(taikhoan);
    }

    @Override
    public List<TaiKhoan> getTaiKhoan(String username) {
      return this.taikhoanRepository.getTaiKhoan(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       List<TaiKhoan> taikhoans=this.getTaiKhoan(username);
       
       if(taikhoans.isEmpty())
       {
           throw new UsernameNotFoundException("Tai Khoan Khong Ton Tại!!!");
       }
       TaiKhoan taikhoan=taikhoans.get(0);
       
       Set<GrantedAuthority> auth= new HashSet<>();
       auth.add(new SimpleGrantedAuthority(taikhoan.getLoaiTaiKhoan()));
       
       return new org.springframework.security.core.userdetails.User(taikhoan.getTenTaiKhoan(),taikhoan.getMatKhau(),auth);
       
    }
    
}
