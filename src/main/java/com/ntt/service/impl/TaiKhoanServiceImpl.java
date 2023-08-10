/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.service.impl;

import com.ntt.pojo.LoaiTaiKhoan;
import com.ntt.pojo.NguoiDung;
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
    public boolean addTaiKhoan(NguoiDung nguoidung) {
        
        String pass=nguoidung.getMatKhau(); 
        nguoidung.setMatKhau(this.passwordEncoder.encode(pass));
//        nguoidung.setLoaiTaiKhoan(NguoiDung.KhachHang);
        return this.taikhoanRepository.addTaiKhoan(nguoidung);
    }

    @Override
    public List<NguoiDung> getTaiKhoan(String username) {
      return this.taikhoanRepository.getTaiKhoan(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       List<NguoiDung> taikhoans=this.getTaiKhoan(username);
       
       if(taikhoans.isEmpty())
       {
           throw new UsernameNotFoundException("Tai Khoan Khong Ton Tại!!!");
       }
       NguoiDung taikhoan=taikhoans.get(0);
       
       Set<GrantedAuthority> auth= new HashSet<>();
       auth.add(new SimpleGrantedAuthority(taikhoan.getIdLoaiTaiKhoan().getTenLoaiTaiKhoan()));
       
       return new org.springframework.security.core.userdetails.User(taikhoan.getTenTaiKhoan(),taikhoan.getMatKhau(),auth);
       
    }

    @Override
    public LoaiTaiKhoan getLoaiTaiKhoan(String tenLoaiTaiKhoan) {
      return this.taikhoanRepository.getLoaiTaiKhoan(tenLoaiTaiKhoan);
    }
//      @Override
//    public UserRole getRoleBenhNhan(String role) {
//        return this.taiKhoanRepository.getRoleBenhNhan(role);
//    }
}
