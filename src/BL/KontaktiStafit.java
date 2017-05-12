/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dorron
 */
@Entity
@Table(name = "Kontakti_Stafit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KontaktiStafit.findAll", query = "SELECT k FROM KontaktiStafit k")
    , @NamedQuery(name = "KontaktiStafit.findByIDKontaktiStafit", query = "SELECT k FROM KontaktiStafit k WHERE k.iDKontaktiStafit = :iDKontaktiStafit")
    , @NamedQuery(name = "KontaktiStafit.findByTel", query = "SELECT k FROM KontaktiStafit k WHERE k.tel = :tel")
    , @NamedQuery(name = "KontaktiStafit.findByEmail", query = "SELECT k FROM KontaktiStafit k WHERE k.email = :email")})
public class KontaktiStafit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Kontakti_Stafit")
    private Integer iDKontaktiStafit;
    @Basic(optional = false)
    @Column(name = "Tel")
    private String tel;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @JoinColumn(name = "ID_Stafi", referencedColumnName = "ID_Stafi")
    @ManyToOne
    private Stafi iDStafi;

    public KontaktiStafit() {
    }

    public KontaktiStafit(Integer iDKontaktiStafit) {
        this.iDKontaktiStafit = iDKontaktiStafit;
    }

    public KontaktiStafit(Integer iDKontaktiStafit, String tel, String email) {
        this.iDKontaktiStafit = iDKontaktiStafit;
        this.tel = tel;
        this.email = email;
    }

    public Integer getIDKontaktiStafit() {
        return iDKontaktiStafit;
    }

    public void setIDKontaktiStafit(Integer iDKontaktiStafit) {
        this.iDKontaktiStafit = iDKontaktiStafit;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Stafi getIDStafi() {
        return iDStafi;
    }

    public void setIDStafi(Stafi iDStafi) {
        this.iDStafi = iDStafi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDKontaktiStafit != null ? iDKontaktiStafit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KontaktiStafit)) {
            return false;
        }
        KontaktiStafit other = (KontaktiStafit) object;
        if ((this.iDKontaktiStafit == null && other.iDKontaktiStafit != null) || (this.iDKontaktiStafit != null && !this.iDKontaktiStafit.equals(other.iDKontaktiStafit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.KontaktiStafit[ iDKontaktiStafit=" + iDKontaktiStafit + " ]";
    }
    
}
