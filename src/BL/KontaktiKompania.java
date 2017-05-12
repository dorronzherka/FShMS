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
@Table(name = "Kontakti_Kompania")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KontaktiKompania.findAll", query = "SELECT k FROM KontaktiKompania k")
    , @NamedQuery(name = "KontaktiKompania.findByIDKontaktiKompanis", query = "SELECT k FROM KontaktiKompania k WHERE k.iDKontaktiKompanis = :iDKontaktiKompanis")
    , @NamedQuery(name = "KontaktiKompania.findByTel", query = "SELECT k FROM KontaktiKompania k WHERE k.tel = :tel")
    , @NamedQuery(name = "KontaktiKompania.findByEmail", query = "SELECT k FROM KontaktiKompania k WHERE k.email = :email")})
public class KontaktiKompania implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Kontakti_Kompanis")
    private Integer iDKontaktiKompanis;
    @Basic(optional = false)
    @Column(name = "Tel")
    private String tel;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @JoinColumn(name = "ID_Kompania", referencedColumnName = "ID_Kompania")
    @ManyToOne
    private Kompania iDKompania;

    public KontaktiKompania() {
    }

    public KontaktiKompania(Integer iDKontaktiKompanis) {
        this.iDKontaktiKompanis = iDKontaktiKompanis;
    }

    public KontaktiKompania(Integer iDKontaktiKompanis, String tel, String email) {
        this.iDKontaktiKompanis = iDKontaktiKompanis;
        this.tel = tel;
        this.email = email;
    }

    public Integer getIDKontaktiKompanis() {
        return iDKontaktiKompanis;
    }

    public void setIDKontaktiKompanis(Integer iDKontaktiKompanis) {
        this.iDKontaktiKompanis = iDKontaktiKompanis;
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

    public Kompania getIDKompania() {
        return iDKompania;
    }

    public void setIDKompania(Kompania iDKompania) {
        this.iDKompania = iDKompania;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDKontaktiKompanis != null ? iDKontaktiKompanis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KontaktiKompania)) {
            return false;
        }
        KontaktiKompania other = (KontaktiKompania) object;
        if ((this.iDKontaktiKompanis == null && other.iDKontaktiKompanis != null) || (this.iDKontaktiKompanis != null && !this.iDKontaktiKompanis.equals(other.iDKontaktiKompanis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.KontaktiKompania[ iDKontaktiKompanis=" + iDKontaktiKompanis + " ]";
    }
    
}
