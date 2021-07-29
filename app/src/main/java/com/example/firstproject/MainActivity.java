package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textexample);
        button = findViewById(R.id.domagic);

        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  button.setBackgroundColor(Color.YELLOW);
                  text.setText("I have done my magic.");
                  text.setVisibility(View.INVISIBLE);
              }
          });

        text.setTextColor(Color.BLACK);
        text.setText("This is another example!!");
    }
}