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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "Puntori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puntori.findAll", query = "SELECT p FROM Puntori p")
    , @NamedQuery(name = "Puntori.findByIDStafi", query = "SELECT p FROM Puntori p WHERE p.iDStafi = :iDStafi")
    , @NamedQuery(name = "Puntori.findByPozita", query = "SELECT p FROM Puntori p WHERE p.pozita = :pozita")
    , @NamedQuery(name = "Puntori.findBySektori", query = "SELECT p FROM Puntori p WHERE p.sektori = :sektori")})
public class Puntori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Stafi")
    private Integer iDStafi;
    @Basic(optional = false)
    @Column(name = "Pozita")
    private String pozita;
    @Basic(optional = false)
    @Column(name = "Sektori")
    private String sektori;
   
    @ManyToOne(optional = false)
    @JoinColumns({ @JoinColumn(name = "ID_Mengajeri", referencedColumnName = "ID_Mengajeri"),
    @JoinColumn(name = "ID_Stafi", referencedColumnName = "ID_Stafi", insertable = false, updatable = false)
    })
    private Mengajeri iDMengajeri;
    
    @OneToOne(optional = false)
    private Stafi stafi;

    public Puntori() {
    }

    public Puntori(Integer iDStafi) {
        this.iDStafi = iDStafi;
    }

    public Puntori(Integer iDStafi, String pozita, String sektori) {
        this.iDStafi = iDStafi;
        this.pozita = pozita;
        this.sektori = sektori;
    }

    public Integer getIDStafi() {
        return iDStafi;
    }

    public void setIDStafi(Integer iDStafi) {
        this.iDStafi = iDStafi;
    }

    public String getPozita() {
        return pozita;
    }

    public void setPozita(String pozita) {
        this.pozita = pozita;
    }

    public String getSektori() {
        return sektori;
    }

    public void setSektori(String sektori) {
        this.sektori = sektori;
    }

    public Mengajeri getIDMengajeri() {
        return iDMengajeri;
    }

    public void setIDMengajeri(Mengajeri iDMengajeri) {
        this.iDMengajeri = iDMengajeri;
    }

    public Stafi getStafi() {
        return stafi;
    }

    public void setStafi(Stafi stafi) {
        this.stafi = stafi;
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
        if (!(object instanceof Puntori)) {
            return false;
        }
        Puntori other = (Puntori) object;
        if ((this.iDStafi == null && other.iDStafi != null) || (this.iDStafi != null && !this.iDStafi.equals(other.iDStafi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Puntori[ iDStafi=" + iDStafi + " ]";
    }
    
}
