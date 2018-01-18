package com.example.mayank.lab1_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    private int result;
    private double num1 =0;
    private double num2 =0;
    TextView tvResult;
    Button btn1 , btn2 ,btn3 , btn4 , btn5, btn6, btn7, btn8 , btn9 , btnplus, btnequal , btnclear,btn0,btndec,btnsub;
    boolean decAl = false ;

    public static String fmt(double d)
    {
        if(d == (long) d) {

            return String.format("%d", (long) d);

        }
        else

            return String.format("%s",d);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.result);
        btn1  = findViewById(R.id.one);
        btn2  = findViewById(R.id.two);
        btn3  = findViewById(R.id.three);
        btn4  = findViewById(R.id.four);
        btn5  = findViewById(R.id.five);
        btn6  = findViewById(R.id.six);
        btn7  = findViewById(R.id.seven);
        btn8  = findViewById(R.id.eigth);
        btn9  = findViewById(R.id.nine);
        btn0  = findViewById(R.id.zero);
        btndec  = findViewById(R.id.decimal);
        //btnsub = findViewById(R.id.sub);
        btnplus  = findViewById(R.id.plus);
        btnequal  = findViewById(R.id.equal);
        btnclear  = findViewById(R.id.clear);
        btn1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"1");
            }
        });
        btn2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"2");
            }
        });
        btn3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"3");
            }
        });
        btn4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"4");
            }
        });
        btn5.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"5");
            }
        });
        btn6.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"6");
            }
        });
        btn7.setOnClickListener(new OnClickListener(){
            @Override
                public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"7");
            }
        });
        btn8.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"8");
            }
        });
        btn9.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"9");
            }
        });
        btn0.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText(tvResult.getText()+"0");
            }
        });
        btndec.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                if(!decAl){
                    tvResult.setText(tvResult.getText()+".");
                    decAl = true;
                }
            }
        });
        btnclear.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                tvResult.setText("");
                num1 = 0 ;
                num2 = 0;
                decAl = false;
            }
        });
        btnplus.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                num2 = Double.parseDouble(tvResult.getText().toString());
                num1 = num1 + num2;
                tvResult.setText(null);
                decAl = false;
                num2 = 0;
            }
        });
//        btnsub.setOnClickListener(new OnClickListener(){
//            @Override
//            public void onClick(android.view.View v){
//                num2 = Double.parseDouble(tvResult.getText().toString());
//                num1 = num1 - num2;
//                tvResult.setText(null);
//                num2 = 0;
//            }
//        });
        btnequal.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                num2 = Double.parseDouble(tvResult.getText().toString());
                num1 = num1 + num2 ;
                tvResult.setText(fmt(num1)+"");
                num1 = 0;

            }
        });

    }
}

