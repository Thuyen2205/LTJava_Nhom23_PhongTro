/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
@Table(name = "tin_cho_thue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TinChoThue.findAll", query = "SELECT t FROM TinChoThue t"),
    @NamedQuery(name = "TinChoThue.findByIdChoThue", query = "SELECT t FROM TinChoThue t WHERE t.idChoThue = :idChoThue"),
    @NamedQuery(name = "TinChoThue.findByHinhAnh", query = "SELECT t FROM TinChoThue t WHERE t.hinhAnh = :hinhAnh"),
    @NamedQuery(name = "TinChoThue.findByThongTin", query = "SELECT t FROM TinChoThue t WHERE t.thongTin = :thongTin")})
public class TinChoThue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cho_thue")
    private Integer idChoThue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "hinh_anh")
    private String hinhAnh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "thong_tin")
    private String thongTin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idChoThue")
    private Set<ThongBao> thongBaoSet;
    @JoinColumn(name = "id_cho_thue", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private BaiViet baiViet;
    @Transient
    private MultipartFile file;

    public TinChoThue() {
    }

    public TinChoThue(Integer idChoThue) {
        this.idChoThue = idChoThue;
    }

    public TinChoThue(Integer idChoThue, String hinhAnh, String thongTin) {
        this.idChoThue = idChoThue;
        this.hinhAnh = hinhAnh;
        this.thongTin = thongTin;
    }

    public Integer getIdChoThue() {
        return idChoThue;
    }

    public void setIdChoThue(Integer idChoThue) {
        this.idChoThue = idChoThue;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    @XmlTransient
    public Set<ThongBao> getThongBaoSet() {
        return thongBaoSet;
    }

    public void setThongBaoSet(Set<ThongBao> thongBaoSet) {
        this.thongBaoSet = thongBaoSet;
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
        hash += (idChoThue != null ? idChoThue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TinChoThue)) {
            return false;
        }
        TinChoThue other = (TinChoThue) object;
        if ((this.idChoThue == null && other.idChoThue != null) || (this.idChoThue != null && !this.idChoThue.equals(other.idChoThue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ntt.pojo.TinChoThue[ idChoThue=" + idChoThue + " ]";
    }

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
    
}
