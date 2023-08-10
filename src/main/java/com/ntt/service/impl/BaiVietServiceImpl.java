/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.service.impl;

import com.ntt.pojo.BaiViet;
import com.ntt.repository.BaiVietRepository;
import com.ntt.service.BaiVietService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ThanhThuyen
 */
@Service
public class BaiVietServiceImpl implements BaiVietService{
    
    @Autowired
    private BaiVietRepository baiviet;
    
    @Override
    public List<BaiViet> getBaiViet() {
        return this.baiviet.getBaiViet();
    }

//    @Override
//    public boolean addBaiViet(BaiViet baiviet) {
//      return this.baiviet.addBaiViet(baiviet);
//    }
    
}
