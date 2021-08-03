package com.example.converter;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class area extends Activity
{
    RadioButton sk1,hectare1,sm1,sd1,sc1,smm1,acre1,sk2,hectare2,sm2,sd2,sc2,smm2,acre2;
    RadioGroup rdgroup1,rdgroup2;
    TextView exp1,exp2;
    EditText exp3,exp4;
    boolean s1,s2,s3,s4,s5,s6,s7,p1,p2,p3,p4,p5,p6,p7;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area);

        rdgroup1 = (RadioGroup)findViewById(R.id.rdGroup);
        rdgroup2 = (RadioGroup)findViewById(R.id.rdGroup2);

        sk1 = (RadioButton)findViewById(R.id.sk);
        hectare1 = (RadioButton)findViewById(R.id.hectare);
        sm1 = (RadioButton)findViewById(R.id.sm);
        sd1 = (RadioButton)findViewById(R.id.sd);
        sc1 = (RadioButton)findViewById(R.id.sc);
        smm1= (RadioButton)findViewById(R.id.smm);
        acre1= (RadioButton)findViewById(R.id.acre);

        sk2 = (RadioButton)findViewById(R.id.sk2);
        hectare2 = (RadioButton)findViewById(R.id.hectare2);
        sm2 = (RadioButton)findViewById(R.id.sm2);
        sd2 = (RadioButton)findViewById(R.id.sd2);
        sc2 = (RadioButton)findViewById(R.id.sc2);
        smm2= (RadioButton)findViewById(R.id.smm2);
        acre2= (RadioButton)findViewById(R.id.acre2);

        exp1 = (TextView) findViewById(R.id.exp1);
        exp2 = (TextView) findViewById(R.id.exp2);
        exp3 = (EditText)findViewById(R.id.edittxt1);
        exp4 = (EditText)findViewById(R.id.edittxt2);

        rdgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (sk1.isChecked())
                {
                    sk1.setTextColor(Color.RED);
                    hectare1.setTextColor(Color.WHITE);
                    sm1.setTextColor(Color.WHITE);
                    sd1.setTextColor(Color.WHITE);
                    sc1.setTextColor(Color.WHITE);
                    smm1.setTextColor(Color.WHITE);
                    acre1.setTextColor(Color.WHITE);
                }
                if (hectare1.isChecked())
                {
                    sk1.setTextColor(Color.WHITE);
                    hectare1.setTextColor(Color.RED);
                    sm1.setTextColor(Color.WHITE);
                    sd1.setTextColor(Color.WHITE);
                    sc1.setTextColor(Color.WHITE);
                    smm1.setTextColor(Color.WHITE);
                    acre1.setTextColor(Color.WHITE);
                }
                if (sm1.isChecked())
                {
                    sk1.setTextColor(Color.WHITE);
                    hectare1.setTextColor(Color.WHITE);
                    sm1.setTextColor(Color.RED);
                    sd1.setTextColor(Color.WHITE);
                    sc1.setTextColor(Color.WHITE);
                    smm1.setTextColor(Color.WHITE);
                    acre1.setTextColor(Color.WHITE);
                }
                if (sd1.isChecked())
                {
                    sk1.setTextColor(Color.WHITE);
                    hectare1.setTextColor(Color.WHITE);
                    sm1.setTextColor(Color.WHITE);
                    sd1.setTextColor(Color.RED);
                    sc1.setTextColor(Color.WHITE);
                    smm1.setTextColor(Color.WHITE);
                    acre1.setTextColor(Color.WHITE);
                }
                if (sc1.isChecked())
                {
                    sk1.setTextColor(Color.WHITE);
                    hectare1.setTextColor(Color.WHITE);
                    sm1.setTextColor(Color.WHITE);
                    sd1.setTextColor(Color.WHITE);
                    sc1.setTextColor(Color.RED);
                    smm1.setTextColor(Color.WHITE);
                    acre1.setTextColor(Color.WHITE);
                }
                if (smm1.isChecked())
                {
                    sk1.setTextColor(Color.WHITE);
                    hectare1.setTextColor(Color.WHITE);
                    sm1.setTextColor(Color.WHITE);
                    sd1.setTextColor(Color.WHITE);
                    sc1.setTextColor(Color.WHITE);
                    smm1.setTextColor(Color.RED);
                    acre1.setTextColor(Color.WHITE);
                }
                if (acre1.isChecked())
                {
                    sk1.setTextColor(Color.WHITE);
                    hectare1.setTextColor(Color.WHITE);
                    sm1.setTextColor(Color.WHITE);
                    sd1.setTextColor(Color.WHITE);
                    sc1.setTextColor(Color.WHITE);
                    smm1.setTextColor(Color.WHITE);
                    acre1.setTextColor(Color.RED);
                }
            }
        });

        rdgroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (sk2.isChecked())
                {
                    sk2.setTextColor(Color.RED);
                    hectare2.setTextColor(Color.WHITE);
                    sm2.setTextColor(Color.WHITE);
                    sd2.setTextColor(Color.WHITE);
                    sc2.setTextColor(Color.WHITE);
                    smm2.setTextColor(Color.WHITE);
                    acre2.setTextColor(Color.WHITE);
                }
                if (hectare2.isChecked())
                {
                    sk2.setTextColor(Color.WHITE);
                    hectare2.setTextColor(Color.RED);
                    sm2.setTextColor(Color.WHITE);
                    sd2.setTextColor(Color.WHITE);
                    sc2.setTextColor(Color.WHITE);
                    smm2.setTextColor(Color.WHITE);
                    acre2.setTextColor(Color.WHITE);
                }
                if (sm2.isChecked())
                {
                    sk2.setTextColor(Color.WHITE);
                    hectare2.setTextColor(Color.WHITE);
                    sm2.setTextColor(Color.RED);
                    sd2.setTextColor(Color.WHITE);
                    sc2.setTextColor(Color.WHITE);
                    smm2.setTextColor(Color.WHITE);
                    acre2.setTextColor(Color.WHITE);
                }
                if (sd2.isChecked())
                {
                    sk2.setTextColor(Color.WHITE);
                    hectare2.setTextColor(Color.WHITE);
                    sm2.setTextColor(Color.WHITE);
                    sd2.setTextColor(Color.RED);
                    sc2.setTextColor(Color.WHITE);
                    smm2.setTextColor(Color.WHITE);
                    acre2.setTextColor(Color.WHITE);
                }
                if (sc2.isChecked())
                {
                    sk2.setTextColor(Color.WHITE);
                    hectare2.setTextColor(Color.WHITE);
                    sm2.setTextColor(Color.WHITE);
                    sd2.setTextColor(Color.WHITE);
                    sc2.setTextColor(Color.RED);
                    smm2.setTextColor(Color.WHITE);
                    acre2.setTextColor(Color.WHITE);
                }
                if (smm2.isChecked())
                {
                    sk2.setTextColor(Color.WHITE);
                    hectare2.setTextColor(Color.WHITE);
                    sm2.setTextColor(Color.WHITE);
                    sd2.setTextColor(Color.WHITE);
                    sc2.setTextColor(Color.WHITE);
                    smm2.setTextColor(Color.RED);
                    acre2.setTextColor(Color.WHITE);
                }
                if (acre2.isChecked())
                {
                    sk2.setTextColor(Color.WHITE);
                    hectare2.setTextColor(Color.WHITE);
                    sm2.setTextColor(Color.WHITE);
                    sd2.setTextColor(Color.WHITE);
                    sc2.setTextColor(Color.WHITE);
                    smm2.setTextColor(Color.WHITE);
                    acre2.setTextColor(Color.RED);
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
                case R.id.sk:
                    if (checked)
                    {
                        str = "Square Kilometre km2 selected";
                        exp1.setText("Square Kilometre km2");
                        s1 = true;
                        exp1.getText();
                    }
                    break;
                case R.id.hectare:
                    if (checked)
                    {
                        str = "Hectare ha selected";
                        exp1.setText("Hectare ha");
                        s2 = true;
                    }
                    break;
                case R.id.sm:
                    if (checked)
                    {
                        str = "Square Metre m2 selected";
                        exp1.setText("Square Metre m2");
                        s3 = true;
                    }
                    break;

                case R.id.sd:
                    if (checked)
                    {
                        str = "Square Decimetre dm2 selected";
                        exp1.setText("Square Decimetre dm2");
                        s4 = true;
                    }
                    break;
                case R.id.sc:
                    if (checked)
                    {
                        str = "Square Centimetre cm2 selected";
                        exp1.setText("Square Centimetre cm2");
                        s5 = true;
                    }
                    break;
                case R.id.smm:
                    if (checked)
                    {
                        str = "Square Millimetre mm2 Selected";
                        exp1.setText("Square Millimetre mm2");
                        s6 = true;
                    }
                    break;
                case R.id.acre:
                    if (checked)
                    {
                        str = "Acre ac Selected";
                        exp1.setText("Acre ac");
                        s7 = true;
                    }
                    break;
                case R.id.sk2:
                    if (checked)
                    {
                        str = "Square Kilometre km2 Selected";
                        exp2.setText("Square Kilometre km2");
                        p1 = true;
                        exp1.getText();
                    }
                    break;
                case R.id.hectare2:
                    if (checked)
                    {
                        str = "Hectare ha Selected";
                        exp2.setText("Hectare ha");
                        p2 = true;
                    }
                    break;
                case R.id.sm2:
                    if (checked)
                    {
                        str = "Square Metre m2 Selected";
                        exp2.setText("Square Metre m2");
                        p3 = true;
                    }
                    break;

                case R.id.sd2:
                    if (checked)
                    {
                        str = "Square Decimetre dm2 Selected";
                        exp2.setText("Square Decimetre dm2");
                        p4 = true;
                    }
                    break;
                case R.id.sc2:
                    if (checked)
                    {
                        str = "Square Centimetre cm2 Selected";
                        exp2.setText("Square Centimetre cm2");
                        p5 = true;
                    }
                    break;
                case R.id.smm2:
                    if (checked)
                    {
                        str = "Square Millimetre mm2 Selected";
                        exp2.setText("Inch per Second ips");
                        p6 = true;
                    }
                    break;
                case R.id.acre2:
                    if (checked)
                    {
                        str = "Acre ac Selected";
                        exp2.setText("Acre ac");
                        p7 = true;
                    }
                    break;
            }

            if (s1 == true && p1 == true)                                                                // 1
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText(result + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*100) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,6)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,8)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,10)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,12)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/(2.998*247.105)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s2 == true && p1 == true)                                                               // 2
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/100.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText(result + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*10000) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,6)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,8)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,10)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*2.471) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s3 == true && p1 == true)                                                               // 3
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,-6)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/10000.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText(result + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*100.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*10000) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*Math.pow(10,6)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/4046.856) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s4 == true && p1 == true)                                                               // 4
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/Math.pow(10,-8)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/Math.pow(10,-6)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/100.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText(result + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*100) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*10000) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/404685.642) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s5 == true && p1 == true)                                                               // 5
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/Math.pow(10,-10)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/Math.pow(10,-8)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/Math.pow(10,-4)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/100.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText(result + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*100) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/(4.047*Math.pow(10,7))) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s6 == true && p1 == true)                                                               // 6
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/Math.pow(10,-12))+ "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s6 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/10.936) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s6 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/39370.079) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s6 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/17.6) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s6 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/12.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s6 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText(result + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s6 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/(1.18*Math.pow(10,10))) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s7 == true && p1 == true)                                                               // 7
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*(2.998*Math.pow(10,8))) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s7 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*1.079*Math.pow(10,9)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s7 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*299792.458) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s7 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*6.706*Math.pow(10,8)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s7 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*9.836*Math.pow(10,8)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s7 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*1.18*Math.pow(10,10)) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s7 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText(result + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {
        }
    }
}
