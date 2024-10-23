package com.example.uocgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CGPAPerSemesterResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpaper_semester_result);

        TextView resultTV = findViewById(R.id.TVresult);

        float result = getIntent().getFloatExtra("result", 0);
        if (result > 4) {
            result = 4.0f;
            resultTV.setText(String.valueOf(result));
        } else {
            resultTV.setText(String.valueOf(result));
        }
    }
}