package com.bluewise.entitys;

import javax.persistence.*;

/**
 * Created by wangshunchu on 16/3/12.
 */
@Entity
@Table(name = "sysrole", schema = "test1", catalog = "")

public class Sysrole {
    private int id;
    private String name;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 60)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sysrole sysrole = (Sysrole) o;

        if (id != sysrole.id) return false;
        if (name != null ? !name.equals(sysrole.name) : sysrole.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
