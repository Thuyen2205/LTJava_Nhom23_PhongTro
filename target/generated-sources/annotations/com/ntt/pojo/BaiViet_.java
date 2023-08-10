package com.ntt.pojo;

import com.ntt.pojo.BinhLuan;
import com.ntt.pojo.LoaiBaiViet;
import com.ntt.pojo.NguoiDung;
import com.ntt.pojo.ThongBao;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-10T13:22:44")
@StaticMetamodel(BaiViet.class)
public class BaiViet_ { 

    public static volatile SingularAttribute<BaiViet, String> hinhAnh;
    public static volatile SetAttribute<BaiViet, BinhLuan> binhLuanSet;
    public static volatile SingularAttribute<BaiViet, String> tenBaiViet;
    public static volatile SingularAttribute<BaiViet, String> phamViCanTim;
    public static volatile SingularAttribute<BaiViet, Date> ngayDang;
    public static volatile SetAttribute<BaiViet, ThongBao> thongBaoSet;
    public static volatile SingularAttribute<BaiViet, Integer> id;
    public static volatile SingularAttribute<BaiViet, String> noiDung;
    public static volatile SingularAttribute<BaiViet, NguoiDung> idNguoiDung;
    public static volatile SingularAttribute<BaiViet, LoaiBaiViet> loaiBaiViet;

}