package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<CV> cvArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView



        TextView textview = findViewById(R.id.cv);
        Intent intent = new Intent();
        String name = "fff";
        CV cv = new CV("Fatema","email@email.com","Programmer",18,111);

        Intent intent = new Intent(MainActivity.this,form2.class);

        intent.putExtra("age"cv.getCvage());
        intent.putExtra("email"cv.getCvemail());
        intent.putExtra("job"cv.getCvjob());
        intent.putExtra("name"cv.getCvname());
        intent.putExtra("phone number"cv.getCvphonenumber());
        startActivity(intent);


        cvArrayList.add(cv);






    }
}