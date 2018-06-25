package com.example.nehagupta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonadd,
    /*buttonsubtract,buttonmultiply,buttondivide*/buttonequals,buttonclear,buttonsubtract,buttonmultiply,buttondivide;
    EditText editText;
    float value1, value2;
    boolean addition,subtraction,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
        button0 = findViewById(R.id.zero);
        button1 = findViewById(R.id.one);
        button2 = findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 = findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 = findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 = findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);
        buttonadd = findViewById(R.id.plus);
        buttonclear=findViewById(R.id.clear);
         buttonsubtract  = findViewById(R.id.minus);
         buttonmultiply  = findViewById(R.id.mult);
        buttondivide  = findViewById(R.id.divide);
        buttonequals = findViewById(R.id.equals);
        /*String opp1 = editText.getText().toString().trim();
        int a= Integer.parseInt(opp1);
        */
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                  editText.setText(editText.getText() + "0");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "9");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(editText.getText() + "");

                addition = true;
                editText.setText(null);
            }

        });
        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(editText.getText() + "");
                subtraction = true;
                editText.setText(null);
            }

        });
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(editText.getText() + "");

                multiplication = true;
                editText.setText(null);
            }

        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(editText.getText() + "");
                division=true;
                editText.setText(null);
            }

        });

        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Float.parseFloat(editText.getText() + "");
                if (addition) {
                    editText.setText(value1 + value2 + "");
                    addition = false;
                }
                else if(subtraction)
                {
                    editText.setText((value1 - value2) + "");
                    subtraction = false;
                }
                else if(multiplication)
                {
                    editText.setText(value1 * value2 + "");
                    multiplication = false;
                }
                else if(division)
                {
                    editText.setText(value1 / value2 +"");
                    division = false;
                }
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });


    }
}

