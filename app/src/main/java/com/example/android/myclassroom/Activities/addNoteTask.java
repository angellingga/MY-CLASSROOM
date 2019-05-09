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

public class addNoteTask extends AppCompatActivity {
    private FirebaseStorage storage;
    private FirebaseAuth auth;
    private FirebaseFirestore database;
    Button tambah;
    TextView Matakuliah, Deskripsi, Pengumpulan, Notetask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notetask);

        storage = FirebaseStorage.getInstance();
        database = FirebaseFirestore.getInstance();
        tambah = findViewById(R.id.btn_tambah);
        auth = FirebaseAuth.getInstance();
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(addNoteTask.this,HomeNoteTask.class);
                startActivity(intent);
                tambahMenu();
            }
        });
    }
    public void tambahMenu(){
        Matakuliah = findViewById(R.id.Matakuliah);
        Deskripsi = findViewById(R.id.Deskripsi);
        Pengumpulan = findViewById(R.id.Pengumpulan);
        Map<String,String> menuMap = new HashMap<>();
        menuMap.put("Mata_kuliah",Matakuliah.getText().toString().trim());
        menuMap.put("Deskripsi",Deskripsi.getText().toString().trim());
        menuMap.put("Pengumpulan",Pengumpulan.getText().toString().trim());
        menuMap.put("Notetask",Notetask.getText().toString().trim());
        database.collection("Notetask").add(menuMap);


    }
}

