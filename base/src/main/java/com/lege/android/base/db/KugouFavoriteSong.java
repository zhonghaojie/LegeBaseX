package com.lege.android.base.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class KugouFavoriteSong {
    @Id(autoincrement = false)
    private String songId;
    private String songName;
    private String songExtraId;
    public String getSongExtraId() {
        return this.songExtraId;
    }
    public void setSongExtraId(String songExtraId) {
        this.songExtraId = songExtraId;
    }
    public String getSongName() {
        return this.songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getSongId() {
        return this.songId;
    }
    public void setSongId(String songId) {
        this.songId = songId;
    }
    @Generated(hash = 1999254397)
    public KugouFavoriteSong(String songId, String songName, String songExtraId) {
        this.songId = songId;
        this.songName = songName;
        this.songExtraId = songExtraId;
    }
    @Generated(hash = 1597110525)
    public KugouFavoriteSong() {
    }
}
