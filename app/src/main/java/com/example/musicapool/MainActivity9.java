package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

    }

    public void por(View view) {
        Intent intent = new Intent(MainActivity9.this, jeanette.class);
        startActivity(intent);
    }

    public void soy(View view) {
        Intent intent = new Intent(MainActivity9.this, jeanette2.class);
        startActivity(intent);
    }

    public void el(View view) {
        Intent intent = new Intent(MainActivity9.this, jeanette3.class);
        startActivity(intent);
    }

    public void cora(View view) {
        Intent intent = new Intent(MainActivity9.this, jeanette4.class);
        startActivity(intent);
    }

    public void dari(View view) {
        Intent intent = new Intent(MainActivity9.this, jeanette5.class);
        startActivity(intent);
    }

    public void autor(View view) {
        Intent intent = new Intent(MainActivity9.this,MainActivity10.class);
        startActivity(intent);
    }
}