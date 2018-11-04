package com.persist.sso.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "REL_MENU_ROLE")
public class RelMenuRole {
    @Id
    @GeneratedValue
    private Long id;
    private String menuNo;
    private String roleNo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTIme;
    private String createUser;
    private String updateUser;

    @Override
    public String toString() {
        return "RelMenuRole{" +
                "id=" + id +
                ", menuNo='" + menuNo + '\'' +
                ", roleNo='" + roleNo + '\'' +
                ", createTime=" + createTime +
                ", updateTIme=" + updateTIme +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTIme() {
        return updateTIme;
    }

    public void setUpdateTIme(Date updateTIme) {
        this.updateTIme = updateTIme;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
