package com.lege.android.base.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class BindInfo {
    @Id
    private Long id;
    private String isBind ;
    private String isPrivacy ;

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
