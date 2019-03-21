package com.example.android.myclassroom.Activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.android.myclassroom.Manifest;
import com.example.android.myclassroom.R;

public class SignUpActivity extends AppCompatActivity {

    ImageView ImgUserPhoto;
    static int PReqCode = 1;
    static int REQUESCODE = 1;
    Uri pickedImgUri ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ImgUserPhoto = findViewById(R.id.sign_UserPhoto);

        ImgUserPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Build.VERSION.SDK_INT >=22){

                    checkAndRequestForPermission();
                }
                else {
                    openGallery();
                }
            }
        });
    }

    private void openGallery() {
        Intent galleryIntent = new Intent (Intent.ACTION_GET_CONTENT);
        galleryIntent.setType("image/*");
        startActivityForResult(galleryIntent,REQUESCODE);
    }

    private void checkAndRequestForPermission() {

        if(ContextCompat.checkSelfPermission(SignUpActivity.this, android.Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(SignUpActivity.this, android.Manifest.permission.READ_EXTERNAL_STORAGE)){

                Toast.makeText(SignUpActivity.this, "Please Accept For Required Permission", Toast.LENGTH_SHORT).show();
            } else
            {
                ActivityCompat.requestPermissions(SignUpActivity.this, new String[] {android.Manifest.permission.READ_EXTERNAL_STORAGE},
                        PReqCode);
            }
        }
        else
            openGallery();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == REQUESCODE && data != null ){

            pickedImgUri = data.getData();
            ImgUserPhoto.setImageURI(pickedImgUri);

        }
    }
}

