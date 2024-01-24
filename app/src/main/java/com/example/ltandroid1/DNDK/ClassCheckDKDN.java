package com.example.ltandroid1.DNDK;

import android.content.Context;
import android.widget.Toast;

import SQLite.UserData;

public class ClassCheckDKDN {

    UserData userData;
    private Context context1;
    public ClassCheckDKDN(Context context){
        this.context1 = context;
        userData = new UserData(context);
    }

    protected boolean KiemTraThongTin(String name, String pass, String sdt){
        if (KiemTraTrongThongTin(name,pass,sdt)
                && KiemTraDoDaiThongTin(name,pass,sdt)
                && KiemTraPhoneHopLe(sdt)
                && KiemTraUsername(name)
                && KiemTraPhone(sdt)){
            return true;
        }else return false;
    }

    protected boolean KiemTraTrongThongTin(String name, String pass, String sdt){
        if (name.isEmpty() || pass.isEmpty() ||sdt.isEmpty()) return false;
        else return true;
    }

    protected boolean KiemTraDoDaiThongTin(String name, String pass, String sdt){
        if (name.length()<=4){
            Toast.makeText(context1, "Name should be longer than 4!", Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            if (pass.length()<=7){
                Toast.makeText(context1, "Pass should be longer than 7!", Toast.LENGTH_SHORT).show();
                return false;
            }
            else{
                if (sdt.length()<=9){
                    Toast.makeText(context1, "Phone should be longer than 9!", Toast.LENGTH_SHORT).show();
                    return false;
                }
                else return true;
            }
        }
    }

    protected boolean KiemTraPhoneHopLe(String sdt){
        if (sdt.charAt(0)=='0'){
            return true;
        }else {
            Toast.makeText(context1, "Phone should be start with '0'!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    protected boolean KiemTraUsername(String name){
        if (userData.CheckUsername(context1,name)){
            return true;
        }else {
            Toast.makeText(context1, "Username already in use!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    protected boolean KiemTraPhone(String phone){
        if (userData.CheckPhone(context1,phone)){
            return true;
        }else {
            Toast.makeText(context1, "Phone already in use!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
