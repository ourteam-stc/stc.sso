package com.persist.sso.bean;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "REL_ROLE_CUSTOMER")
public class RelRoleCustomer {
    @Id
    @GeneratedValue
    private Long id;
    private String roleNo;//角色变好
    private String releNo;//用户编号
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTIme;
    private String createUser;
    private String updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getReleNo() {
        return releNo;
    }

    public void setReleNo(String releNo) {
        this.releNo = releNo;
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

    @Override
    public String toString() {
        return "RelRoleCustomer{" +
                "id=" + id +
                ", roleNo='" + roleNo + '\'' +
                ", releNo='" + releNo + '\'' +
                ", createTime=" + createTime +
                ", updateTIme=" + updateTIme +
                ", createUser='" + createUser + '\'' +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }
}
