package com.bluewise.entitys;

import javax.persistence.*;

/**
 * Created by wangshunchu on 16/3/7.
 */
@Entity
@Table(name = "BA_ICD10", schema = "test1", catalog = "")
public class BaIcd10Entity {
    private String bm;
    private String mc;
    private String pym;

    @Id
    @Column(name = "BM", nullable = false, length = 20)
    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    @Basic
    @Column(name = "MC", nullable = false, length = 100)
    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    @Basic
    @Column(name = "PYM", nullable = true, length = 100)
    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaIcd10Entity that = (BaIcd10Entity) o;

        if (bm != null ? !bm.equals(that.bm) : that.bm != null) return false;
        if (mc != null ? !mc.equals(that.mc) : that.mc != null) return false;
        if (pym != null ? !pym.equals(that.pym) : that.pym != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bm != null ? bm.hashCode() : 0;
        result = 31 * result + (mc != null ? mc.hashCode() : 0);
        result = 31 * result + (pym != null ? pym.hashCode() : 0);
        return result;
    }
}
