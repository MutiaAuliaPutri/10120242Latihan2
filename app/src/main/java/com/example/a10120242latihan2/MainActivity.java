package com.example.a10120242latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;
public class MainActivity extends AppCompatActivity{
    TextView registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        registerBtn =  findViewById(R.id.register_btn);

        registerBtn.setOnClickListener((v)->{
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}

//10120242
//Mutia
//IF-6
//Tanggal Pengerjaan : 29-04-2023