/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dorron
 */
@Entity
@Table(name = "Ngjyra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ngjyra.findAll", query = "SELECT n FROM Ngjyra n")
    , @NamedQuery(name = "Ngjyra.findByIDNgjyra", query = "SELECT n FROM Ngjyra n WHERE n.iDNgjyra = :iDNgjyra")
    , @NamedQuery(name = "Ngjyra.findByNgjyra", query = "SELECT n FROM Ngjyra n WHERE n.ngjyra = :ngjyra")})
public class Ngjyra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Ngjyra")
    private Integer iDNgjyra;
    @Basic(optional = false)
    @Column(name = "Ngjyra")
    private String ngjyra;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "iDNgjyra")
    private Produkti produkti;

    public Ngjyra() {
    }

    public Ngjyra(Integer iDNgjyra) {
        this.iDNgjyra = iDNgjyra;
    }

    public Ngjyra(Integer iDNgjyra, String ngjyra) {
        this.iDNgjyra = iDNgjyra;
        this.ngjyra = ngjyra;
    }

    public Integer getIDNgjyra() {
        return iDNgjyra;
    }

    public void setIDNgjyra(Integer iDNgjyra) {
        this.iDNgjyra = iDNgjyra;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public Produkti getProdukti() {
        return produkti;
    }

    public void setProdukti(Produkti produkti) {
        this.produkti = produkti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDNgjyra != null ? iDNgjyra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ngjyra)) {
            return false;
        }
        Ngjyra other = (Ngjyra) object;
        if ((this.iDNgjyra == null && other.iDNgjyra != null) || (this.iDNgjyra != null && !this.iDNgjyra.equals(other.iDNgjyra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Ngjyra[ iDNgjyra=" + iDNgjyra + " ]";
    }
    
}
