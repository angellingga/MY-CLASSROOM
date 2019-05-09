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

public class addPracticumActivity extends AppCompatActivity {
    private FirebaseStorage storage;
    private FirebaseAuth auth;
    private FirebaseFirestore database;
    Button tambah;
    TextView namapraktikum,lab,shift,jadwalpraktikum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_practicum);

        storage = FirebaseStorage.getInstance();
        database = FirebaseFirestore.getInstance();
        tambah = findViewById(R.id.btn_tambah);
        auth = FirebaseAuth.getInstance();
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(addPracticumActivity.this, HomePracticumActivity.class);
                startActivity(intent);
                tambahMenu();
            }
        });
    }
    public void tambahMenu(){
        namapraktikum = findViewById(R.id.inputPraktikum);
        lab = findViewById(R.id.inputLab);
        shift = findViewById(R.id.inputDosen);
        jadwalpraktikum = findViewById(R.id.inputJadwal);
        Map<String,String> menuMap = new HashMap<>();
        menuMap.put("nama_praktikum",namapraktikum.getText().toString().trim());
        menuMap.put("lab",lab.getText().toString().trim());
        menuMap.put("shift",shift.getText().toString().trim());
        menuMap.put("jadwal_praktikum",jadwalpraktikum.getText().toString().trim());
        database.collection("jadwal_praktikum").add(menuMap);


    }
}
