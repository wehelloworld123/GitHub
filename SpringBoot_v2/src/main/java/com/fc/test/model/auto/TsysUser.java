package com.fc.test.model.auto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TsysUser implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    private String username;

    private String email;

    private String avatar;

    private int sex;

    private String description;

    private String label;

    private String password;

    private String nickname;

    private int think;

    private Date createDat;

    private Date lUpdateDat;

    private int isDel;


    public TsysUser(String id, String username, String email, String avatar, int sex, String description, String label,String password, String nickname, int think, Date createDat, Date lUpdateDat, int isDel) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.avatar = avatar;
        this.sex = sex;
        this.description = description;
        this.label = label;
        this.password = password;
        this.nickname = nickname;
        this.think = think;
        this.createDat = createDat;
        this.lUpdateDat = lUpdateDat;
        this.isDel = isDel;
    }

    public TsysUser(String id, String username, String password, String nickname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
    public TsysUser() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getThink() {
        return think;
    }

    public void setThink(int think) {
        this.think = think;
    }

    public Date getCreateDat() {
        return createDat;
    }

    public void setCreateDat(Date createDat) {
        this.createDat = createDat;
    }

    public Date getlUpdateDat() {
        return lUpdateDat;
    }

    public void setlUpdateDat(Date lUpdateDat) {
        this.lUpdateDat = lUpdateDat;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }
}