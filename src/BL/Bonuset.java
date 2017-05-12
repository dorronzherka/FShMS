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
@Table(name = "Bonuset")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bonuset.findAll", query = "SELECT b FROM Bonuset b")
    , @NamedQuery(name = "Bonuset.findByIDKlienti", query = "SELECT b FROM Bonuset b WHERE b.iDKlienti = :iDKlienti")
    , @NamedQuery(name = "Bonuset.findByPiket", query = "SELECT b FROM Bonuset b WHERE b.piket = :piket")})
public class Bonuset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Klienti")
    private Integer iDKlienti;
    @Basic(optional = false)
    @Column(name = "Piket")
    private int piket;
    @JoinColumn(name = "ID_Klienti", referencedColumnName = "ID_Klienti", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Klienti klienti;

    public Bonuset() {
    }

    public Bonuset(Integer iDKlienti) {
        this.iDKlienti = iDKlienti;
    }

    public Bonuset(Integer iDKlienti, int piket) {
        this.iDKlienti = iDKlienti;
        this.piket = piket;
    }

    public Integer getIDKlienti() {
        return iDKlienti;
    }

    public void setIDKlienti(Integer iDKlienti) {
        this.iDKlienti = iDKlienti;
    }

    public int getPiket() {
        return piket;
    }

    public void setPiket(int piket) {
        this.piket = piket;
    }

    public Klienti getKlienti() {
        return klienti;
    }

    public void setKlienti(Klienti klienti) {
        this.klienti = klienti;
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
        if (!(object instanceof Bonuset)) {
            return false;
        }
        Bonuset other = (Bonuset) object;
        if ((this.iDKlienti == null && other.iDKlienti != null) || (this.iDKlienti != null && !this.iDKlienti.equals(other.iDKlienti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Bonuset[ iDKlienti=" + iDKlienti + " ]";
    }
    
}
