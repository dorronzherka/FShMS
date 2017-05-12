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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dorron
 */
@Entity
@Table(name = "Produkti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produkti.findAll", query = "SELECT p FROM Produkti p")
    , @NamedQuery(name = "Produkti.findByIDProdukti", query = "SELECT p FROM Produkti p WHERE p.iDProdukti = :iDProdukti")
    , @NamedQuery(name = "Produkti.findByBarkodi", query = "SELECT p FROM Produkti p WHERE p.barkodi = :barkodi")
    , @NamedQuery(name = "Produkti.findByEmri", query = "SELECT p FROM Produkti p WHERE p.emri = :emri")
    , @NamedQuery(name = "Produkti.findByMadhesia", query = "SELECT p FROM Produkti p WHERE p.madhesia = :madhesia")
    , @NamedQuery(name = "Produkti.findByGjinija", query = "SELECT p FROM Produkti p WHERE p.gjinija = :gjinija")
    , @NamedQuery(name = "Produkti.findBySasia", query = "SELECT p FROM Produkti p WHERE p.sasia = :sasia")
    , @NamedQuery(name = "Produkti.findByCmimi", query = "SELECT p FROM Produkti p WHERE p.cmimi = :cmimi")})
public class Produkti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Produkti")
    private Integer iDProdukti;
    @Basic(optional = false)
    @Column(name = "Barkodi")
    private int barkodi;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Madhesia")
    private String madhesia;
    @Basic(optional = false)
    @Column(name = "Gjinija")
    private Character gjinija;
    @Basic(optional = false)
    @Column(name = "Sasia")
    private int sasia;
    @Basic(optional = false)
    @Column(name = "Cmimi")
    private int cmimi;
    @JoinColumn(name = "ID_Ngjyra", referencedColumnName = "ID_Ngjyra")
    @OneToOne(optional = false)
    private Ngjyra iDNgjyra;
    @JoinColumn(name = "ID_Prodhuesi", referencedColumnName = "ID_Prodhuesi")
    @ManyToOne
    private Prodhuesi iDProdhuesi;
    @JoinColumn(name = "ID_Stoku", referencedColumnName = "ID_Stoku")
    @ManyToOne
    private Stoku iDStoku;
    @OneToMany(mappedBy = "iDProdukti")
    private Collection<Blerjet> blerjetCollection;
    @OneToMany(mappedBy = "iDProdukti")
    private Collection<Shitje> shitjeCollection;

    public Produkti() {
    }

    public Produkti(Integer iDProdukti) {
        this.iDProdukti = iDProdukti;
    }

    public Produkti(Integer iDProdukti, int barkodi, String emri, String madhesia, Character gjinija, int sasia, int cmimi) {
        this.iDProdukti = iDProdukti;
        this.barkodi = barkodi;
        this.emri = emri;
        this.madhesia = madhesia;
        this.gjinija = gjinija;
        this.sasia = sasia;
        this.cmimi = cmimi;
    }

    public Integer getIDProdukti() {
        return iDProdukti;
    }

    public void setIDProdukti(Integer iDProdukti) {
        this.iDProdukti = iDProdukti;
    }

    public int getBarkodi() {
        return barkodi;
    }

    public void setBarkodi(int barkodi) {
        this.barkodi = barkodi;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMadhesia() {
        return madhesia;
    }

    public void setMadhesia(String madhesia) {
        this.madhesia = madhesia;
    }

    public Character getGjinija() {
        return gjinija;
    }

    public void setGjinija(Character gjinija) {
        this.gjinija = gjinija;
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

    public Ngjyra getIDNgjyra() {
        return iDNgjyra;
    }

    public void setIDNgjyra(Ngjyra iDNgjyra) {
        this.iDNgjyra = iDNgjyra;
    }

    public Prodhuesi getIDProdhuesi() {
        return iDProdhuesi;
    }

    public void setIDProdhuesi(Prodhuesi iDProdhuesi) {
        this.iDProdhuesi = iDProdhuesi;
    }

    public Stoku getIDStoku() {
        return iDStoku;
    }

    public void setIDStoku(Stoku iDStoku) {
        this.iDStoku = iDStoku;
    }

    @XmlTransient
    public Collection<Blerjet> getBlerjetCollection() {
        return blerjetCollection;
    }

    public void setBlerjetCollection(Collection<Blerjet> blerjetCollection) {
        this.blerjetCollection = blerjetCollection;
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
        hash += (iDProdukti != null ? iDProdukti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produkti)) {
            return false;
        }
        Produkti other = (Produkti) object;
        if ((this.iDProdukti == null && other.iDProdukti != null) || (this.iDProdukti != null && !this.iDProdukti.equals(other.iDProdukti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.Produkti[ iDProdukti=" + iDProdukti + " ]";
    }
    
}
