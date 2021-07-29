package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button ok;
    TextView result;
    String userName;
    ImageView image;
    CheckBox male;
    CheckBox female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        ok = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageExample);

        male = findViewById(R.id.checkBoxMale);
        female = findViewById(R.id.checkBoxfemale);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (male.isChecked())
                {
                    result.setText("You are male.");
                    female.setChecked(false);
                }
                else
                {
                    result.setText("What is your gender?");
                }
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (female.isChecked())
                {
                    result.setText("Female!!");
                    male.setChecked(false);
                }
                else
                {
                    result.setText("What is your gender??");
                }
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                image.setImageResource(R.drawable.pic1);
            }
        });

    }
}