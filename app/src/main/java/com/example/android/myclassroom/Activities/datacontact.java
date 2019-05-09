package com.example.android.myclassroom.Activities;

public class datacontact {
    private String nama, notelepon, alamatemail, alamatorang;

    public datacontact(String np, String lb, String st, String jp) {
        this.nama = np;
        this.notelepon = lb;
        this.alamatemail = st;
        this.alamatorang = jp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotelepon() {
        return notelepon;
    }

    public void setNotelepon(String notelepon) {
        this.notelepon = notelepon;
    }

    public String getAlamatemail() {
        return alamatemail;
    }

    public void setAlamatemail(String alamatemail) {
        this.alamatemail = alamatemail;
    }

    public String getAlamatorang() {
        return alamatorang;
    }

    public void setAlamatorang(String alamatorang) {
        this.alamatorang = alamatorang;
    }
}