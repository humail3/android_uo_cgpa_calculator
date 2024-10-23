package com.example.uocgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cgpaPerSubjectTV=findViewById(R.id.cgpaPerSubject);
        TextView cgpaPerSemesterTV=findViewById(R.id.cgpaPerSemester);

        cgpaPerSubjectTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity.this,CGPAPerSubject.class);
                startActivity(a);
            }
        });
        cgpaPerSemesterTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(MainActivity.this,CGPAPerSemester.class);
                startActivity(b);
            }
        });
    }
}