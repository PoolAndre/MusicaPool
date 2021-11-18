package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }

    public void copi(View view) {
            Intent intent = new Intent(MainActivity3.this, maricarmen1.class);
            startActivity(intent);
        }
    public void obse(View view) {
        Intent intent = new Intent(MainActivity3.this, maricarmen2.class);
        startActivity(intent);
    }

    public void porfi(View view) {
        Intent intent = new Intent(MainActivity3.this, maricarmen3.class);
        startActivity(intent);
    }

    public void pasi(View view) {
        Intent intent = new Intent(MainActivity3.this, maricarmen4.class);
        startActivity(intent);
    }

    public void porque(View view) {
        Intent intent = new Intent(MainActivity3.this, maricarmen5.class);
        startActivity(intent);
    }

    public void autor(View view) {
        Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(intent);
    }
}