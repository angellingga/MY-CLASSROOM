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

public class addContact extends AppCompatActivity {
    private FirebaseStorage storage;
    private FirebaseAuth auth;
    private FirebaseFirestore database;
    Button tambah;
    TextView nama,nomor,email,alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        storage = FirebaseStorage.getInstance();
        database = FirebaseFirestore.getInstance();
        tambah = findViewById(R.id.btn_tambah);
        auth = FirebaseAuth.getInstance();
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(addContact.this, HomeContactActivity.class);
                startActivity(intent);
                tambahMenu();
            }
        });
    }
    public void tambahMenu(){
        nama = findViewById(R.id.inputNama);
        nomor = findViewById(R.id.inputTelepon);
        email= findViewById(R.id.inputEmail);
        alamat= findViewById(R.id.inputAlamat);
        Map<String,String> menuMap = new HashMap<>();
        menuMap.put("nama",nama.getText().toString().trim());
        menuMap.put("nomor_telepon",nomor.getText().toString().trim());
        menuMap.put("email",email.getText().toString().trim());
        menuMap.put("alamat",alamat.getText().toString().trim());
        database.collection("daftar_kontak").add(menuMap);


    }
}
