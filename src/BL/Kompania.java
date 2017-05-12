/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dorron
 */
@Entity
@Table(name = "Kompania")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kompania.findAll", query = "SELECT k FROM Kompania k")
    , @NamedQuery(name = "Kompania.findByIDKompania", query = "SELECT k FROM Kompania k WHERE k.iDKompania = :iDKompania")
    , @NamedQuery(name = "Kompania.findByEmri", query = "SELECT k FROM Kompania k WHERE k.emri = :emri")
    , @NamedQuery(name = "Kompania.findByShteti", query = "SELECT k FROM Kompania k WHERE k.shteti = :shteti")
    , @NamedQuery(name = "Kompania.findByQyteti", query = "SELECT k FROM Kompania k WHERE k.qyteti = :qyteti")
    , @NamedQuery(name = "Kompania.findByRruga", query = "SELECT k FROM Kompania k WHERE k.rruga = :rruga")
    , @NamedQuery(name = "Kompania.findByKodiPostar", query = "SELECT k FROM Kompania k WHERE k.kodiPostar = :kodiPostar")})
public class Kompania implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Kompania")
    private Integer iDKompania;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Shteti")
    private String shteti;
    @Basic(optional = false)
    @Column(name = "Qyteti")
    private String qyteti;
    @Basic(optional = false)
    @Column(name = "Rruga")
    private String rruga;
    @Basic(optional = false)
    @Column(name = "Kodi_Postar")
    private int kodiPostar;
    @OneToMany(mappedBy = "iDKompania")
    private Collection<Stafi> stafiCollection;

    @OneToOne
    @JoinColumns({
        @JoinColumn(name = "ID_Mengajeri", referencedColumnName = "ID_Mengajeri"),
        @JoinColumn(name = "ID_Stoku", referencedColumnName = "ID_Stoku")
    })
    private Mengajeri iDMengajeri;
    
    @OneToOne
    private Stoku iDStoku;
    @OneToMany(mappedBy = "iDKompania")
    private Collection<Blerjet> blerjetCollection;
    @OneToMany(mappedBy = "iDKompania")
    private Collection<Faktura> fakturaCollection;
    @OneToMany(mappedBy = "iDKompania")
    private Collection<KontaktiKompania> kontaktiKompaniaCollection;

    public Kompania() {
    }

    public Kompania(Integer iDKompania) {
        this.iDKompania = iDKompania;
    }

    public Kompania(Integer iDKompania, String emri, String shteti, String qyteti, String rruga, int kodiPostar) {
        this.iDKompania = iDKompania;
        this.emri = emri;
        this.shteti = shteti;
        this.qyteti = qyteti;
        this.rruga = rruga;
        this.kodiPostar = kodiPostar;
    }

    public Integer getIDKompania() {
        return iDKompania;
    }

    public void setIDKompania(Integer iDKompania) {
        this.iDKompania = iDKompania;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getShteti() {
        return shteti;
    }

    public void setShteti(String shteti) {
        this.shteti = shteti;
    }

    public String getQyteti() {
        return qyteti;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }

    public String getRruga() {
        return rruga;
    }

    public void setRruga(String rruga) {
        this.rruga = rruga;
    }

    public int getKodiPostar() {
        return kodiPostar;
    }

    public void setKodiPostar(int kodiPostar) {
        this.kodiPostar = kodiPostar;
    }

    @XmlTransient
    public Collection<Stafi> getStafiCollection() {
        return stafiCollection;
    }

    public void setStafiCollection(Collection<Stafi> stafiCollection) {
        this.stafiCollection = stafiCollection;
    }

    public Mengajeri getIDMengajeri() {
        return iDMengajeri;
    }

    public void setIDMengajeri(Mengajeri iDMengajeri) {
        this.iDMengajeri = iDMengajeri;
    }

    public Stoku getIDStoku() {
        return iDStoku;
    }

    public void setIDStoku(Stoku iDStoku) {
        this.iDStoku = iDStoku;
    }

    @XmlTransient
    public Collection<Blerjet> getBlerjetCollection() {
        return blerjetCollection;
    }

    public void setBlerjetCollection(Collection<Blerjet> blerjetCollection) {
        this.blerjetCollection = blerjetCollection;
    }

    @XmlTransient
    public Collection<Faktura> getFakturaCollection() {
        return fakturaCollection;
    }

    public void setFakturaCollection(Collection<Faktura> fakturaCollection) {
        this.fakturaCollection = fakturaCollection;
    }

    @XmlTransient
    public Collection<KontaktiKompania> getKontaktiKompaniaCollection() {
        return kontaktiKompaniaCollection;
    }

    public void setKontaktiKompaniaCollection(Collection<KontaktiKompania> kontaktiKompaniaCollection) {
        this.kontaktiKompaniaCollection = kontaktiKompaniaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDKompania != null ? iDKompania.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kompania)) {
            return false;
        }
        Kompania other = (Kompania) object;
        if ((this.iDKompania == null && other.iDKompania != null) || (this.iDKompania != null && !this.iDKompania.equals(other.iDKompania))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Kompania[ iDKompania=" + iDKompania + " ]";
    }
    
}
