package com.ntt.pojo;

import com.ntt.pojo.NguoiDung;
import com.ntt.pojo.TinChoThue;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-09T14:51:09")
@StaticMetamodel(ThongBao.class)
public class ThongBao_ { 

    public static volatile SingularAttribute<ThongBao, TinChoThue> idChoThue;
    public static volatile SingularAttribute<ThongBao, String> ngayThongBao;
    public static volatile SingularAttribute<ThongBao, Integer> id;
    public static volatile SingularAttribute<ThongBao, String> noiDung;
    public static volatile SingularAttribute<ThongBao, NguoiDung> idNguoiDung;

}