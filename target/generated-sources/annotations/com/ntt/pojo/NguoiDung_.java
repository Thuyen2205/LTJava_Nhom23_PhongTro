package com.ntt.pojo;

import com.ntt.pojo.BaiViet;
import com.ntt.pojo.BinhLuan;
import com.ntt.pojo.ThongBao;
import com.ntt.pojo.TieuChi;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-06T22:12:15")
@StaticMetamodel(NguoiDung.class)
public class NguoiDung_ { 

    public static volatile SingularAttribute<NguoiDung, String> tenTaiKhoan;
    public static volatile SingularAttribute<NguoiDung, String> sdt;
    public static volatile SingularAttribute<NguoiDung, String> matKhau;
    public static volatile SetAttribute<NguoiDung, TieuChi> tieuChiSet;
    public static volatile SingularAttribute<NguoiDung, String> tenNguoiDung;
    public static volatile SetAttribute<NguoiDung, BaiViet> baiVietSet;
    public static volatile SingularAttribute<NguoiDung, String> gioiTinh;
    public static volatile SingularAttribute<NguoiDung, String> loaiTaiKhoan;
    public static volatile SingularAttribute<NguoiDung, String> diaChi;
    public static volatile SetAttribute<NguoiDung, BinhLuan> binhLuanSet;
    public static volatile SetAttribute<NguoiDung, ThongBao> thongBaoSet;
    public static volatile SingularAttribute<NguoiDung, Integer> id;
    public static volatile SingularAttribute<NguoiDung, String> email;

}