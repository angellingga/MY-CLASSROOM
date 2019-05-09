package com.example.android.myclassroom.Activities;

public class modelData {
    private String namapraktikum, namalab, namashift, namajadwalpraktikum, namamatakuliah, namaruangan, namadosen, namajadwalkelas ;
    public modelData(String np, String lb, String st, String jp){
        this.namapraktikum = np;
        this.namalab = lb;
        this.namashift = st;
        this.namajadwalpraktikum = jp;
        this.namamatakuliah = np;
        this.namaruangan = lb;
        this.namadosen = st;
        this.namajadwalkelas = jp;

    }

    public String getNamapraktikum() {
        return namapraktikum;
    }

    public void setNamapraktikum(String namapraktikum) {

        this.namapraktikum = namapraktikum;
    }

    public String getNamamatakuliah() { return namamatakuliah; }

    public void setNamamatakuliah(String namamatakuliah) {

        this.namamatakuliah = namamatakuliah;
    }

    public String getNamalab() {

        return namalab;
    }
    public String getNamaruangan() {

        return namaruangan;
    }
    public void setNamalab(String namalab) {

        this.namalab = namalab;
    }
    public void setNamaruangan(String namaruangan) {

        this.namaruangan = namaruangan;
    }

    public String getNamashift() {

        return namashift;
    }
    public String getNamadosen() {

        return namadosen;
    }

    public void setNamashift(String namashift) {

        this.namashift = namashift;
    }
    public void setNamadosen(String namadosen) {

        this.namadosen = namadosen;
    }
    public String getNamajadwalpraktikum() {

        return namajadwalpraktikum;
    }
    public String getNamajadwalkelas() {

        return namajadwalkelas;
    }


    public void setNamajadwalpraktikum(String namajadwalpraktikum) {

        this.namajadwalpraktikum = namajadwalpraktikum;
    }

}
