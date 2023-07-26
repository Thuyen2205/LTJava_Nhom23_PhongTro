/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ThanhThuyen
 */
@Entity
@Table(name = "nha_tro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NhaTro.findAll", query = "SELECT n FROM NhaTro n"),
    @NamedQuery(name = "NhaTro.findById", query = "SELECT n FROM NhaTro n WHERE n.id = :id"),
    @NamedQuery(name = "NhaTro.findByDiaChi", query = "SELECT n FROM NhaTro n WHERE n.diaChi = :diaChi"),
    @NamedQuery(name = "NhaTro.findByDienTich", query = "SELECT n FROM NhaTro n WHERE n.dienTich = :dienTich"),
    @NamedQuery(name = "NhaTro.findByGia", query = "SELECT n FROM NhaTro n WHERE n.gia = :gia"),
    @NamedQuery(name = "NhaTro.findByHinhAnh", query = "SELECT n FROM NhaTro n WHERE n.hinhAnh = :hinhAnh"),
    @NamedQuery(name = "NhaTro.findBySoNguoi", query = "SELECT n FROM NhaTro n WHERE n.soNguoi = :soNguoi"),
    @NamedQuery(name = "NhaTro.findByTinhTrang", query = "SELECT n FROM NhaTro n WHERE n.tinhTrang = :tinhTrang"),
    @NamedQuery(name = "NhaTro.findByThongTinThem", query = "SELECT n FROM NhaTro n WHERE n.thongTinThem = :thongTinThem")})
public class NhaTro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "dia_chi")
    private String diaChi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "dien_tich")
    private String dienTich;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gia")
    private long gia;
    @Size(max = 45)
    @Column(name = "hinh_anh")
    private String hinhAnh;
    @Basic(optional = false)
    @NotNull
    @Column(name = "so_nguoi")
    private int soNguoi;
    @Column(name = "tinh_trang")
    private Short tinhTrang;
    @Size(max = 45)
    @Column(name = "thong_tin_them")
    private String thongTinThem;
    @OneToMany(mappedBy = "idNhaTro")
    private Set<BaiViet> baiVietSet;

    public NhaTro() {
    }

    public NhaTro(Integer id) {
        this.id = id;
    }

    public NhaTro(Integer id, String diaChi, String dienTich, long gia, int soNguoi) {
        this.id = id;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
        this.gia = gia;
        this.soNguoi = soNguoi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public Short getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Short tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getThongTinThem() {
        return thongTinThem;
    }

    public void setThongTinThem(String thongTinThem) {
        this.thongTinThem = thongTinThem;
    }

    @XmlTransient
    public Set<BaiViet> getBaiVietSet() {
        return baiVietSet;
    }

    public void setBaiVietSet(Set<BaiViet> baiVietSet) {
        this.baiVietSet = baiVietSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NhaTro)) {
            return false;
        }
        NhaTro other = (NhaTro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ntt.pojo.NhaTro[ id=" + id + " ]";
    }
    
}
