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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dorron
 */
@Entity
@Table(name = "Kontakti_Klienti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KontaktiKlienti.findAll", query = "SELECT k FROM KontaktiKlienti k")
    , @NamedQuery(name = "KontaktiKlienti.findByIDKontaktiKlienti", query = "SELECT k FROM KontaktiKlienti k WHERE k.iDKontaktiKlienti = :iDKontaktiKlienti")
    , @NamedQuery(name = "KontaktiKlienti.findByTel", query = "SELECT k FROM KontaktiKlienti k WHERE k.tel = :tel")
    , @NamedQuery(name = "KontaktiKlienti.findByEmail", query = "SELECT k FROM KontaktiKlienti k WHERE k.email = :email")})
public class KontaktiKlienti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Kontakti_Klienti")
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private Integer iDKontaktiKlienti;
    @Basic(optional = false)
    @Column(name = "Tel")
    private String tel;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @JoinColumn(name = "ID_Klienti", referencedColumnName = "ID_Klienti")
    @ManyToOne
    private Klienti iDKlienti;

    public KontaktiKlienti() {
    }

    public KontaktiKlienti(Integer iDKontaktiKlienti) {
        this.iDKontaktiKlienti = iDKontaktiKlienti;
    }

    public KontaktiKlienti(Integer iDKontaktiKlienti, String tel, String email) {
        this.iDKontaktiKlienti = iDKontaktiKlienti;
        this.tel = tel;
        this.email = email;
    }

    public Integer getIDKontaktiKlienti() {
        return iDKontaktiKlienti;
    }

    public void setIDKontaktiKlienti(Integer iDKontaktiKlienti) {
        this.iDKontaktiKlienti = iDKontaktiKlienti;
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

    public Klienti getIDKlienti() {
        return iDKlienti;
    }

    public void setIDKlienti(Klienti iDKlienti) {
        this.iDKlienti = iDKlienti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDKontaktiKlienti != null ? iDKontaktiKlienti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KontaktiKlienti)) {
            return false;
        }
        KontaktiKlienti other = (KontaktiKlienti) object;
        if ((this.iDKontaktiKlienti == null && other.iDKontaktiKlienti != null) || (this.iDKontaktiKlienti != null && !this.iDKontaktiKlienti.equals(other.iDKontaktiKlienti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.KontaktiKlienti[ iDKontaktiKlienti=" + iDKontaktiKlienti + " ]";
    }
    
}
