package com.bluewise.entitys;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by wangshunchu on 16/3/12.
 */
@Entity
public class Visitlog {
    private int id;
    private Integer customerid;
    private String idcard;
    private Date vdate;
    private String vtype;
    private String vremark;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customerid", nullable = true)
    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    @Basic
    @Column(name = "idcard", nullable = true, length = 20)
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "vdate", nullable = true)
    public Date getVdate() {
        return vdate;
    }

    public void setVdate(Date vdate) {
        this.vdate = vdate;
    }

    @Basic
    @Column(name = "vtype", nullable = true, length = 20)
    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    @Basic
    @Column(name = "vremark", nullable = true, length = 300)
    public String getVremark() {
        return vremark;
    }

    public void setVremark(String vremark) {
        this.vremark = vremark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Visitlog visitlog = (Visitlog) o;

        if (id != visitlog.id) return false;
        if (customerid != null ? !customerid.equals(visitlog.customerid) : visitlog.customerid != null) return false;
        if (idcard != null ? !idcard.equals(visitlog.idcard) : visitlog.idcard != null) return false;
        if (vdate != null ? !vdate.equals(visitlog.vdate) : visitlog.vdate != null) return false;
        if (vtype != null ? !vtype.equals(visitlog.vtype) : visitlog.vtype != null) return false;
        if (vremark != null ? !vremark.equals(visitlog.vremark) : visitlog.vremark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customerid != null ? customerid.hashCode() : 0);
        result = 31 * result + (idcard != null ? idcard.hashCode() : 0);
        result = 31 * result + (vdate != null ? vdate.hashCode() : 0);
        result = 31 * result + (vtype != null ? vtype.hashCode() : 0);
        result = 31 * result + (vremark != null ? vremark.hashCode() : 0);
        return result;
    }
}
