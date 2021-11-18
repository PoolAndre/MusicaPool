package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageButton btnGoku , btnNaruto;

    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnGoku = (ImageButton) findViewById(R.id.goku);
        btnNaruto = (ImageButton) findViewById(R.id.naruto);
        atras = (Button) findViewById(R.id.btnAtras);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intento2);
            }
        });

        btnGoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity2.this, R.raw.mundo);
                mp.start();
            }
        });


        btnNaruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity2.this, R.raw.aldea);
                mp.start();
            }
        });

    }

    public void MensajeGoku(View view) {
        Toast.makeText(this, "Dragon Ball Super", Toast.LENGTH_LONG).show();
    }




    public void MensajeNaruto(View view) {
        Toast.makeText(this, "Naruto Shippuden", Toast.LENGTH_LONG).show();

    }
}