/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntt.repository;

import com.ntt.service.BaiViet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ThanhThuyen
 */
public interface BaiVietRepository {
     List<BaiViet> getBaiViets(Map<String, String> params);
}
