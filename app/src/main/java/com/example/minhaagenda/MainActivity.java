package com.example.minhaagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // conectando o arquivo java com o xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // conectando o button com o arquivo java
    public void botaodomingo(View v) {
        startActivity(new Intent(this, com.example.minhaagenda.domlayout.class));
    }

    public void botaosegunda(View v) {
        startActivity(new Intent(this, com.example.minhaagenda.seglayout.class));
    }
    public void botaoterca(View v) {
        startActivity(new Intent(this, com.example.minhaagenda.terlayout.class));
    }
    public void botaoquarta(View v) {
        startActivity(new Intent(this, com.example.minhaagenda.quarlayout.class));
    }
    public void botaoquinta(View v) {
        startActivity(new Intent(this, com.example.minhaagenda.quilayout.class));
    }
    public void botaosexta(View v) {
        startActivity(new Intent(this, com.example.minhaagenda.sexlayout.class));
    }
    public void botaosabado(View v) {
        startActivity(new Intent(this, com.example.minhaagenda.sablayout.class));
    }
}