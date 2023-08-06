package com.ntt.pojo;

import com.ntt.pojo.BaiViet;
import com.ntt.pojo.ThongBao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-06T22:12:15")
@StaticMetamodel(TinChoThue.class)
public class TinChoThue_ { 

    public static volatile SingularAttribute<TinChoThue, String> hinhAnh;
    public static volatile SingularAttribute<TinChoThue, BaiViet> baiViet;
    public static volatile SetAttribute<TinChoThue, ThongBao> thongBaoSet;
    public static volatile SingularAttribute<TinChoThue, Integer> idChoThue;
    public static volatile SingularAttribute<TinChoThue, String> thongTin;

}