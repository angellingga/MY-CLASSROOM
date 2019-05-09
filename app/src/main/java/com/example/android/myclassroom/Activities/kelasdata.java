package com.example.android.myclassroom.Activities;

public class kelasdata {
    private String namamatakuliah, namaruangan, namadosen, namajadwalkelas;

    public kelasdata(String mk, String nr, String nd, String nj) {
        this.namamatakuliah = mk;
        this.namaruangan = nr;
        this.namadosen = nd;
        this.namajadwalkelas = nj;
    }

    public String getNamamatakuliah() {
        return namamatakuliah;
    }

    public void setNamamatakuliah(String namamatakuliah) {

        this.namamatakuliah = namamatakuliah;
    }

    public String getNamaruangan() {

        return namaruangan;
    }

    public void setNamaruangan(String namaruangan) {

        this.namaruangan = namaruangan;
    }

    public String getNamadosen() {

        return namadosen;
    }

    public void setNamadosen(String namadosen) {

        this.namadosen = namadosen;
    }

    public String getNamajadwalkelas() {

        return namajadwalkelas;
    }
    public void setNamajadwalkelas(String namajadwalkelas) {
        this.namajadwalkelas = namajadwalkelas;
    }
}