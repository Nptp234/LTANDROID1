package SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLDataException;

public class DataCenterSQLite extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "ANDROID1.db";
    public static final String TABLE_USER = "UserTable";
    public static final String USER_ID = "ID_User";
    public static final String USER_USERNAME = "Username_User";
    public static final String USER_PASSWORD = "Password_User";
    public static final String USER_SDT = "SDT_User";
    public static final String USER_LOAITAIKHOAN = "TypeAccount_User";

    public DataCenterSQLite( Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_USER + " ("+
                USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                USER_USERNAME + " TEXT, "+
                USER_PASSWORD + " TEXT, "+
                USER_SDT + " TEXT, "+
                USER_LOAITAIKHOAN + " TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop Table if exists "+TABLE_USER);
    }
}
