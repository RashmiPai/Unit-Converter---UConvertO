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

public class speed extends Activity
{
    RadioButton mps1,kph1,kps1,mph1,fps1,ips1,ls1,mps2,kph2,kps2,mph2,fps2,ips2,ls2;
    RadioGroup rdgroup1,rdgroup2;
    TextView exp1,exp2;
    EditText exp3,exp4;
    boolean s1,s2,s3,s4,s5,s6,s7,p1,p2,p3,p4,p5,p6,p7;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed);

        rdgroup1 = (RadioGroup)findViewById(R.id.rdGroup);
        rdgroup2 = (RadioGroup)findViewById(R.id.rdGroup2);

        mps1 = (RadioButton)findViewById(R.id.mps);
        kph1 = (RadioButton)findViewById(R.id.kph);
        kps1 = (RadioButton)findViewById(R.id.kps);
        mph1 = (RadioButton)findViewById(R.id.mph);
        fps1 = (RadioButton)findViewById(R.id.fps);
        ips1= (RadioButton)findViewById(R.id.ips);
        ls1= (RadioButton)findViewById(R.id.ls);
        mps2 = (RadioButton)findViewById(R.id.mps2);
        kph2 = (RadioButton)findViewById(R.id.kph2);
        kps2 = (RadioButton)findViewById(R.id.kps2);
        mph2 = (RadioButton)findViewById(R.id.mph2);
        fps2 = (RadioButton)findViewById(R.id.fps2);
        ips2= (RadioButton)findViewById(R.id.ips2);
        ls2= (RadioButton)findViewById(R.id.ls2);

        exp1 = (TextView) findViewById(R.id.exp1);
        exp2 = (TextView) findViewById(R.id.exp2);
        exp3 = (EditText)findViewById(R.id.edittxt1);
        exp4 = (EditText)findViewById(R.id.edittxt2);

        rdgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (mps1.isChecked())
                {
                    mps1.setTextColor(Color.RED);
                    kph1.setTextColor(Color.WHITE);
                    kps1.setTextColor(Color.WHITE);
                    mph1.setTextColor(Color.WHITE);
                    fps1.setTextColor(Color.WHITE);
                    ips1.setTextColor(Color.WHITE);
                    ls1.setTextColor(Color.WHITE);
                }
                if (kph1.isChecked())
                {
                    mps1.setTextColor(Color.WHITE);
                    kph1.setTextColor(Color.RED);
                    kps1.setTextColor(Color.WHITE);
                    mph1.setTextColor(Color.WHITE);
                    fps1.setTextColor(Color.WHITE);
                    ips1.setTextColor(Color.WHITE);
                    ls1.setTextColor(Color.WHITE);
                }
                if (kps1.isChecked())
                {
                    mps1.setTextColor(Color.WHITE);
                    kph1.setTextColor(Color.WHITE);
                    kps1.setTextColor(Color.RED);
                    mph1.setTextColor(Color.WHITE);
                    fps1.setTextColor(Color.WHITE);
                    ips1.setTextColor(Color.WHITE);
                    ls1.setTextColor(Color.WHITE);
                }
                if (mph1.isChecked())
                {
                    mps1.setTextColor(Color.WHITE);
                    kph1.setTextColor(Color.WHITE);
                    kps1.setTextColor(Color.WHITE);
                    mph1.setTextColor(Color.RED);
                    fps1.setTextColor(Color.WHITE);
                    ips1.setTextColor(Color.WHITE);
                    ls1.setTextColor(Color.WHITE);
                }
                if (fps1.isChecked())
                {
                    mps1.setTextColor(Color.WHITE);
                    kph1.setTextColor(Color.WHITE);
                    kps1.setTextColor(Color.WHITE);
                    mph1.setTextColor(Color.WHITE);
                    fps1.setTextColor(Color.RED);
                    ips1.setTextColor(Color.WHITE);
                    ls1.setTextColor(Color.WHITE);
                }
                if (ips1.isChecked())
                {
                    mps1.setTextColor(Color.WHITE);
                    kph1.setTextColor(Color.WHITE);
                    kps1.setTextColor(Color.WHITE);
                    mph1.setTextColor(Color.WHITE);
                    fps1.setTextColor(Color.WHITE);
                    ips1.setTextColor(Color.RED);
                    ls1.setTextColor(Color.WHITE);
                }
                if (ls1.isChecked())
                {
                    mps1.setTextColor(Color.WHITE);
                    kph1.setTextColor(Color.WHITE);
                    kps1.setTextColor(Color.WHITE);
                    mph1.setTextColor(Color.WHITE);
                    fps1.setTextColor(Color.WHITE);
                    ips1.setTextColor(Color.WHITE);
                    ls1.setTextColor(Color.RED);
                }
            }
        });

        rdgroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                if (mps2.isChecked())
                {
                    mps2.setTextColor(Color.RED);
                    kph2.setTextColor(Color.WHITE);
                    kps2.setTextColor(Color.WHITE);
                    mph2.setTextColor(Color.WHITE);
                    fps2.setTextColor(Color.WHITE);
                    ips2.setTextColor(Color.WHITE);
                    ls2.setTextColor(Color.WHITE);
                }
                if (kph2.isChecked())
                {
                    mps2.setTextColor(Color.WHITE);
                    kph2.setTextColor(Color.RED);
                    kps2.setTextColor(Color.WHITE);
                    mph2.setTextColor(Color.WHITE);
                    fps2.setTextColor(Color.WHITE);
                    ips2.setTextColor(Color.WHITE);
                    ls2.setTextColor(Color.WHITE);
                }
                if (kps2.isChecked())
                {
                    mps2.setTextColor(Color.WHITE);
                    kph2.setTextColor(Color.WHITE);
                    kps2.setTextColor(Color.RED);
                    mph2.setTextColor(Color.WHITE);
                    fps2.setTextColor(Color.WHITE);
                    ips2.setTextColor(Color.WHITE);
                    ls2.setTextColor(Color.WHITE);
                }
                if (mph2.isChecked())
                {
                    mps2.setTextColor(Color.WHITE);
                    kph2.setTextColor(Color.WHITE);
                    kps2.setTextColor(Color.WHITE);
                    mph2.setTextColor(Color.RED);
                    fps2.setTextColor(Color.WHITE);
                    ips2.setTextColor(Color.WHITE);
                    ls2.setTextColor(Color.WHITE);
                }
                if (fps2.isChecked())
                {
                    mps2.setTextColor(Color.WHITE);
                    kph2.setTextColor(Color.WHITE);
                    kps2.setTextColor(Color.WHITE);
                    mph2.setTextColor(Color.WHITE);
                    fps2.setTextColor(Color.RED);
                    ips2.setTextColor(Color.WHITE);
                    ls2.setTextColor(Color.WHITE);
                }
                if (ips2.isChecked())
                {
                    mps2.setTextColor(Color.WHITE);
                    kph2.setTextColor(Color.WHITE);
                    kps2.setTextColor(Color.WHITE);
                    mph2.setTextColor(Color.WHITE);
                    fps2.setTextColor(Color.WHITE);
                    ips2.setTextColor(Color.RED);
                    ls2.setTextColor(Color.WHITE);
                }
                if (ls2.isChecked())
                {
                    mps2.setTextColor(Color.WHITE);
                    kph2.setTextColor(Color.WHITE);
                    kps2.setTextColor(Color.WHITE);
                    mph2.setTextColor(Color.WHITE);
                    fps2.setTextColor(Color.WHITE);
                    ips2.setTextColor(Color.WHITE);
                    ls2.setTextColor(Color.RED);
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
                case R.id.mps:
                    if (checked)
                    {
                        str = "Metre per Second m/s Selected";
                        exp1.setText("Metre per Second m/s");
                        s1 = true;
                        exp1.getText();
                    }
                    break;
                case R.id.kph:
                    if (checked)
                    {
                        str = "Kilometre per Hour km/h Selected";
                        exp1.setText("Kilometre per Hour km/h");
                        s2 = true;
                    }
                    break;
                case R.id.kps:
                    if (checked)
                    {
                        str = "Kilometre per Second km/s Selected";
                        exp1.setText("Kilometre per Second km/s");
                        s3 = true;
                    }
                    break;

                case R.id.mph:
                    if (checked)
                    {
                        str = "Mile per Hour mph Selected";
                        exp1.setText("Mile per Hour mph");
                        s4 = true;
                    }
                    break;
                case R.id.fps:
                    if (checked)
                    {
                        str = "Foot per Second fps Selected";
                        exp1.setText("Foot per Second fps");
                        s5 = true;
                    }
                    break;
                case R.id.ips:
                    if (checked)
                    {
                        str = "Inch per Second ips Selected";
                        exp1.setText("Inch per Second ips");
                        s6 = true;
                    }
                    break;
                case R.id.ls:
                    if (checked)
                    {
                        str = "Lightspeed c Selected";
                        exp1.setText("Lightspeed c");
                        s7 = true;
                    }
                    break;
                case R.id.mps2:
                    if (checked)
                    {
                        str = "Metre per Second m/s Selected";
                        exp2.setText("Metre per Second m/s");
                        p1 = true;
                        exp1.getText();
                    }
                    break;
                case R.id.kph2:
                    if (checked)
                    {
                        str = "Kilometre per Hour km/h Selected";
                        exp2.setText("Kilometre per Hour km/h");
                        p2 = true;
                    }
                    break;
                case R.id.kps2:
                    if (checked)
                    {
                        str = "Kilometre per Second km/s Selected";
                        exp2.setText("Kilometre per Second km/s");
                        p3 = true;
                    }
                    break;

                case R.id.mph2:
                    if (checked)
                    {
                        str = "Mile per Hour mph Selected";
                        exp2.setText("Mile per Hour mph");
                        p4 = true;
                    }
                    break;
                case R.id.fps2:
                    if (checked)
                    {
                        str = "Foot per Second fps Selected";
                        exp2.setText("Foot per Second fps");
                        p5 = true;
                    }
                    break;
                case R.id.ips2:
                    if (checked)
                    {
                        str = "Inch per Second ips Selected";
                        exp2.setText("Inch per Second ips");
                        p6 = true;
                    }
                    break;
                case R.id.ls2:
                    if (checked)
                    {
                        str = "Lightspeed c Selected";
                        exp2.setText("Lightspeed c");
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
                exp4.setText((result*3.6) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/1000.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*2.237) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*3.281) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*39.37) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s1 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/(2.998*Math.pow(10,8))) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s2 == true && p1 == true)                                                               // 2
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/3.6) + "");
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
                exp4.setText((result/3600.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/1.609) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/1.097) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*10.936) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s2 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/(1.079*Math.pow(10,9))) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s3 == true && p1 == true)                                                               // 3
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*1000.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*3600.0) + "");
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
                exp4.setText((result*2236.936) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p5 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*3280.84) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*39370.079) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s3 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/299792.458) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s4 == true && p1 == true)                                                               // 4
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/2.237) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*1.609) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/2236.936) + "");
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
                exp4.setText((result*1.467) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p6 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*17.6) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s4 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/(6.706*Math.pow(10,8))) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s5 == true && p1 == true)                                                               // 5
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/3.281) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p2 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result*1.097) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p3 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/3280.84) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p4 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/1.467) + "");
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
                exp4.setText((result*12.0) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }
            else if (s5 == true && p7 == true)
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/(9.836*Math.pow(10,8))) + "");
                s1 = false; s2 = false;s3 = false;s4 = false;s5 = false;s6 = false;s7 = false;
                p1 = false; p2 = false;p3 = false;p4 = false;p5 = false;p6 = false;p7 = false;
            }

            if (s6 == true && p1 == true)                                                               // 6
            {
                double result = Double.parseDouble(exp3.getText() + "");
                exp4.setText((result/39.37)+ "");
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