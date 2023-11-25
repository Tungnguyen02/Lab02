package com.example.vd3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //khai bao bien giao dien
    EditText  EdtA,EdtB, EdtC;
    Button btn;
    RadioButton RaNa, RaNu;
    CheckBox checkbox, checkBox2;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdtA = findViewById(R.id.EdtA);
        EdtB = findViewById(R.id.EdtB);
        EdtC = findViewById(R.id.EdtC);
        btn = findViewById(R.id.btn);
        RaNa = findViewById(R.id.RaNa);
        RaNu = findViewById(R.id.RaNu);
        checkbox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        textViewResult = findViewById(R.id.textView4);

        // tạo LítView
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = EdtA.getText().toString();
                String mssv = EdtB.getText().toString();
                String tuoi = EdtC.getText().toString();
                String gt = (RaNa.isChecked()) ? "Nam" : "Nữ";
                boolean dabong = checkbox.isChecked();
                boolean choigam = checkBox2.isChecked();
                String message = "Họ tên: " + hoten +
                        "\nMSSV: " + mssv +
                        "\nTuổi: " + tuoi +
                        "\nGiới tính: " + gt +
                        "\nSở thích: " +
                        (dabong ? "Đá Bóng" : "") +
                        (choigam ? "Chơi Game" : "");

                textViewResult.setText(message);
                Toast.makeText(MainActivity.this, "Thông tin đã được lưu", Toast.LENGTH_SHORT).show();
            }
        });


    }
}