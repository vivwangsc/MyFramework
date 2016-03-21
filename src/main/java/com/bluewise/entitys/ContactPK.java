package com.bluewise.entitys;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by wangshunchu on 16/3/12.
 */
public class ContactPK implements Serializable {
    private int id;
    private int customerid;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "customerid", nullable = false)
    @Id
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactPK contactPK = (ContactPK) o;

        if (id != contactPK.id) return false;
        if (customerid != contactPK.customerid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + customerid;
        return result;
    }
}
