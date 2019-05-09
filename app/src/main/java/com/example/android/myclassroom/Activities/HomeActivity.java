package com.example.android.myclassroom.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.myclassroom.R;

public class HomeActivity extends AppCompatActivity {
    ImageView pracsched, notetask, classched;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        pracsched = findViewById(R.id.practicum_sched);

        pracsched = findViewById(R.id.practicum_sched);
        pracsched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomePracticumActivity.class);
                startActivity(intent);
            }
        });
        notetask = findViewById(R.id.Note_task);
        notetask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomeNoteTask.class);
                startActivity(intent);

            }
        });

        classched = findViewById(R.id.class_sched);
        classched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomeJkelasActivity.class);
                startActivity(intent);
            }
        });
    }
}