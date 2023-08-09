/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ThanhThuyen
 */
@Entity
@Table(name = "bai_viet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BaiViet.findAll", query = "SELECT b FROM BaiViet b"),
    @NamedQuery(name = "BaiViet.findById", query = "SELECT b FROM BaiViet b WHERE b.id = :id"),
    @NamedQuery(name = "BaiViet.findByNgayDang", query = "SELECT b FROM BaiViet b WHERE b.ngayDang = :ngayDang"),
    @NamedQuery(name = "BaiViet.findByTenBai", query = "SELECT b FROM BaiViet b WHERE b.tenBai = :tenBai"),
    @NamedQuery(name = "BaiViet.findByTacGia", query = "SELECT b FROM BaiViet b WHERE b.tacGia = :tacGia")})
public class BaiViet implements Serializable {

    /**
     * @return the file
     */
    public MultipartFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(MultipartFile file) {
        this.file = file;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ngay_dang")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngayDang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ten_bai")
    private String tenBai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tac_gia")
    private String tacGia;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "baiViet")
    private TinTimTro tinTimTro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBaiViet")
    private Set<BinhLuan> binhLuanSet;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "baiViet")
    private TinChoThue tinChoThue;
    @JoinColumn(name = "id_nguoi_dung", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private NguoiDung idNguoiDung;
    @JoinColumn(name = "id_nha_tro", referencedColumnName = "id")
    @ManyToOne
    private NhaTro idNhaTro;
    
    @Transient
    private MultipartFile file;

    public BaiViet() {
    }

    public BaiViet(Integer id) {
        this.id = id;
    }

    public BaiViet(Integer id, Date ngayDang, String tenBai, String tacGia) {
        this.id = id;
        this.ngayDang = ngayDang;
        this.tenBai = tenBai;
        this.tacGia = tacGia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(Date ngayDang) {
        this.ngayDang = ngayDang;
    }

    public String getTenBai() {
        return tenBai;
    }

    public void setTenBai(String tenBai) {
        this.tenBai = tenBai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public TinTimTro getTinTimTro() {
        return tinTimTro;
    }

    public void setTinTimTro(TinTimTro tinTimTro) {
        this.tinTimTro = tinTimTro;
    }

    @XmlTransient
    public Set<BinhLuan> getBinhLuanSet() {
        return binhLuanSet;
    }

    public void setBinhLuanSet(Set<BinhLuan> binhLuanSet) {
        this.binhLuanSet = binhLuanSet;
    }

    public TinChoThue getTinChoThue() {
        return tinChoThue;
    }

    public void setTinChoThue(TinChoThue tinChoThue) {
        this.tinChoThue = tinChoThue;
    }

    public NguoiDung getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(NguoiDung idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public NhaTro getIdNhaTro() {
        return idNhaTro;
    }

    public void setIdNhaTro(NhaTro idNhaTro) {
        this.idNhaTro = idNhaTro;
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
        if (!(object instanceof BaiViet)) {
            return false;
        }
        BaiViet other = (BaiViet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ntt.pojo.BaiViet[ id=" + id + " ]";
    }
    
}
