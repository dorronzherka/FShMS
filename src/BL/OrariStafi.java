/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dorron
 */
@Entity
@Table(name = "Orari_Stafi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrariStafi.findAll", query = "SELECT o FROM OrariStafi o")
    , @NamedQuery(name = "OrariStafi.findByIDOrari", query = "SELECT o FROM OrariStafi o WHERE o.iDOrari = :iDOrari")
    , @NamedQuery(name = "OrariStafi.findByData", query = "SELECT o FROM OrariStafi o WHERE o.data = :data")
    , @NamedQuery(name = "OrariStafi.findByKohaFillimit", query = "SELECT o FROM OrariStafi o WHERE o.kohaFillimit = :kohaFillimit")
    , @NamedQuery(name = "OrariStafi.findByKohaMbarimit", query = "SELECT o FROM OrariStafi o WHERE o.kohaMbarimit = :kohaMbarimit")})
public class OrariStafi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Orari")
    private Integer iDOrari;
    @Basic(optional = false)
    @Column(name = "Data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "Koha_Fillimit")
    @Temporal(TemporalType.TIME)
    private Date kohaFillimit;
    @Basic(optional = false)
    @Column(name = "Koha_Mbarimit")
    @Temporal(TemporalType.TIME)
    private Date kohaMbarimit;
    @JoinColumn(name = "ID_Stafi", referencedColumnName = "ID_Stafi")
    @ManyToOne
    private Stafi iDStafi;

    public OrariStafi() {
    }

    public OrariStafi(Integer iDOrari) {
        this.iDOrari = iDOrari;
    }

    public OrariStafi(Integer iDOrari, Date data, Date kohaFillimit, Date kohaMbarimit) {
        this.iDOrari = iDOrari;
        this.data = data;
        this.kohaFillimit = kohaFillimit;
        this.kohaMbarimit = kohaMbarimit;
    }

    public Integer getIDOrari() {
        return iDOrari;
    }

    public void setIDOrari(Integer iDOrari) {
        this.iDOrari = iDOrari;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getKohaFillimit() {
        return kohaFillimit;
    }

    public void setKohaFillimit(Date kohaFillimit) {
        this.kohaFillimit = kohaFillimit;
    }

    public Date getKohaMbarimit() {
        return kohaMbarimit;
    }

    public void setKohaMbarimit(Date kohaMbarimit) {
        this.kohaMbarimit = kohaMbarimit;
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
        hash += (iDOrari != null ? iDOrari.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrariStafi)) {
            return false;
        }
        OrariStafi other = (OrariStafi) object;
        if ((this.iDOrari == null && other.iDOrari != null) || (this.iDOrari != null && !this.iDOrari.equals(other.iDOrari))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.OrariStafi[ iDOrari=" + iDOrari + " ]";
    }
    
}
