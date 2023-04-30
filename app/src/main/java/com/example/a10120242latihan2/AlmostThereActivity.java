package com.example.a10120242latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;
public class AlmostThereActivity extends AppCompatActivity{
    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_almost_there);
        Objects.requireNonNull(getSupportActionBar()).hide();

        verifyBtn = findViewById(R.id.verify);

        verifyBtn.setOnClickListener((v)->{
            Intent intent = new Intent(this, VerifyActivity.class);
            startActivity(intent);
        });
    }
}

//10120242
//Mutia
//IF-6
//Tanggal Pengerjaan : 29-04-2023