package com.bluewise.entitys;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangshunchu on 16/3/12.
 */
@Entity
@Table(name = "sysuser", schema = "test1", catalog = "")

@IdClass(SysuserPK.class)
public class User {
    private int id;
    private String username;
    private String password;
    private int sysid;
    private String email;
    private String name;
    private String idcard;
    private String gender;
    private String qq;
    private String weixin;
    private Date regtime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 100)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "sysid", nullable = false)
    public int getSysid() {
        return sysid;
    }

    public void setSysid(int sysid) {
        this.sysid = sysid;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "idcard", nullable = false, length = 20)
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "gender", nullable = false, length = 2)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "qq", nullable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "weixin", nullable = true, length = 50)
    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    @Basic
    @Column(name = "regtime", nullable = false)
    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User sysuser = (User) o;

        if (id != sysuser.id) return false;
        if (sysid != sysuser.sysid) return false;
        if (username != null ? !username.equals(sysuser.username) : sysuser.username != null) return false;
        if (password != null ? !password.equals(sysuser.password) : sysuser.password != null) return false;
        if (email != null ? !email.equals(sysuser.email) : sysuser.email != null) return false;
        if (name != null ? !name.equals(sysuser.name) : sysuser.name != null) return false;
        if (idcard != null ? !idcard.equals(sysuser.idcard) : sysuser.idcard != null) return false;
        if (gender != null ? !gender.equals(sysuser.gender) : sysuser.gender != null) return false;
        if (qq != null ? !qq.equals(sysuser.qq) : sysuser.qq != null) return false;
        if (weixin != null ? !weixin.equals(sysuser.weixin) : sysuser.weixin != null) return false;
        if (regtime != null ? !regtime.equals(sysuser.regtime) : sysuser.regtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + sysid;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (idcard != null ? idcard.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (weixin != null ? weixin.hashCode() : 0);
        result = 31 * result + (regtime != null ? regtime.hashCode() : 0);
        return result;
    }
}
