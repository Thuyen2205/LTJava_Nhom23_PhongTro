package com.ntt.pojo;

import com.ntt.pojo.BinhLuan;
import com.ntt.pojo.HinhAnh;
import com.ntt.pojo.NguoiDung;
import com.ntt.pojo.NhaTro;
import com.ntt.pojo.TinChoThue;
import com.ntt.pojo.TinTimTro;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-07-28T14:34:32")
@StaticMetamodel(BaiViet.class)
public class BaiViet_ { 

    public static volatile SingularAttribute<BaiViet, TinChoThue> tinChoThue;
    public static volatile SetAttribute<BaiViet, BinhLuan> binhLuanSet;
    public static volatile SingularAttribute<BaiViet, Date> ngayDang;
    public static volatile SetAttribute<BaiViet, HinhAnh> hinhAnhSet;
    public static volatile SingularAttribute<BaiViet, String> tenBai;
    public static volatile SingularAttribute<BaiViet, Integer> id;
    public static volatile SingularAttribute<BaiViet, String> tacGia;
    public static volatile SingularAttribute<BaiViet, TinTimTro> tinTimTro;
    public static volatile SingularAttribute<BaiViet, NguoiDung> idNguoiDung;
    public static volatile SingularAttribute<BaiViet, NhaTro> idNhaTro;

}