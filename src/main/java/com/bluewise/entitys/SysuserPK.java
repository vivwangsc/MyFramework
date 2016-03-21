package com.bluewise.entitys;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by wangshunchu on 16/3/12.
 */
public class SysuserPK implements Serializable {
    private int id;
    private String idcard;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "idcard", nullable = false, length = 20)
    @Id
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysuserPK sysuserPK = (SysuserPK) o;

        if (id != sysuserPK.id) return false;
        if (idcard != null ? !idcard.equals(sysuserPK.idcard) : sysuserPK.idcard != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idcard != null ? idcard.hashCode() : 0);
        return result;
    }
}
