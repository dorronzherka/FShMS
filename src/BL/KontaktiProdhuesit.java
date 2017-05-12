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
@Table(name = "Kontakti_Prodhuesit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KontaktiProdhuesit.findAll", query = "SELECT k FROM KontaktiProdhuesit k")
    , @NamedQuery(name = "KontaktiProdhuesit.findByIDKontaktiProdhuesit", query = "SELECT k FROM KontaktiProdhuesit k WHERE k.iDKontaktiProdhuesit = :iDKontaktiProdhuesit")
    , @NamedQuery(name = "KontaktiProdhuesit.findByTel1", query = "SELECT k FROM KontaktiProdhuesit k WHERE k.tel1 = :tel1")
    , @NamedQuery(name = "KontaktiProdhuesit.findByTel2", query = "SELECT k FROM KontaktiProdhuesit k WHERE k.tel2 = :tel2")
    , @NamedQuery(name = "KontaktiProdhuesit.findByTel3", query = "SELECT k FROM KontaktiProdhuesit k WHERE k.tel3 = :tel3")
    , @NamedQuery(name = "KontaktiProdhuesit.findByEmail1", query = "SELECT k FROM KontaktiProdhuesit k WHERE k.email1 = :email1")
    , @NamedQuery(name = "KontaktiProdhuesit.findByEmail2", query = "SELECT k FROM KontaktiProdhuesit k WHERE k.email2 = :email2")
    , @NamedQuery(name = "KontaktiProdhuesit.findByEmail3", query = "SELECT k FROM KontaktiProdhuesit k WHERE k.email3 = :email3")})
public class KontaktiProdhuesit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Kontakti_Prodhuesit")
    private Integer iDKontaktiProdhuesit;
    @Basic(optional = false)
    @Column(name = "Tel1")
    private String tel1;
    @Column(name = "Tel2")
    private String tel2;
    @Column(name = "Tel3")
    private String tel3;
    @Basic(optional = false)
    @Column(name = "Email1")
    private String email1;
    @Column(name = "Email2")
    private String email2;
    @Column(name = "Email3")
    private String email3;
    @JoinColumn(name = "ID_Prodhuesi", referencedColumnName = "ID_Prodhuesi")
    @ManyToOne
    private Prodhuesi iDProdhuesi;

    public KontaktiProdhuesit() {
    }

    public KontaktiProdhuesit(Integer iDKontaktiProdhuesit) {
        this.iDKontaktiProdhuesit = iDKontaktiProdhuesit;
    }

    public KontaktiProdhuesit(Integer iDKontaktiProdhuesit, String tel1, String email1) {
        this.iDKontaktiProdhuesit = iDKontaktiProdhuesit;
        this.tel1 = tel1;
        this.email1 = email1;
    }

    public Integer getIDKontaktiProdhuesit() {
        return iDKontaktiProdhuesit;
    }

    public void setIDKontaktiProdhuesit(Integer iDKontaktiProdhuesit) {
        this.iDKontaktiProdhuesit = iDKontaktiProdhuesit;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public Prodhuesi getIDProdhuesi() {
        return iDProdhuesi;
    }

    public void setIDProdhuesi(Prodhuesi iDProdhuesi) {
        this.iDProdhuesi = iDProdhuesi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDKontaktiProdhuesit != null ? iDKontaktiProdhuesit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KontaktiProdhuesit)) {
            return false;
        }
        KontaktiProdhuesit other = (KontaktiProdhuesit) object;
        if ((this.iDKontaktiProdhuesit == null && other.iDKontaktiProdhuesit != null) || (this.iDKontaktiProdhuesit != null && !this.iDKontaktiProdhuesit.equals(other.iDKontaktiProdhuesit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.KontaktiProdhuesit[ iDKontaktiProdhuesit=" + iDKontaktiProdhuesit + " ]";
    }
    
}
