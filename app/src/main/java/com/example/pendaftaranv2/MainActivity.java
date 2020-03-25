package com.example.pendaftaranv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText tg;

    Calendar c;
    DatePicker dpd;
    private Object EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        EditText = (EditText)findViewById(R.id.tanggallahir);
//
//        c = Calendar.getInstance();
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH);
//        int day = c.get(Calendar.DAY_OF_MONTH);
//
//        tg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
//                        tg.setText(mDay + "/" + mMonth + "/" + mYear);
//                    }
//                }, year, month, day);
//                dpd.show();
//            }
//        });
    }
}