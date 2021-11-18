package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio = (Button) findViewById(R.id.audio);


        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudio();
            }
        });
    }


    private void  LlamarAudio()
    {
        Intent intent = new Intent
                ( MainActivity.this,MainActivity2.class);
    }



        public void cumbia(View view) {
            Intent intent = new Intent(MainActivity.this,MainActivity3.class);
            startActivity(intent);
        }

    public void ranchera(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity5.class);
        startActivity(intent);
    }
    public void rockear(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity7.class);
        startActivity(intent);
    }
    public void balada(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity9.class);
        startActivity(intent);
    }
    public void saya(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity11.class);
        startActivity(intent);
    }

    public void sonid(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    public void sonido(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    public void anim(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity13.class);
        startActivity(intent);
    }
}