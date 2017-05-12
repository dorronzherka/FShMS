/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author dorron
 */
@Embeddable
public class MengajeriPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_Stafi")
    private int iDStafi;
    @Basic(optional = false)
    @Column(name = "ID_Mengajeri")
    private int iDMengajeri;

    public MengajeriPK() {
    }

    public MengajeriPK(int iDStafi, int iDMengajeri) {
        this.iDStafi = iDStafi;
        this.iDMengajeri = iDMengajeri;
    }

    public int getIDStafi() {
        return iDStafi;
    }

    public void setIDStafi(int iDStafi) {
        this.iDStafi = iDStafi;
    }

    public int getIDMengajeri() {
        return iDMengajeri;
    }

    public void setIDMengajeri(int iDMengajeri) {
        this.iDMengajeri = iDMengajeri;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iDStafi;
        hash += (int) iDMengajeri;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MengajeriPK)) {
            return false;
        }
        MengajeriPK other = (MengajeriPK) object;
        if (this.iDStafi != other.iDStafi) {
            return false;
        }
        if (this.iDMengajeri != other.iDMengajeri) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BL.MengajeriPK[ iDStafi=" + iDStafi + ", iDMengajeri=" + iDMengajeri + " ]";
    }
    
}
