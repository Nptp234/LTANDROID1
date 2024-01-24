package SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLDataException;

public class UserData extends DataCenterSQLite {
    public UserData(Context context) {
        super(context);
    }

    public boolean DangKyData(Context context, String username, String password, String sdt, String loaitaikhoan){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(USER_SDT, sdt);
        values.put(USER_USERNAME, username);
        values.put(USER_PASSWORD, password);
        values.put(USER_LOAITAIKHOAN, loaitaikhoan);

        long rs =sqLiteDatabase.insert(TABLE_USER, null, values);
        sqLiteDatabase.close();
        if (rs==-1) return false;
        else return true;
    }

    public boolean CheckDangNhap(Context context,String username, String pass)
    {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("Select * from "+TABLE_USER+" where "+USER_USERNAME+" = ? and "+USER_PASSWORD+" = ?", new String[]{username,pass});
        if (cursor.getCount()==1) return true;
        else return false;
    }

    public boolean CheckUsername(Context context, String username){
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("Select * from "+TABLE_USER+" where "+USER_USERNAME+" = ?", new String[] {username});
        if (cursor.getCount()==1)
            return false;
        else return true;
    }

    public boolean CheckPhone(Context context, String phone){
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("Select * from "+TABLE_USER+" where "+USER_SDT+" = ?", new String[] {phone});
        if (cursor.getCount()==1)
            return false;
        else return true;
    }

}
