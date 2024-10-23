package com.example.uocgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CGPAPerSemester extends AppCompatActivity {
    int subj1CH;
    int subj2CH;
    int subj3CH;
    int subj4CH;
    int subj5CH;
    float subj1Marks;
    float subj2Marks;
    float subj3Marks;
    float subj4Marks;
    float subj5Marks;
    float subj1Gp;
    float subj2Gp;
    float subj3Gp;
    float subj4Gp;
    float subj5Gp;
    float subj1Value;
    float subj2Value;
    float subj3Value;
    float subj4Value;
    float subj5Value;
    float totalCreditHours;
    float totalValue;
    float Cgpa;
    float totalGP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpaper_semester);

        EditText subj1MarksET = findViewById(R.id.ETSubj1Marks);
        EditText subj2MarksET = findViewById(R.id.ETSubj2Marks);
        EditText subj3MarksET = findViewById(R.id.ETSubj3Marks);
        EditText subj4MarksET = findViewById(R.id.ETSubj4Marks);
        EditText subj5MarksET = findViewById(R.id.ETSubj5Marks);
        EditText subj1CHET = findViewById(R.id.ETSubj1CH);
        EditText subj2CHET = findViewById(R.id.ETSubj2CH);
        EditText subj3CHET = findViewById(R.id.ETSubj3CH);
        EditText subj4CHET = findViewById(R.id.ETSubj4CH);
        EditText subj5CHET = findViewById(R.id.ETSubj5CH);
        Button enterBTN = findViewById(R.id.BTNEnter);

        enterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String subj1MarksS = subj1MarksET.getText().toString();
                String subj2MarksS = subj2MarksET.getText().toString();
                String subj3MarksS = subj3MarksET.getText().toString();
                String subj4MarksS = subj4MarksET.getText().toString();
                String subj5MarksS = subj5MarksET.getText().toString();

                String subj1CHS = subj1CHET.getText().toString();
                String subj2CHS = subj2CHET.getText().toString();
                String subj3CHS = subj3CHET.getText().toString();
                String subj4CHS = subj4CHET.getText().toString();
                String subj5CHS = subj5CHET.getText().toString();

                subj1Marks = Float.parseFloat(subj1MarksS);
                subj2Marks = Float.parseFloat(subj2MarksS);
                subj3Marks = Float.parseFloat(subj3MarksS);
                subj4Marks = Float.parseFloat(subj4MarksS);
                subj5Marks = Float.parseFloat(subj5MarksS);

                subj1CH = Integer.parseInt(subj1CHS);
                subj2CH = Integer.parseInt(subj2CHS);
                subj3CH = Integer.parseInt(subj3CHS);
                subj4CH = Integer.parseInt(subj4CHS);
                subj5CH = Integer.parseInt(subj5CHS);

                if (subj1MarksS.isEmpty()) {
                    subj1MarksET.setError("Empty string Not Allow");
                }
                if (subj2MarksS.isEmpty()) {
                    subj2MarksET.setError("Empty string Not Allow");
                }
                if (subj3MarksS.isEmpty()) {
                    subj3MarksET.setError("Empty string Not Allow");
                }
                if (subj4MarksS.isEmpty()) {
                    subj4MarksET.setError("Empty string Not Allow");
                }
                if (subj5MarksS.isEmpty()) {
                    subj5MarksET.setError("Empty string Not Allow");
                }
                if (subj1Marks >= 90) {
                    subj1Gp = 4;
                }
                if (subj1Marks < 50) {
                    subj1Gp = 0;
                } else {
                    subj1Gp = (subj1Marks - 10) / 20;
                }

                if (subj2Marks >= 90) {
                    subj2Gp = 4;
                }
                if (subj2Marks < 50) {
                    subj2Gp = 0;
                } else {
                    subj2Gp = (subj2Marks - 10) / 20;
                }

                if (subj3Marks >= 90) {
                    subj3Gp = 4;
                }
                if (subj3Marks < 50) {
                    subj3Gp = 0;
                } else {
                    subj3Gp = (subj3Marks - 10) / 20;
                }

                if (subj4Marks >= 90) {
                    subj4Gp = 4;
                }
                if (subj4Marks < 50) {
                    subj4Gp = 0;
                } else {
                    subj4Gp = (subj4Marks - 10) / 20;
                }

                if (subj5Marks >= 90) {
                    subj5Gp = 4;
                }
                if (subj5Marks < 50) {
                    subj5Gp = 0;
                } else {
                    subj5Gp = (subj5Marks - 10) / 20;
                }

                subj1Value = subj1Gp * subj1CH;
                subj2Value = subj2Gp * subj2CH;
                subj3Value = subj3Gp * subj3CH;
                subj4Value = subj4Gp * subj4CH;
                subj5Value = subj5Gp * subj5CH;
                totalGP = subj1Gp + subj2Gp + subj3Gp + subj4Gp + subj5Gp;
                totalValue = subj1Value + subj2Value + subj3Value + subj4Value + subj5Value;
                totalCreditHours = subj1CH + subj2CH + subj3CH + subj4CH + subj5CH;
                Cgpa = totalValue / totalCreditHours;

                Intent e = new Intent(CGPAPerSemester.this, CGPAPerSemesterResult.class);
                e.putExtra("result", Cgpa);
                startActivity(e);
            }
        });
    }
}