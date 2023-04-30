package com.example.a10120242latihan2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;
public class VerifyActivity extends AppCompatActivity{
    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedIstanceState) {
        super.onCreate(savedIstanceState);
        setContentView(R.layout.activity_verify);
        Objects.requireNonNull(getSupportActionBar()).hide();

        sendBtn = findViewById(R.id.btn_send);

        sendBtn.setOnClickListener((v)->{
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });
    }
}


//10120242
//Mutia
//IF-6
//Tanggal Pengerjaan : 29-04-2023