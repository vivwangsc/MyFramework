package com.bluewise.entitys;

import javax.persistence.*;

/**
 * Created by wangshunchu on 16/3/12.
 */
@Entity
@Table(name = "systemdef", schema = "test1", catalog = "")
public class Systemdef {
    private int id;
    private String name;
    private int parentid;
    private String iconCls;
    private int ptopid;
    private Integer pthird;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "parentid", nullable = false)
    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    @Basic
    @Column(name = "iconCls", nullable = true, length = 20)
    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @Basic
    @Column(name = "ptopid", nullable = false)
    public int getPtopid() {
        return ptopid;
    }

    public void setPtopid(int ptopid) {
        this.ptopid = ptopid;
    }

    @Basic
    @Column(name = "pthird", nullable = true)
    public Integer getPthird() {
        return pthird;
    }

    public void setPthird(Integer pthird) {
        this.pthird = pthird;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Systemdef systemdef = (Systemdef) o;

        if (id != systemdef.id) return false;
        if (parentid != systemdef.parentid) return false;
        if (ptopid != systemdef.ptopid) return false;
        if (name != null ? !name.equals(systemdef.name) : systemdef.name != null) return false;
        if (iconCls != null ? !iconCls.equals(systemdef.iconCls) : systemdef.iconCls != null) return false;
        if (pthird != null ? !pthird.equals(systemdef.pthird) : systemdef.pthird != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + parentid;
        result = 31 * result + (iconCls != null ? iconCls.hashCode() : 0);
        result = 31 * result + ptopid;
        result = 31 * result + (pthird != null ? pthird.hashCode() : 0);
        return result;
    }
}
