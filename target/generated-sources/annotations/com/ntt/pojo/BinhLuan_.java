package com.ntt.pojo;

import com.ntt.pojo.BaiViet;
import com.ntt.pojo.NguoiDung;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-12T11:22:57")
@StaticMetamodel(BinhLuan.class)
public class BinhLuan_ { 

    public static volatile SingularAttribute<BinhLuan, BaiViet> idBaiViet;
    public static volatile SingularAttribute<BinhLuan, Integer> id;
    public static volatile SingularAttribute<BinhLuan, Date> ngayBinhLuan;
    public static volatile SingularAttribute<BinhLuan, String> noiDung;
    public static volatile SingularAttribute<BinhLuan, NguoiDung> idNguoiDung;

}