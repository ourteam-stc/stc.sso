package com.persist.sso.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_MENU")
public class Menu {
    @Id
    @GeneratedValue
    private Long id;
    private String menuNo;
    private String menuUrl;
    private String menuType;
    private String menuDesc;
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTIme;
    private String createUser;
    private String updateUser;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menuNo='" + menuNo + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuType='" + menuType + '\'' +
                ", menuDesc='" + menuDesc + '\'' +
                ", status='" + status + '\'' +
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

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
