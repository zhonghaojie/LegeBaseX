package com.lege.android.base.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class BindInfo {
    @Id
    private Long id;
    private String isBind ;
    private String isPrivacy ;

    @Generated(hash = 1121697647)
    public BindInfo(Long id, String isBind, String isPrivacy) {
        this.id = id;
        this.isBind = isBind;
        this.isPrivacy = isPrivacy;
    }

    @Generated(hash = 1845565255)
    public BindInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsBind() {
        return isBind;
    }

    public void setIsBind(String isBind) {
        this.isBind = isBind;
    }

    public String getIsPrivacy() {
        return isPrivacy;
    }

    public void setIsPrivacy(String isPrivacy) {
        this.isPrivacy = isPrivacy;
    }
}
