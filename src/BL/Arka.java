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
@Table(name = "Arka")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arka.findAll", query = "SELECT a FROM Arka a")
    , @NamedQuery(name = "Arka.findByIDArka", query = "SELECT a FROM Arka a WHERE a.iDArka = :iDArka")})
public class Arka implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Arka")
    private Integer iDArka;
    @JoinColumn(name = "ID_Stafi", referencedColumnName = "ID_Stafi")
    @ManyToOne
    private Stafi iDStafi;

    public Arka() {
    }

    public Arka(Integer iDArka) {
        this.iDArka = iDArka;
    }

    public Integer getIDArka() {
        return iDArka;
    }

    public void setIDArka(Integer iDArka) {
        this.iDArka = iDArka;
    }

    public Stafi getIDStafi() {
        return iDStafi;
    }

    public void setIDStafi(Stafi iDStafi) {
        this.iDStafi = iDStafi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDArka != null ? iDArka.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arka)) {
            return false;
        }
        Arka other = (Arka) object;
        if ((this.iDArka == null && other.iDArka != null) || (this.iDArka != null && !this.iDArka.equals(other.iDArka))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Arka[ iDArka=" + iDArka + " ]";
    }
    
}
