package com.example.converter;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class temperature extends Activity
{
    RadioButton celsius, fahrenheit, kelvin,celsius2,fahrenheit2,kelvin2;
    RadioGroup rdgroup1,rdgroup2;
    TextView exp1,exp2;
    EditText exp3,exp4;
    boolean c1,c2,f1,f2,k1,k2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);

        rdgroup1 = (RadioGroup)findViewById(R.id.rdGroup);
        rdgroup2 = (RadioGroup)findViewById(R.id.rdGroup2);

        celsius = (RadioButton)findViewById(R.id.celsius);
        fahrenheit = (RadioButton)findViewById(R.id.fahrenheit);
        kelvin = (RadioButton)findViewById(R.id.kelvin);
        celsius2 = (RadioButton)findViewById(R.id.celsius2);
        fahrenheit2 = (RadioButton)findViewById(R.id.fahrenheit2);
        kelvin2 = (RadioButton)findViewById(R.id.kelvin2);

        exp1 = (TextView) findViewById(R.id.exp1);
        exp2 = (TextView) findViewById(R.id.exp2);
        exp3 = (EditText)findViewById(R.id.edittxt1);
        exp4 = (EditText)findViewById(R.id.edittxt2);

        rdgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (celsius.isChecked())
                {
                    celsius.setTextColor(Color.RED);
                    fahrenheit.setTextColor(Color.WHITE);
                    kelvin.setTextColor(Color.WHITE);
                }
                if (fahrenheit.isChecked())
                {
                    celsius.setTextColor(Color.WHITE);
                    fahrenheit.setTextColor(Color.RED);
                    kelvin.setTextColor(Color.WHITE);
                }
                if (kelvin.isChecked())
                {
                    celsius.setTextColor(Color.WHITE);
                    fahrenheit.setTextColor(Color.WHITE);
                    kelvin.setTextColor(Color.RED);
                }
            }
        });

        rdgroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (celsius2.isChecked())
                {
                    celsius2.setTextColor(Color.RED);
                    fahrenheit2.setTextColor(Color.WHITE);
                    kelvin2.setTextColor(Color.WHITE);
                }
                if (fahrenheit2.isChecked())
                {
                    celsius2.setTextColor(Color.WHITE);
                    fahrenheit2.setTextColor(Color.RED);
                    kelvin2.setTextColor(Color.WHITE);
                }
                if (kelvin2.isChecked())
                {
                    celsius2.setTextColor(Color.WHITE);
                    fahrenheit2.setTextColor(Color.WHITE);
                    kelvin2.setTextColor(Color.RED);
                }
            }
        });
    }
    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        String str="";

        try
        {
            switch (view.getId())
            {
                case R.id.celsius:
                    if (checked)
                    {
                        str = "Celsius Selected";
                        exp1.setText("Celsius");
                        c1 = true;
                        exp1.getText();
                    }
                    break;
                case R.id.fahrenheit:
                    if (checked)
                    {
                        str = "Fahrenheit Selected";
                        exp1.setText("Fahrenheit");
                        f1 = true;
                    }
                    break;
                case R.id.kelvin:
                    if (checked)
                    {
                        str = "Kelvin Selected";
                        exp1.setText("Kelvin");
                        k1 = true;
                    }
                    break;

                case R.id.celsius2:
                    if (checked)
                    {
                        str = "Celsius Selected";
                        exp2.setText("Celsius");
                        c2 = true;
                    }
                    break;
                case R.id.fahrenheit2:
                    if (checked)
                    {
                        str = "Fahrenheit Selected";
                        exp2.setText("Fahrenheit");
                        f2 = true;
                    }
                    break;
                case R.id.kelvin2:
                    if (checked)
                    {
                        str = "Kelvin Selected";
                        exp2.setText("Kelvin");
                        k2 = true;
                    }
                    break;
            }

            if (c1 == true && c2 == true)
            {
                double cel = Double.parseDouble(exp3.getText() + "");
                exp4.setText(cel + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            }
            else if (f1 == true && c2 == true)
            {
                double fah = Double.parseDouble(exp3.getText() + "");
                exp4.setText((5.0 / 9 * (fah - 32)) + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            }
            else if (k1 == true && c2 == true)
            {
                double kel = Double.parseDouble(exp3.getText() + "");
                exp4.setText((kel - 273.15) + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            }
            else if (c1 == true && f2 == true)
            {
                double cel = Double.parseDouble(exp3.getText() + "");
                exp4.setText(((cel * 9.0 / 5) + 32) + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            }
            else if (f1 == true && f2 == true)
            {
                double fah = Double.parseDouble(exp3.getText() + "");
                exp4.setText(fah + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            }
            else if (k1 == true && f2 == true)
            {
                double kel = Double.parseDouble(exp3.getText() + "");
                exp4.setText(((kel - 273.15) * 9.0 / 5 + 32) + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            } else if (c1 == true && k2 == true)
            {
                double cel = Double.parseDouble(exp3.getText() + "");
                exp4.setText((cel + 273.15) + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            }
            else if (f1 == true && k2 == true)
            {
                double fah = Double.parseDouble(exp3.getText() + "");
                exp4.setText(((fah - 32) * 5.0 / 9 + 273.15) + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            }
            else if (k1 == true && k2 == true)
            {
                double kel = Double.parseDouble(exp3.getText() + "");
                exp4.setText(kel + "");
                c1 = false;
                c2 = false;
                f1 = false;
                f2 = false;
                k1 = false;
                k2 = false;
            }
            Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {
        }
    }
}
