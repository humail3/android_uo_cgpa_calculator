package com.example.uocgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CGPAPerSubject extends AppCompatActivity {
    //    float rollNo;
    float subjMarks, subjCH, subjGP;
    EditText subjMarksET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpaper_subject);

        Button enterBTN = findViewById(R.id.BTNEnter);
        enterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subjMarksET = findViewById(R.id.ETSubjMarks);
                String subjMarksS = subjMarksET.getText().toString();

                subjMarks = Float.parseFloat(subjMarksS);

                if (subjMarksS.isEmpty()) {
                    subjMarksET.setError("Kindly Fill This Form Completely");
                } else {
                    subjGP = (subjMarks - 10) / 20;
                    Intent h = new Intent(com.example.uocgpacalculator.CGPAPerSubject.this, CheckBoxSubjectsSelection.class);
                    h.putExtra("result", subjGP);
                    startActivity(h);
                }
            }
        });


    }
}