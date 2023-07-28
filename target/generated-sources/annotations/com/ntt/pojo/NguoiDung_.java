package com.ntt.pojo;

import com.ntt.pojo.BaiViet;
import com.ntt.pojo.BinhLuan;
import com.ntt.pojo.ThongBao;
import com.ntt.pojo.TieuChi;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-07-28T14:34:32")
@StaticMetamodel(NguoiDung.class)
public class NguoiDung_ { 

    public static volatile SingularAttribute<NguoiDung, String> diaChi;
    public static volatile SingularAttribute<NguoiDung, String> sdt;
    public static volatile SetAttribute<NguoiDung, BinhLuan> binhLuanSet;
    public static volatile SetAttribute<NguoiDung, TieuChi> tieuChiSet;
    public static volatile SingularAttribute<NguoiDung, String> tenNguoiDung;
    public static volatile SingularAttribute<NguoiDung, Integer> idTaiKhoan;
    public static volatile SetAttribute<NguoiDung, ThongBao> thongBaoSet;
    public static volatile SetAttribute<NguoiDung, BaiViet> baiVietSet;
    public static volatile SingularAttribute<NguoiDung, Integer> id;
    public static volatile SingularAttribute<NguoiDung, Short> gioiTinh;
    public static volatile SingularAttribute<NguoiDung, String> email;

}