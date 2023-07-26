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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ThanhThuyen
 */
@Entity
@Table(name = "tin_tim_tro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TinTimTro.findAll", query = "SELECT t FROM TinTimTro t"),
    @NamedQuery(name = "TinTimTro.findByIdTimTro", query = "SELECT t FROM TinTimTro t WHERE t.idTimTro = :idTimTro"),
    @NamedQuery(name = "TinTimTro.findByThongTin", query = "SELECT t FROM TinTimTro t WHERE t.thongTin = :thongTin"),
    @NamedQuery(name = "TinTimTro.findByPhamViDiaChi", query = "SELECT t FROM TinTimTro t WHERE t.phamViDiaChi = :phamViDiaChi")})
public class TinTimTro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tim_tro")
    private Integer idTimTro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "thong_tin")
    private String thongTin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pham_vi_dia_chi")
    private String phamViDiaChi;
    @JoinColumn(name = "id_tim_tro", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private BaiViet baiViet;

    public TinTimTro() {
    }

    public TinTimTro(Integer idTimTro) {
        this.idTimTro = idTimTro;
    }

    public TinTimTro(Integer idTimTro, String thongTin, String phamViDiaChi) {
        this.idTimTro = idTimTro;
        this.thongTin = thongTin;
        this.phamViDiaChi = phamViDiaChi;
    }

    public Integer getIdTimTro() {
        return idTimTro;
    }

    public void setIdTimTro(Integer idTimTro) {
        this.idTimTro = idTimTro;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public String getPhamViDiaChi() {
        return phamViDiaChi;
    }

    public void setPhamViDiaChi(String phamViDiaChi) {
        this.phamViDiaChi = phamViDiaChi;
    }

    public BaiViet getBaiViet() {
        return baiViet;
    }

    public void setBaiViet(BaiViet baiViet) {
        this.baiViet = baiViet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTimTro != null ? idTimTro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TinTimTro)) {
            return false;
        }
        TinTimTro other = (TinTimTro) object;
        if ((this.idTimTro == null && other.idTimTro != null) || (this.idTimTro != null && !this.idTimTro.equals(other.idTimTro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ntt.pojo.TinTimTro[ idTimTro=" + idTimTro + " ]";
    }
    
}
