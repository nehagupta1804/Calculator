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
    String val2 = "";
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
                  if (addition || subtraction || multiplication || division) {
                      val2+="0";
                  }

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "1");
                if (addition || subtraction || multiplication || division) {
                    val2+="1";
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "2");
                if (addition || subtraction || multiplication || division) {
                    val2+="2";
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "3");
                if (addition || subtraction || multiplication || division) {
                    val2+="3";
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "4");
                if (addition || subtraction || multiplication || division) {
                    val2+="4";
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "5");
                if (addition || subtraction || multiplication || division) {
                    val2+="5";
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "6");
                if (addition || subtraction || multiplication || division) {
                    val2+="6";
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "7");
                if (addition || subtraction || multiplication || division) {
                    val2+="7";
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "8");
                if (addition || subtraction || multiplication || division) {
                    val2+="8";
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText.setText(editText.getText() + "9");
                if (addition || subtraction || multiplication || division) {
                    val2+="9";
                }
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(editText.getText() + "");

                addition = true;
                editText.setText(editText.getText() + " + ");
            }

        });
        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(editText.getText() + "");
                subtraction = true;
                editText.setText(editText.getText() + " - ");
            }

        });
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(editText.getText() + "");

                multiplication = true;
                editText.setText(editText.getText() + " x ");
            }

        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value1 = Float.parseFloat(editText.getText() + "");
                division=true;
                editText.setText(editText.getText() + " / ");
            }

        });

        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Float.parseFloat(val2);
                if (addition) {
                    Float result = value1 + value2;
                    editText.setText(editText.getText() + " = "+ result + "");
                    addition = false;
                }
                else if(subtraction)
                {
                    Float result = value1 - value2;
                    editText.setText(editText.getText() + " = " + result + "");
                    subtraction = false;
                }
                else if(multiplication)
                {
                    Float result = value1 * value2;
                    editText.setText(editText.getText() + " = " +  result + "");
                    multiplication = false;
                }
                else if(division)
                {
                    Float result = value1 / value2;
                    editText.setText(editText.getText() + " = " +  result +"");
                    division = false;
                }
                val2 = "";
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                val2 = "";
            }
        });


    }
}

