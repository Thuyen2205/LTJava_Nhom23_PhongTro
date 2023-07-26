/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ThanhThuyen
 */
@Entity
@Table(name = "tieu_chi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TieuChi.findAll", query = "SELECT t FROM TieuChi t"),
    @NamedQuery(name = "TieuChi.findById", query = "SELECT t FROM TieuChi t WHERE t.id = :id"),
    @NamedQuery(name = "TieuChi.findBySoLuongNguoi", query = "SELECT t FROM TieuChi t WHERE t.soLuongNguoi = :soLuongNguoi"),
    @NamedQuery(name = "TieuChi.findByGiaThapNhat", query = "SELECT t FROM TieuChi t WHERE t.giaThapNhat = :giaThapNhat"),
    @NamedQuery(name = "TieuChi.findByGiaCaoNhat", query = "SELECT t FROM TieuChi t WHERE t.giaCaoNhat = :giaCaoNhat")})
public class TieuChi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "so_luong_nguoi")
    private String soLuongNguoi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gia_thap_nhat")
    private long giaThapNhat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gia_cao_nhat")
    private long giaCaoNhat;
    @JoinColumn(name = "id_nguoi_dung", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private NguoiDung idNguoiDung;

    public TieuChi() {
    }

    public TieuChi(Integer id) {
        this.id = id;
    }

    public TieuChi(Integer id, String soLuongNguoi, long giaThapNhat, long giaCaoNhat) {
        this.id = id;
        this.soLuongNguoi = soLuongNguoi;
        this.giaThapNhat = giaThapNhat;
        this.giaCaoNhat = giaCaoNhat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(String soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public long getGiaThapNhat() {
        return giaThapNhat;
    }

    public void setGiaThapNhat(long giaThapNhat) {
        this.giaThapNhat = giaThapNhat;
    }

    public long getGiaCaoNhat() {
        return giaCaoNhat;
    }

    public void setGiaCaoNhat(long giaCaoNhat) {
        this.giaCaoNhat = giaCaoNhat;
    }

    public NguoiDung getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(NguoiDung idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
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
        if (!(object instanceof TieuChi)) {
            return false;
        }
        TieuChi other = (TieuChi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ntt.pojo.TieuChi[ id=" + id + " ]";
    }
    
}
