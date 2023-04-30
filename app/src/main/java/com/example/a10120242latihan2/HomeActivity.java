package com.example.a10120242latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;
public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}

//10120242
//Mutia
//IF-6
//Tanggal Pengerjaan : 29-04-2023