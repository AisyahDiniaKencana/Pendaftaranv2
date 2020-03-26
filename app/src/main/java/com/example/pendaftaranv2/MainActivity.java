package com.example.pendaftaranv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;


import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    EditText tg;

    Calendar c;
    DatePicker dpd;
    private EditText EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EditText = findViewById(R.id.tanggallahir);

        findViewById(R.id.tanggallahir).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDailog();
            }
        });
    }

    private void showDatePickerDailog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = "day/month/year: " + dayOfMonth + "/" + month + "/" + year;
        tg.setText(date);
    }

    public android.widget.EditText getEditText() {
        return EditText;
    }

    public void setEditText(android.widget.EditText editText) {
        EditText = editText;
    }
}
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
