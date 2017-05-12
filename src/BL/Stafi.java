/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Stafi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stafi.findAll", query = "SELECT s FROM Stafi s")
    , @NamedQuery(name = "Stafi.findByIDStafi", query = "SELECT s FROM Stafi s WHERE s.iDStafi = :iDStafi")
    , @NamedQuery(name = "Stafi.findByEmri", query = "SELECT s FROM Stafi s WHERE s.emri = :emri")
    , @NamedQuery(name = "Stafi.findByMbiemri", query = "SELECT s FROM Stafi s WHERE s.mbiemri = :mbiemri")
    , @NamedQuery(name = "Stafi.findByMosha", query = "SELECT s FROM Stafi s WHERE s.mosha = :mosha")
    , @NamedQuery(name = "Stafi.findByGjinija", query = "SELECT s FROM Stafi s WHERE s.gjinija = :gjinija")
    , @NamedQuery(name = "Stafi.findByShteti", query = "SELECT s FROM Stafi s WHERE s.shteti = :shteti")
    , @NamedQuery(name = "Stafi.findByQyteti", query = "SELECT s FROM Stafi s WHERE s.qyteti = :qyteti")
    , @NamedQuery(name = "Stafi.findByRruga", query = "SELECT s FROM Stafi s WHERE s.rruga = :rruga")
    , @NamedQuery(name = "Stafi.findByKodiPostar", query = "SELECT s FROM Stafi s WHERE s.kodiPostar = :kodiPostar")})
public class Stafi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Stafi")
    private Integer iDStafi;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Basic(optional = false)
    @Column(name = "Mosha")
    private int mosha;
    @Basic(optional = false)
    @Column(name = "Gjinija")
    private Character gjinija;
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
    @JoinColumn(name = "ID_Kompania", referencedColumnName = "ID_Kompania")
    @ManyToOne
    private Kompania iDKompania;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "stafi")
    private Puntori puntori;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stafi")
    private Collection<Mengajeri> mengajeriCollection;
    @OneToMany(mappedBy = "iDStafi")
    private Collection<OrariStafi> orariStafiCollection;
    @OneToMany(mappedBy = "iDStafi")
    private Collection<Arka> arkaCollection;
    @OneToMany(mappedBy = "iDStafi")
    private Collection<KontaktiStafit> kontaktiStafitCollection;

    public Stafi() {
    }

    public Stafi(Integer iDStafi) {
        this.iDStafi = iDStafi;
    }

    public Stafi(Integer iDStafi, String emri, String mbiemri, int mosha, Character gjinija, String shteti, String qyteti, String rruga, int kodiPostar) {
        this.iDStafi = iDStafi;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.gjinija = gjinija;
        this.shteti = shteti;
        this.qyteti = qyteti;
        this.rruga = rruga;
        this.kodiPostar = kodiPostar;
    }

    public Integer getIDStafi() {
        return iDStafi;
    }

    public void setIDStafi(Integer iDStafi) {
        this.iDStafi = iDStafi;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public Character getGjinija() {
        return gjinija;
    }

    public void setGjinija(Character gjinija) {
        this.gjinija = gjinija;
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

    public Kompania getIDKompania() {
        return iDKompania;
    }

    public void setIDKompania(Kompania iDKompania) {
        this.iDKompania = iDKompania;
    }

    public Puntori getPuntori() {
        return puntori;
    }

    public void setPuntori(Puntori puntori) {
        this.puntori = puntori;
    }

    @XmlTransient
    public Collection<Mengajeri> getMengajeriCollection() {
        return mengajeriCollection;
    }

    public void setMengajeriCollection(Collection<Mengajeri> mengajeriCollection) {
        this.mengajeriCollection = mengajeriCollection;
    }

    @XmlTransient
    public Collection<OrariStafi> getOrariStafiCollection() {
        return orariStafiCollection;
    }

    public void setOrariStafiCollection(Collection<OrariStafi> orariStafiCollection) {
        this.orariStafiCollection = orariStafiCollection;
    }

    @XmlTransient
    public Collection<Arka> getArkaCollection() {
        return arkaCollection;
    }

    public void setArkaCollection(Collection<Arka> arkaCollection) {
        this.arkaCollection = arkaCollection;
    }

    @XmlTransient
    public Collection<KontaktiStafit> getKontaktiStafitCollection() {
        return kontaktiStafitCollection;
    }

    public void setKontaktiStafitCollection(Collection<KontaktiStafit> kontaktiStafitCollection) {
        this.kontaktiStafitCollection = kontaktiStafitCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDStafi != null ? iDStafi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stafi)) {
            return false;
        }
        Stafi other = (Stafi) object;
        if ((this.iDStafi == null && other.iDStafi != null) || (this.iDStafi != null && !this.iDStafi.equals(other.iDStafi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Stafi[ iDStafi=" + iDStafi + " ]";
    }
    
}
