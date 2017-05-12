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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dorron
 */
@Entity
@Table(name = "Prodhuesi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prodhuesi.findAll", query = "SELECT p FROM Prodhuesi p")
    , @NamedQuery(name = "Prodhuesi.findByIDProdhuesi", query = "SELECT p FROM Prodhuesi p WHERE p.iDProdhuesi = :iDProdhuesi")
    , @NamedQuery(name = "Prodhuesi.findByEmriProdhuesit", query = "SELECT p FROM Prodhuesi p WHERE p.emriProdhuesit = :emriProdhuesit")
    , @NamedQuery(name = "Prodhuesi.findByShteti", query = "SELECT p FROM Prodhuesi p WHERE p.shteti = :shteti")
    , @NamedQuery(name = "Prodhuesi.findByQyteti", query = "SELECT p FROM Prodhuesi p WHERE p.qyteti = :qyteti")
    , @NamedQuery(name = "Prodhuesi.findByRruga", query = "SELECT p FROM Prodhuesi p WHERE p.rruga = :rruga")
    , @NamedQuery(name = "Prodhuesi.findByKodiPostar", query = "SELECT p FROM Prodhuesi p WHERE p.kodiPostar = :kodiPostar")})
public class Prodhuesi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Prodhuesi")
    private Integer iDProdhuesi;
    @Basic(optional = false)
    @Column(name = "Emri_Prodhuesit")
    private String emriProdhuesit;
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
    @ManyToMany(mappedBy = "prodhuesiCollection")
    private Collection<Blerjet> blerjetCollection;
    @OneToMany(mappedBy = "iDProdhuesi")
    private Collection<Produkti> produktiCollection;
    @OneToMany(mappedBy = "iDProdhuesi")
    private Collection<KontaktiProdhuesit> kontaktiProdhuesitCollection;

    public Prodhuesi() {
    }

    public Prodhuesi(Integer iDProdhuesi) {
        this.iDProdhuesi = iDProdhuesi;
    }

    public Prodhuesi(Integer iDProdhuesi, String emriProdhuesit, String shteti, String qyteti, String rruga, int kodiPostar) {
        this.iDProdhuesi = iDProdhuesi;
        this.emriProdhuesit = emriProdhuesit;
        this.shteti = shteti;
        this.qyteti = qyteti;
        this.rruga = rruga;
        this.kodiPostar = kodiPostar;
    }

    public Integer getIDProdhuesi() {
        return iDProdhuesi;
    }

    public void setIDProdhuesi(Integer iDProdhuesi) {
        this.iDProdhuesi = iDProdhuesi;
    }

    public String getEmriProdhuesit() {
        return emriProdhuesit;
    }

    public void setEmriProdhuesit(String emriProdhuesit) {
        this.emriProdhuesit = emriProdhuesit;
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
    public Collection<Blerjet> getBlerjetCollection() {
        return blerjetCollection;
    }

    public void setBlerjetCollection(Collection<Blerjet> blerjetCollection) {
        this.blerjetCollection = blerjetCollection;
    }

    @XmlTransient
    public Collection<Produkti> getProduktiCollection() {
        return produktiCollection;
    }

    public void setProduktiCollection(Collection<Produkti> produktiCollection) {
        this.produktiCollection = produktiCollection;
    }

    @XmlTransient
    public Collection<KontaktiProdhuesit> getKontaktiProdhuesitCollection() {
        return kontaktiProdhuesitCollection;
    }

    public void setKontaktiProdhuesitCollection(Collection<KontaktiProdhuesit> kontaktiProdhuesitCollection) {
        this.kontaktiProdhuesitCollection = kontaktiProdhuesitCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProdhuesi != null ? iDProdhuesi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prodhuesi)) {
            return false;
        }
        Prodhuesi other = (Prodhuesi) object;
        if ((this.iDProdhuesi == null && other.iDProdhuesi != null) || (this.iDProdhuesi != null && !this.iDProdhuesi.equals(other.iDProdhuesi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Prodhuesi[ iDProdhuesi=" + iDProdhuesi + " ]";
    }
    
}
