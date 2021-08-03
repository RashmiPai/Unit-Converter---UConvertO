package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button area,speed,temperature;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        area = findViewById(R.id.area);
        speed = findViewById(R.id.speed);
        temperature = findViewById(R.id.temperature);

        area.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                area();
            }
        });

        speed.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                speed();
            }
        });

        temperature.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                temperature();
            }
        });
    }

    void area()
    {
        Intent intent = new Intent(this, area.class);
        startActivity(intent);
    }

    void speed()
    {
        Intent intent = new Intent(this, speed.class);
        startActivity(intent);
    }

    void temperature()
    {
        Intent intent = new Intent(this, temperature.class);
        startActivity(intent);
    }
}