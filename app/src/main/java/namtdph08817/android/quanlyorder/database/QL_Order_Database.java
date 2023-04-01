package namtdph08817.android.quanlyorder.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class QL_Order_Database extends SQLiteOpenHelper {

    public QL_Order_Database(@Nullable Context context) {
        super(context, "QuanLyOrder.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlNhanVien = "CREATE TABLE NGUOIDUNG(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL," +
                "userName TEXT NOT NULL," +
                " matKhau TEXT NOT NULL)";
        sqLiteDatabase.execSQL(sqlNhanVien);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
