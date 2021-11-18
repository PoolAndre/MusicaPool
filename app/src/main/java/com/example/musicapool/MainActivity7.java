package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


    }


    public void want(View view) {
        Intent intent = new Intent(MainActivity7.this, queen1.class);
        startActivity(intent);
    }

    public void will(View view) {
        Intent intent = new Intent(MainActivity7.this, queen2.class);
        startActivity(intent);      }

    public void some(View view) {
        Intent intent = new Intent(MainActivity7.this, queen3.class);
        startActivity(intent);      }

    public void we(View view) {
        Intent intent = new Intent(MainActivity7.this, queen4.class);
        startActivity(intent);      }

    public void it(View view) {
        Intent intent = new Intent(MainActivity7.this, queen5.class);
        startActivity(intent);      }

    public void autor(View view) {
        Intent intent = new Intent(MainActivity7.this,MainActivity8.class);
        startActivity(intent);
    }
}