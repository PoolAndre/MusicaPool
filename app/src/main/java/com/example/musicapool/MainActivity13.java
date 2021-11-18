package com.example.musicapool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity13 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;
    Button atras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn1 = findViewById(R.id.NarutoO);
        btn2 = findViewById(R.id.SwordO);
        btn3 = findViewById(R.id.YourO);
        btn4 = findViewById(R.id.DragonO);
        btn5 = findViewById(R.id.OneO);
        atras = (Button) findViewById(R.id.btnAtras);

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity13.this, MainActivity.class);
                startActivity(intento2);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity13.this, MainActivity.class);
                startActivity(intento2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity13.this, MainActivity.class);
                startActivity(intento2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity13.this, MainActivity.class);
                startActivity(intento2);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity13.this, MainActivity.class);
                startActivity(intento2);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity13.this, MainActivity.class);
                startActivity(intento2);
            }
        });

}

}