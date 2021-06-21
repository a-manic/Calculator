package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView res;
    int n1,n2;
    String s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getOperands(){

        e1 = (EditText) findViewById(R.id.Operand1);
        e2 = (EditText) findViewById(R.id.Operand2);
        res = (TextView) findViewById(R.id.ResultBox);

        s1 = e1.getText().toString();
        s2 = e2.getText().toString();

        if((s1.equals("") && s2.equals("")) || (s1.equals("null") && s2.equals(" null"))){

            String result = "Please enter 2 values!";
            res.setText(result);
            return false;
        }

        else{

            n1 = Integer.parseInt(s1);
            n2 = Integer.parseInt(s2);
        }

        return true;
    }

    public void onSum(View view) {

        if(getOperands()){
            double sum = n1 + n2;
            res.setText(Double.toString(sum));
        }
    }


    public void onDiff(View view) {

        if(getOperands()){
            double sum = n1 - n2;
            res.setText(Double.toString(sum));
        }
    }

    public void onProduct(View view) {

        if(getOperands()){
            double sum = n1 * n2;
            res.setText(Double.toString(sum));
        }
    }

    public void onDivide(View view) {

        if(getOperands()){
            double sum = n1 / n2;
            res.setText(Double.toString(sum));
        }
    }

    public void onModulo(View view) {

        if(getOperands()){
            double sum = n1 % n2;
            res.setText(Double.toString(sum));
        }
    }

    public void onExpo(View view) {

        if(getOperands()){
            double sum = Math.pow(n1,n2);
            res.setText(Double.toString(sum));
        }
    }
}