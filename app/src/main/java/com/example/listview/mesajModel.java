package com.example.listview;

import android.widget.ImageView;

public class mesajModel {

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getKisi() {
        return kisi;
    }

    public void setKisi(String kisi) {
        this.kisi = kisi;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    private String mesaj;
    private  String kisi;
    private  int imgId;

    public mesajModel(String mesaj, String kisi, int imgId) {
        this.mesaj = mesaj;
        this.kisi = kisi;
        this.imgId = imgId;
    }


}
