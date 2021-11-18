package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


    }




    public void niña(View view) {
        Intent intent = new Intent(MainActivity5.this, pedro1.class);
        startActivity(intent);    }

    public void aven(View view) {
        Intent intent = new Intent(MainActivity5.this, pedro2.class);
        startActivity(intent);
}

    public void mam(View view) {
        Intent intent = new Intent(MainActivity5.this, pedro3.class);
        startActivity(intent)  ;
    }

    public void esto(View view) {
        Intent intent = new Intent(MainActivity5.this, pedro4.class);
        startActivity(intent)  ;
    }

    public void mucha(View view) {
        Intent intent = new Intent(MainActivity5.this, pedro5.class);
        startActivity(intent)  ;
    }

    public void autor(View view) {
        Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
        startActivity(intent);
    }
}