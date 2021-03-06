package com.example.android.myclassroom.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.android.myclassroom.AdapterDataNote;
import com.example.android.myclassroom.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;

public class HomeNoteTask extends AppCompatActivity {

    private FirebaseStorage storage;
    private FirebaseAuth auth;
    private FirebaseFirestore db;
    private Button load;
    //instance for rv
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    private ArrayList<datanote> itemList;
    //private AdapterData mAdapter;
    private static final String TAG = HomeNoteTask.class.getSimpleName();
    private AdapterDataNote mAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_notetask);
        itemList = new ArrayList<datanote>();
        auth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        //recycler
        RecyclerView recyclerView = findViewById(R.id.RecyclerView);

        mAdapter = new AdapterDataNote(itemList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeNoteTask.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(mAdapter);
        //recyler end here

        load = findViewById(R.id.LoadButton);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //itemList.clear();
                itemList.clear();
                db.collection("Notetask").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                mAdapter.addItem(new datanote(document.getString("Matakuliah"),
                                        document.getString("Deskripsi"), document.getString("Pengumpulan")));
                                Log.d(TAG,document.getId() + " => " + document.getData());
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });
            }
        });

        FloatingActionButton fab = findViewById(R.id.fb_tambah);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeNoteTask.this, addNoteTask.class);
                startActivity(intent);
            }
        });
    }
}

