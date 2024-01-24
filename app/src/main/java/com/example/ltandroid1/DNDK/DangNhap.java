package com.example.ltandroid1.DNDK;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ltandroid1.R;

import MongoDB.UserWithMongo;
import SQLite.UserData;

public class DangNhap extends AppCompatActivity {

    UserWithMongo userWithMongo;

    UserData userData;

    EditText username, password;
    Button dangnhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dn_layout);

        userWithMongo = new UserWithMongo();

        userData = new UserData(getApplicationContext());

        username = findViewById(R.id.dangnhap_username);
        password = findViewById(R.id.dangnhap_password);
        dangnhap = findViewById(R.id.button_dangnhap);

        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if (userData.CheckDangNhap(getApplicationContext(),name,pass)){
                    Toast.makeText(DangNhap.this, "Success!", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(DangNhap.this, "Error!", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
