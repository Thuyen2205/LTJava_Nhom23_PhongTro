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
@Table(name = "thong_bao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ThongBao.findAll", query = "SELECT t FROM ThongBao t"),
    @NamedQuery(name = "ThongBao.findById", query = "SELECT t FROM ThongBao t WHERE t.id = :id"),
    @NamedQuery(name = "ThongBao.findByNoiDung", query = "SELECT t FROM ThongBao t WHERE t.noiDung = :noiDung"),
    @NamedQuery(name = "ThongBao.findByNgayThongBao", query = "SELECT t FROM ThongBao t WHERE t.ngayThongBao = :ngayThongBao")})
public class ThongBao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "noi_dung")
    private String noiDung;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ngay_thong_bao")
    private String ngayThongBao;
    @JoinColumn(name = "id_nguoi_dung", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private NguoiDung idNguoiDung;
    @JoinColumn(name = "id_cho_thue", referencedColumnName = "id_cho_thue")
    @ManyToOne(optional = false)
    private TinChoThue idChoThue;

    public ThongBao() {
    }

    public ThongBao(Integer id) {
        this.id = id;
    }

    public ThongBao(Integer id, String noiDung, String ngayThongBao) {
        this.id = id;
        this.noiDung = noiDung;
        this.ngayThongBao = ngayThongBao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNgayThongBao() {
        return ngayThongBao;
    }

    public void setNgayThongBao(String ngayThongBao) {
        this.ngayThongBao = ngayThongBao;
    }

    public NguoiDung getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(NguoiDung idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public TinChoThue getIdChoThue() {
        return idChoThue;
    }

    public void setIdChoThue(TinChoThue idChoThue) {
        this.idChoThue = idChoThue;
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
        if (!(object instanceof ThongBao)) {
            return false;
        }
        ThongBao other = (ThongBao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ntt.pojo.ThongBao[ id=" + id + " ]";
    }
    
}
