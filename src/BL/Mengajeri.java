/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "Mengajeri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mengajeri.findAll", query = "SELECT m FROM Mengajeri m")
    , @NamedQuery(name = "Mengajeri.findByIDStafi", query = "SELECT m FROM Mengajeri m WHERE m.mengajeriPK.iDStafi = :iDStafi")
    , @NamedQuery(name = "Mengajeri.findByIDMengajeri", query = "SELECT m FROM Mengajeri m WHERE m.mengajeriPK.iDMengajeri = :iDMengajeri")
    , @NamedQuery(name = "Mengajeri.findBySektori", query = "SELECT m FROM Mengajeri m WHERE m.sektori = :sektori")})
public class Mengajeri implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MengajeriPK mengajeriPK;
    @Column(name = "Sektori")
    private String sektori;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMengajeri")
    private Collection<Puntori> puntoriCollection;
    @JoinColumn(name = "ID_Stafi", referencedColumnName = "ID_Stafi", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Stafi stafi;
    @OneToOne(mappedBy = "iDMengajeri")
    private Kompania kompania;

    public Mengajeri() {
    }

    public Mengajeri(MengajeriPK mengajeriPK) {
        this.mengajeriPK = mengajeriPK;
    }

    public Mengajeri(int iDStafi, int iDMengajeri) {
        this.mengajeriPK = new MengajeriPK(iDStafi, iDMengajeri);
    }

    public MengajeriPK getMengajeriPK() {
        return mengajeriPK;
    }

    public void setMengajeriPK(MengajeriPK mengajeriPK) {
        this.mengajeriPK = mengajeriPK;
    }

    public String getSektori() {
        return sektori;
    }

    public void setSektori(String sektori) {
        this.sektori = sektori;
    }

    @XmlTransient
    public Collection<Puntori> getPuntoriCollection() {
        return puntoriCollection;
    }

    public void setPuntoriCollection(Collection<Puntori> puntoriCollection) {
        this.puntoriCollection = puntoriCollection;
    }

    public Stafi getStafi() {
        return stafi;
    }

    public void setStafi(Stafi stafi) {
        this.stafi = stafi;
    }

    public Kompania getKompania() {
        return kompania;
    }

    public void setKompania(Kompania kompania) {
        this.kompania = kompania;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mengajeriPK != null ? mengajeriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mengajeri)) {
            return false;
        }
        Mengajeri other = (Mengajeri) object;
        if ((this.mengajeriPK == null && other.mengajeriPK != null) || (this.mengajeriPK != null && !this.mengajeriPK.equals(other.mengajeriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Mengajeri[ mengajeriPK=" + mengajeriPK + " ]";
    }
    
}
