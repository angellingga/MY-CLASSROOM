package com.example.android.myclassroom.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.myclassroom.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

import java.util.HashMap;
import java.util.Map;

public class addJkelasActivity extends AppCompatActivity {
    private FirebaseStorage storage;
    private FirebaseAuth auth;
    private FirebaseFirestore database;
    Button tambah;
    TextView namamatakuliah,ruangan,dosen,jadwalkelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_jkelas);

        storage = FirebaseStorage.getInstance();
        database = FirebaseFirestore.getInstance();
        tambah = findViewById(R.id.btn_tambah);
        auth = FirebaseAuth.getInstance();
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(addJkelasActivity.this, HomeJkelasActivity.class);
                startActivity(intent);
                tambahMenu();
            }
        });
    }
    public void tambahMenu(){
        namamatakuliah = findViewById(R.id.inputMatakuliah);
        ruangan = findViewById(R.id.inputLab);
        dosen = findViewById(R.id.inputDosen);
        jadwalkelas = findViewById(R.id.inputJadwal);
        Map<String,String> menuMap = new HashMap<>();
        menuMap.put("nama_matakuliah",namamatakuliah.getText().toString().trim());
        menuMap.put("ruangan",ruangan.getText().toString().trim());
        menuMap.put("dosen",dosen.getText().toString().trim());
        menuMap.put("jadwal_kelas",jadwalkelas.getText().toString().trim());
        database.collection("jadwal_kelas").add(menuMap);


    }
}
