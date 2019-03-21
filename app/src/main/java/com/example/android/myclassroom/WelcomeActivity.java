package com.example.android.myclassroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.myclassroom.Activities.SignUpActivity;

public class WelcomeActivity extends AppCompatActivity {
    private Button loginbtn, signupbtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        View button = findViewById(R.id.signup_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp();
            }
        });

    }
        public void openSignUp(){
            Intent intent = new Intent (WelcomeActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
}
