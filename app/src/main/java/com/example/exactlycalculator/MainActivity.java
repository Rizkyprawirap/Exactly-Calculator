package com.example.exactlycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputPertama,inputKedua;
    TextView hasil;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getNumber(){
        inputPertama = (EditText) findViewById(R.id.firstInput);
        inputKedua = (EditText) findViewById(R.id.secondInput);
        hasil = (TextView) findViewById(R.id.hasil);

        String f1 = inputPertama.getText().toString();
        String f2 = inputKedua.getText().toString();

        if((f1.equals(null) && f2.equals(null)) || (f1.equals("") && f2.equals(""))){
            String res = "Insert a Number";
            hasil.setText(res);

            return false;
        }
        else{
            num1 = Integer.parseInt(f1);
            num2 = Integer.parseInt(f2);
        }

        return true;
    }

    public void addition(View view) {
        if (getNumber()){
            int sum = num1 + num2;
            hasil.setText(Integer.toString(sum));
        }
    }

    public void subtraction(View view) {
        if (getNumber()){
            int sum = num1 - num2;
            hasil.setText(Integer.toString(sum));
        }
    }

    public void multiply(View view) {
        if (getNumber()){
            int sum = num1 * num2;
            hasil.setText(Integer.toString(sum));
        }
    }

    public void division(View view) {
        if (getNumber()){
            double sum = num1 / (num2 * 1.0);
            hasil.setText(Double.toString(sum));
        }
    }

}