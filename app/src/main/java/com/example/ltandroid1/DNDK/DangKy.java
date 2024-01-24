package com.example.ltandroid1.DNDK;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ltandroid1.R;

import SQLite.UserData;

public class DangKy extends AppCompatActivity {

    UserData userData;

    ClassCheckDKDN classCheckDKDN;

    EditText username, pass, sdt;
    Button dangky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dk_layout);

        userData = new UserData(getApplicationContext());

        classCheckDKDN = new ClassCheckDKDN(getApplicationContext());

        username = findViewById(R.id.dangky_username);
        pass = findViewById(R.id.dangky_password);
        sdt = findViewById(R.id.dangky_sdt);
        dangky = findViewById(R.id.button_dangky);

        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString().trim();
                String pass1 = pass.getText().toString().trim();
                String sdt1 = sdt.getText().toString().trim();
                String ltk = "KhachHang";

                if (classCheckDKDN.KiemTraThongTin(name,pass1,sdt1)){
                    boolean isSave = userData.DangKyData(getApplicationContext(),name,pass1,sdt1, ltk);

                    if (isSave) startActivity(new Intent(getApplicationContext(), DangNhap.class));
                    else Toast.makeText(DangKy.this, "Failed to save new user!", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(DangKy.this, "Failed when checking new info!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
