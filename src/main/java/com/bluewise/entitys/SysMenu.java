package com.bluewise.entitys;

import javax.persistence.*;

/**
 * Created by wangshunchu on 16/3/12.
 */
@Entity
@Table(name = "sysmenu", schema = "test1", catalog = "")

public class SysMenu {
    private int id;
    private String name;
    private int parentid;
    private int sequence;
    private String iconCls;
    private String url;
    private int enable;

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
    @Column(name = "sequence", nullable = false)
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "iconCls", nullable = false, length = 20)
    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @Basic
    @Column(name = "url", nullable = false, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "enable", nullable = false)
    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysMenu sysmenu = (SysMenu) o;

        if (id != sysmenu.id) return false;
        if (parentid != sysmenu.parentid) return false;
        if (sequence != sysmenu.sequence) return false;
        if (enable != sysmenu.enable) return false;
        if (name != null ? !name.equals(sysmenu.name) : sysmenu.name != null) return false;
        if (iconCls != null ? !iconCls.equals(sysmenu.iconCls) : sysmenu.iconCls != null) return false;
        if (url != null ? !url.equals(sysmenu.url) : sysmenu.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + parentid;
        result = 31 * result + sequence;
        result = 31 * result + (iconCls != null ? iconCls.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + enable;
        return result;
    }
}
