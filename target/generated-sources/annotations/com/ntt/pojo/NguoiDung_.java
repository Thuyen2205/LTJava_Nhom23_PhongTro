package com.ntt.pojo;

import com.ntt.pojo.BaiViet;
import com.ntt.pojo.BinhLuan;
import com.ntt.pojo.Follow;
import com.ntt.pojo.LoaiTaiKhoan;
import com.ntt.pojo.ThongBao;
import com.ntt.pojo.TieuChi;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-22T14:50:49")
@StaticMetamodel(NguoiDung.class)
public class NguoiDung_ { 

    public static volatile SingularAttribute<NguoiDung, String> tenTaiKhoan;
    public static volatile SingularAttribute<NguoiDung, String> sdt;
    public static volatile SingularAttribute<NguoiDung, String> matKhau;
    public static volatile SetAttribute<NguoiDung, TieuChi> tieuChiSet;
    public static volatile SingularAttribute<NguoiDung, String> tenNguoiDung;
    public static volatile SetAttribute<NguoiDung, BaiViet> baiVietSet;
    public static volatile SingularAttribute<NguoiDung, String> avatar;
    public static volatile SetAttribute<NguoiDung, Follow> followSet1;
    public static volatile SingularAttribute<NguoiDung, Date> ngayTao;
    public static volatile SingularAttribute<NguoiDung, String> hinhAnh;
    public static volatile SetAttribute<NguoiDung, BinhLuan> binhLuanSet;
    public static volatile SetAttribute<NguoiDung, ThongBao> thongBaoSet;
    public static volatile SetAttribute<NguoiDung, Follow> followSet;
    public static volatile SingularAttribute<NguoiDung, LoaiTaiKhoan> idLoaiTaiKhoan;
    public static volatile SingularAttribute<NguoiDung, Integer> id;
    public static volatile SingularAttribute<NguoiDung, String> email;

}