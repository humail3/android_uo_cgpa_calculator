package com.example.uocgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CheckBoxSubjectsSelection extends AppCompatActivity {
    String[] listElements = {"book no 1", "book_no_2", "book_no_3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_subjects_selection);

        CheckBox checkBox1 = findViewById(R.id.CB1);
        CheckBox checkBox2 = findViewById(R.id.CB2);
        CheckBox checkBox3 = findViewById(R.id.CB3);
        Button btnNext = findViewById(R.id.nextBTN);
        ListView lvList = findViewById(R.id.listLV);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox1.isChecked()) {
                    Toast.makeText(CheckBoxSubjectsSelection.this, "Subject 1 is selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckBoxSubjectsSelection.this, "Subject 1 is not selected", Toast.LENGTH_SHORT).show();
                }
                if (checkBox1.isChecked()) {
                    Toast.makeText(CheckBoxSubjectsSelection.this, "Subject 2 is selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckBoxSubjectsSelection.this, "Subject 2 is not selected", Toast.LENGTH_SHORT).show();
                }
                if (checkBox1.isChecked()) {
                    Toast.makeText(CheckBoxSubjectsSelection.this, "Subject 3 is selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckBoxSubjectsSelection.this, "Subject 3 is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listElements);
        lvList.setAdapter(adapter1);

    }
}