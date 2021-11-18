package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity14 extends AppCompatActivity {

    ImageButton btnNaruto1 , btnNaruto2, btnNaruto3, btnNaruto4, btnNaruto5;
    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        btnNaruto1 = (ImageButton) findViewById(R.id.naruto1);
        btnNaruto1 = (ImageButton) findViewById(R.id.naruto2);
        btnNaruto1 = (ImageButton) findViewById(R.id.naruto3);
        btnNaruto1 = (ImageButton) findViewById(R.id.naruto4);
        btnNaruto1 = (ImageButton) findViewById(R.id.naruto5);
        atras = (Button) findViewById(R.id.btnAtras);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity14.this, MainActivity13.class);
                startActivity(intento2);
            }
        });

        btnNaruto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity14.this, R.raw.naruto11);
                mp.start();
            }
        });


        btnNaruto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity14.this, R.raw.naruto12);
                mp.start();
            }
        });
        btnNaruto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity14.this, R.raw.naruto13);
                mp.start();
            }
        });
        btnNaruto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity14.this, R.raw.naruto14);
                mp.start();
            }
        });
        btnNaruto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity14.this, R.raw.naruto15);
                mp.start();
            }
        });

    }


    public void MensajeNaruto1(View view) {
        Toast.makeText(this, "Naruto1 Shippuden", Toast.LENGTH_LONG).show();
    }

    public void MensajeNaruto2(View view) {
        Toast.makeText(this, "Naruto2 Shippuden", Toast.LENGTH_LONG).show();
    }

    public void MensajeNaruto3(View view) {
        Toast.makeText(this, "Naruto3 Shippuden", Toast.LENGTH_LONG).show();
    }

    public void MensajeNaruto4(View view) {
        Toast.makeText(this, "Naruto4 Shippuden", Toast.LENGTH_LONG).show();
    }

    public void MensajeNaruto5(View view) {
        Toast.makeText(this, "Naruto5 Shippuden", Toast.LENGTH_LONG).show();
    }
}