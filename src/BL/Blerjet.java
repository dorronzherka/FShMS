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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "Blerjet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blerjet.findAll", query = "SELECT b FROM Blerjet b")
    , @NamedQuery(name = "Blerjet.findByIDBlerjet", query = "SELECT b FROM Blerjet b WHERE b.iDBlerjet = :iDBlerjet")
    , @NamedQuery(name = "Blerjet.findBySasia", query = "SELECT b FROM Blerjet b WHERE b.sasia = :sasia")
    , @NamedQuery(name = "Blerjet.findByCmimi", query = "SELECT b FROM Blerjet b WHERE b.cmimi = :cmimi")
    , @NamedQuery(name = "Blerjet.findByData", query = "SELECT b FROM Blerjet b WHERE b.data = :data")})
public class Blerjet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Blerjet")
    private Integer iDBlerjet;
    @Basic(optional = false)
    @Column(name = "Sasia")
    private int sasia;
    @Basic(optional = false)
    @Column(name = "Cmimi")
    private int cmimi;
    @Basic(optional = false)
    @Column(name = "Data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @JoinTable(name = "Blerjet_Prodhuesi", joinColumns = {
        @JoinColumn(name = "ID_Blerjet", referencedColumnName = "ID_Blerjet")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_Prodhuesi", referencedColumnName = "ID_Prodhuesi")})
    @ManyToMany
    private Collection<Prodhuesi> prodhuesiCollection;
    @JoinColumn(name = "ID_Kompania", referencedColumnName = "ID_Kompania")
    @ManyToOne
    private Kompania iDKompania;
    @JoinColumn(name = "ID_Produkti", referencedColumnName = "ID_Produkti")
    @ManyToOne
    private Produkti iDProdukti;

    public Blerjet() {
    }

    public Blerjet(Integer iDBlerjet) {
        this.iDBlerjet = iDBlerjet;
    }

    public Blerjet(Integer iDBlerjet, int sasia, int cmimi, Date data) {
        this.iDBlerjet = iDBlerjet;
        this.sasia = sasia;
        this.cmimi = cmimi;
        this.data = data;
    }

    public Integer getIDBlerjet() {
        return iDBlerjet;
    }

    public void setIDBlerjet(Integer iDBlerjet) {
        this.iDBlerjet = iDBlerjet;
    }

    public int getSasia() {
        return sasia;
    }

    public void setSasia(int sasia) {
        this.sasia = sasia;
    }

    public int getCmimi() {
        return cmimi;
    }

    public void setCmimi(int cmimi) {
        this.cmimi = cmimi;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @XmlTransient
    public Collection<Prodhuesi> getProdhuesiCollection() {
        return prodhuesiCollection;
    }

    public void setProdhuesiCollection(Collection<Prodhuesi> prodhuesiCollection) {
        this.prodhuesiCollection = prodhuesiCollection;
    }

    public Kompania getIDKompania() {
        return iDKompania;
    }

    public void setIDKompania(Kompania iDKompania) {
        this.iDKompania = iDKompania;
    }

    public Produkti getIDProdukti() {
        return iDProdukti;
    }

    public void setIDProdukti(Produkti iDProdukti) {
        this.iDProdukti = iDProdukti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBlerjet != null ? iDBlerjet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blerjet)) {
            return false;
        }
        Blerjet other = (Blerjet) object;
        if ((this.iDBlerjet == null && other.iDBlerjet != null) || (this.iDBlerjet != null && !this.iDBlerjet.equals(other.iDBlerjet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Blerjet[ iDBlerjet=" + iDBlerjet + " ]";
    }
    
}
