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
@Table(name = "Stoku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stoku.findAll", query = "SELECT s FROM Stoku s")
    , @NamedQuery(name = "Stoku.findByIDStoku", query = "SELECT s FROM Stoku s WHERE s.iDStoku = :iDStoku")
    , @NamedQuery(name = "Stoku.findByEmri", query = "SELECT s FROM Stoku s WHERE s.emri = :emri")})
public class Stoku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Stoku")
    private Integer iDStoku;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @OneToMany(mappedBy = "iDStoku")
    private Collection<Produkti> produktiCollection;
    @OneToOne(mappedBy = "iDStoku")
    private Kompania kompania;

    public Stoku() {
    }

    public Stoku(Integer iDStoku) {
        this.iDStoku = iDStoku;
    }

    public Stoku(Integer iDStoku, String emri) {
        this.iDStoku = iDStoku;
        this.emri = emri;
    }

    public Integer getIDStoku() {
        return iDStoku;
    }

    public void setIDStoku(Integer iDStoku) {
        this.iDStoku = iDStoku;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    @XmlTransient
    public Collection<Produkti> getProduktiCollection() {
        return produktiCollection;
    }

    public void setProduktiCollection(Collection<Produkti> produktiCollection) {
        this.produktiCollection = produktiCollection;
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
        hash += (iDStoku != null ? iDStoku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stoku)) {
            return false;
        }
        Stoku other = (Stoku) object;
        if ((this.iDStoku == null && other.iDStoku != null) || (this.iDStoku != null && !this.iDStoku.equals(other.iDStoku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Stoku[ iDStoku=" + iDStoku + " ]";
    }
    
}
