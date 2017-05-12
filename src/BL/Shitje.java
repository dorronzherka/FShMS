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
@Table(name = "Shitje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shitje.findAll", query = "SELECT s FROM Shitje s")
    , @NamedQuery(name = "Shitje.findByIDShitje", query = "SELECT s FROM Shitje s WHERE s.iDShitje = :iDShitje")
    , @NamedQuery(name = "Shitje.findBySasia", query = "SELECT s FROM Shitje s WHERE s.sasia = :sasia")})
public class Shitje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Shitje")
    private Integer iDShitje;
    @Basic(optional = false)
    @Column(name = "Sasia")
    private int sasia;
    @JoinColumn(name = "ID_Faktura", referencedColumnName = "ID_Faktura")
    @ManyToOne
    private Faktura iDFaktura;
    @JoinColumn(name = "ID_Klienti", referencedColumnName = "ID_Klienti")
    @ManyToOne
    private Klienti iDKlienti;
    @JoinColumn(name = "ID_Produkti", referencedColumnName = "ID_Produkti")
    @ManyToOne
    private Produkti iDProdukti;

    public Shitje() {
    }

    public Shitje(Integer iDShitje) {
        this.iDShitje = iDShitje;
    }

    public Shitje(Integer iDShitje, int sasia) {
        this.iDShitje = iDShitje;
        this.sasia = sasia;
    }

    public Integer getIDShitje() {
        return iDShitje;
    }

    public void setIDShitje(Integer iDShitje) {
        this.iDShitje = iDShitje;
    }

    public int getSasia() {
        return sasia;
    }

    public void setSasia(int sasia) {
        this.sasia = sasia;
    }

    public Faktura getIDFaktura() {
        return iDFaktura;
    }

    public void setIDFaktura(Faktura iDFaktura) {
        this.iDFaktura = iDFaktura;
    }

    public Klienti getIDKlienti() {
        return iDKlienti;
    }

    public void setIDKlienti(Klienti iDKlienti) {
        this.iDKlienti = iDKlienti;
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
        hash += (iDShitje != null ? iDShitje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shitje)) {
            return false;
        }
        Shitje other = (Shitje) object;
        if ((this.iDShitje == null && other.iDShitje != null) || (this.iDShitje != null && !this.iDShitje.equals(other.iDShitje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Shitje[ iDShitje=" + iDShitje + " ]";
    }
    
}
