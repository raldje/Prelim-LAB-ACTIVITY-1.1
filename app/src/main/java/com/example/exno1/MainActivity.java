package com.example.exno1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button ButtonFontSize;
    private Button ButtonFontColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ButtonFontSize = findViewById(R.id.fontsize);
        textView = findViewById(R.id.text);
        Button ButtonChangeColor = findViewById(R.id.fontcolor);

        ButtonFontSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float currentSize = textView.getTextSize() / getResources().getDisplayMetrics().scaledDensity;
                float newSize = currentSize + 10;
                textView.setTextSize(newSize);
                if (newSize > 80) {
                    textView.setTextSize(25);
                    int blackColor = Color.BLACK; // Set the text color to black
                    textView.setTextColor(blackColor);
                }
            }
        });
        ButtonChangeColor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Random random = new Random();
                        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

                        textView.setTextColor(color);
                }
            });
        }
    }
