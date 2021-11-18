package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;
    Button atras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        btn1 = findViewById(R.id.NarutoO);
        btn2 = findViewById(R.id.btnDos);
        btn3 = findViewById(R.id.btnTres);
        btn4 = findViewById(R.id.btnCuatro);
        btn5 = findViewById(R.id.btnCinco);
        atras = (Button) findViewById(R.id.btnAtras);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity11.this, MainActivity.class);
                startActivity(intento2);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity11.this, R.raw.porquetevas);
                mp.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity11.this, R.raw.soyrebelde);
                mp.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity11.this, R.raw.elmuchachodeojostristes);
                mp.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity11.this, R.raw.corazondepoeta);
                mp.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity11.this, R.raw.dariacualquiercosa);
                mp.start();
            }
        });
    }


    public void nina(View view) {
        Toast.makeText(this, "Niñachay  - William Luna ", Toast.LENGTH_LONG).show();
    }

    public void te(View view) {
        Toast.makeText(this, "Te Amaré - William Luna ", Toast.LENGTH_LONG).show();
    }

    public void vienes(View view) {
        Toast.makeText(this, " Vienes y te vas  - William Luna ", Toast.LENGTH_LONG).show();
    }

    public void linda(View view) {
        Toast.makeText(this, "Linda Wawita - William Luna ", Toast.LENGTH_LONG).show();
    }

    public void ama(View view) {
        Toast.makeText(this, " Ama Kiriwaychu Mamita  - William Luna ", Toast.LENGTH_LONG).show();
    }

    public void autor(View view) {
        Intent intent = new Intent(MainActivity11.this,MainActivity12.class);
        startActivity(intent);
    }
}