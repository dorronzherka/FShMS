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
import javax.persistence.ManyToOne;
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
@Table(name = "Faktura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Faktura.findAll", query = "SELECT f FROM Faktura f")
    , @NamedQuery(name = "Faktura.findByIDFaktura", query = "SELECT f FROM Faktura f WHERE f.iDFaktura = :iDFaktura")
    , @NamedQuery(name = "Faktura.findByCmimiTotal", query = "SELECT f FROM Faktura f WHERE f.cmimiTotal = :cmimiTotal")})
public class Faktura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Faktura")
    private Integer iDFaktura;
    @Basic(optional = false)
    @Column(name = "Cmimi_Total")
    private int cmimiTotal;
    @JoinColumn(name = "ID_Klienti", referencedColumnName = "ID_Klienti")
    @ManyToOne
    private Klienti iDKlienti;
    @JoinColumn(name = "ID_Kompania", referencedColumnName = "ID_Kompania")
    @ManyToOne
    private Kompania iDKompania;
    @OneToMany(mappedBy = "iDFaktura")
    private Collection<Shitje> shitjeCollection;

    public Faktura() {
    }

    public Faktura(Integer iDFaktura) {
        this.iDFaktura = iDFaktura;
    }

    public Faktura(Integer iDFaktura, int cmimiTotal) {
        this.iDFaktura = iDFaktura;
        this.cmimiTotal = cmimiTotal;
    }

    public Integer getIDFaktura() {
        return iDFaktura;
    }

    public void setIDFaktura(Integer iDFaktura) {
        this.iDFaktura = iDFaktura;
    }

    public int getCmimiTotal() {
        return cmimiTotal;
    }

    public void setCmimiTotal(int cmimiTotal) {
        this.cmimiTotal = cmimiTotal;
    }

    public Klienti getIDKlienti() {
        return iDKlienti;
    }

    public void setIDKlienti(Klienti iDKlienti) {
        this.iDKlienti = iDKlienti;
    }

    public Kompania getIDKompania() {
        return iDKompania;
    }

    public void setIDKompania(Kompania iDKompania) {
        this.iDKompania = iDKompania;
    }

    @XmlTransient
    public Collection<Shitje> getShitjeCollection() {
        return shitjeCollection;
    }

    public void setShitjeCollection(Collection<Shitje> shitjeCollection) {
        this.shitjeCollection = shitjeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDFaktura != null ? iDFaktura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faktura)) {
            return false;
        }
        Faktura other = (Faktura) object;
        if ((this.iDFaktura == null && other.iDFaktura != null) || (this.iDFaktura != null && !this.iDFaktura.equals(other.iDFaktura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Faktura[ iDFaktura=" + iDFaktura + " ]";
    }
    
}
