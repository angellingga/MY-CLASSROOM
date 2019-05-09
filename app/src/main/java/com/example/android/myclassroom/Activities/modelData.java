package com.example.android.myclassroom.Activities;

public class modelData {
    private String namapraktikum, namalab, namashift, namajadwalpraktikum;
    public modelData(String np, String lb, String st, String jp){
        this.namapraktikum = np;
        this.namalab = lb;
        this.namashift = st;
        this.namajadwalpraktikum = jp;
    }

    public String getNamapraktikum() {
        return namapraktikum;
    }

    public void setNamapraktikum(String namapraktikum) {

        this.namapraktikum = namapraktikum;
    }

    public String getNamalab() {

        return namalab;
    }

    public void setNamalab(String namalab) {

        this.namalab = namalab;
    }

    public String getNamashift() {

        return namashift;
    }

    public void setNamashift(String namashift) {

        this.namashift = namashift;
    }
    public String getNamajadwalpraktikum() {

        return namajadwalpraktikum;
    }

    public void setNamajadwalpraktikum(String namajadwalpraktikum) {

        this.namajadwalpraktikum = namajadwalpraktikum;
    }
}
