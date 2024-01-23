package com.example.ltandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button dangNhap, dangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dangNhap =findViewById(R.id.dangNhapWellcome);
        dangKy =findViewById(R.id.dangKyWellcome);


    }
}