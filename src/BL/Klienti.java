/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dorron
 */
@Entity
@Table(name = "Klienti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klienti.findAll", query = "SELECT k FROM Klienti k")
    , @NamedQuery(name = "Klienti.findByIDKlienti", query = "SELECT k FROM Klienti k WHERE k.iDKlienti = :iDKlienti")
    , @NamedQuery(name = "Klienti.findByEmri", query = "SELECT k FROM Klienti k WHERE k.emri = :emri")
    , @NamedQuery(name = "Klienti.findByMbiemri", query = "SELECT k FROM Klienti k WHERE k.mbiemri = :mbiemri")
    , @NamedQuery(name = "Klienti.findByDitelindja", query = "SELECT k FROM Klienti k WHERE k.ditelindja = :ditelindja")
    , @NamedQuery(name = "Klienti.findByGjinija", query = "SELECT k FROM Klienti k WHERE k.gjinija = :gjinija")
    , @NamedQuery(name = "Klienti.findByShteti", query = "SELECT k FROM Klienti k WHERE k.shteti = :shteti")
    , @NamedQuery(name = "Klienti.findByQyteti", query = "SELECT k FROM Klienti k WHERE k.qyteti = :qyteti")
    , @NamedQuery(name = "Klienti.findByRruga", query = "SELECT k FROM Klienti k WHERE k.rruga = :rruga")
    , @NamedQuery(name = "Klienti.findByKodiPostar", query = "SELECT k FROM Klienti k WHERE k.kodiPostar = :kodiPostar")})
public class Klienti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Klienti")
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private Integer iDKlienti;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Basic(optional = false)
    @Column(name = "Ditelindja")
    @Temporal(TemporalType.DATE)
    private Date ditelindja;
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
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "klienti")
    private Bonuset bonuset;
    @OneToMany(mappedBy = "iDKlienti")
    private Collection<Faktura> fakturaCollection;
    @OneToMany(mappedBy = "iDKlienti")
    private Collection<Shitje> shitjeCollection;
    @OneToMany(mappedBy = "iDKlienti")
    private Collection<KontaktiKlienti> kontaktiKlientiCollection;

    public Klienti() {
    }

    public Klienti(Integer iDKlienti) {
        this.iDKlienti = iDKlienti;
    }

    public Klienti(Integer iDKlienti, String emri, String mbiemri, Date ditelindja, Character gjinija, String shteti, String qyteti, String rruga, int kodiPostar) {
        this.iDKlienti = iDKlienti;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.ditelindja = ditelindja;
        this.gjinija = gjinija;
        this.shteti = shteti;
        this.qyteti = qyteti;
        this.rruga = rruga;
        this.kodiPostar = kodiPostar;
    }

    public Integer getIDKlienti() {
        return iDKlienti;
    }

    public void setIDKlienti(Integer iDKlienti) {
        this.iDKlienti = iDKlienti;
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

    public Date getDitelindja() {
        return ditelindja;
    }

    public void setDitelindja(Date ditelindja) {
        this.ditelindja = ditelindja;
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

    public Bonuset getBonuset() {
        return bonuset;
    }

    public void setBonuset(Bonuset bonuset) {
        this.bonuset = bonuset;
    }

    @XmlTransient
    public Collection<Faktura> getFakturaCollection() {
        return fakturaCollection;
    }

    public void setFakturaCollection(Collection<Faktura> fakturaCollection) {
        this.fakturaCollection = fakturaCollection;
    }

    @XmlTransient
    public Collection<Shitje> getShitjeCollection() {
        return shitjeCollection;
    }

    public void setShitjeCollection(Collection<Shitje> shitjeCollection) {
        this.shitjeCollection = shitjeCollection;
    }

    @XmlTransient
    public Collection<KontaktiKlienti> getKontaktiKlientiCollection() {
        return kontaktiKlientiCollection;
    }

    public void setKontaktiKlientiCollection(Collection<KontaktiKlienti> kontaktiKlientiCollection) {
        this.kontaktiKlientiCollection = kontaktiKlientiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDKlienti != null ? iDKlienti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Klienti)) {
            return false;
        }
        Klienti other = (Klienti) object;
        if ((this.iDKlienti == null && other.iDKlienti != null) || (this.iDKlienti != null && !this.iDKlienti.equals(other.iDKlienti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID:"+this.getIDKlienti()+" "+this.getEmri()+" "+this.getMbiemri();
    }
    
}
