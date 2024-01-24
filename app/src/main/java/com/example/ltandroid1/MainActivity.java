package com.example.ltandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ltandroid1.DNDK.DangKy;
import com.example.ltandroid1.DNDK.DangNhap;

public class MainActivity extends AppCompatActivity {

    Button dangNhap, dangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dangNhap =findViewById(R.id.dangNhapWellcome);
        dangKy =findViewById(R.id.dangKyWellcome);

        dangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DangNhap.class));
            }
        });


        dangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DangKy.class));
            }
        });
    }
}