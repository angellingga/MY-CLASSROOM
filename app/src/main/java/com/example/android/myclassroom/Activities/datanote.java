package com.example.android.myclassroom.Activities;

public class datanote {
        private String matakuliah, pengumpulan, deskripsi;
        public datanote(String mk, String pl, String dk){
            this.matakuliah = mk;
            this.pengumpulan= pl;
            this.deskripsi= dk;
        }

        public String getMatakuliah() {
            return matakuliah;
        }

        public void setMatakuliah(String matakuliah) {

            this.matakuliah = matakuliah;
        }

        public String getPengumpulan() {

            return pengumpulan;
        }

        public void setPengumpulan(String pengumpulan) {

            this.pengumpulan = pengumpulan;
        }

        public String getDeskripsi() {

            return deskripsi;
        }

        public void setDeskripsi(String deskripsi) {

            this.deskripsi = deskripsi;
        }
    }


