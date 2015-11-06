package com.example.yo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText valor1;
    EditText valor2;
    TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText)findViewById(R.id.edtvalor1);
        valor2 = (EditText)findViewById(R.id.edtvalor2);
        tvresult = (TextView)findViewById(R.id.tvreultado);
    }

    private boolean verifica(){
        if(valor1.getText().equals("") | valor2.getText().equals("")){
            tvresult.setText("Prenecha os campos.");
            return false;
        }else{
            return true;
        }

    }

    public void mais(View view) {
        double v1 = Double.parseDouble(valor1.getText().toString());
        double v2 = Double.parseDouble(valor2.getText().toString());
        if (verifica()){
            tvresult.setText(""+(v1 + v2));
        }


    }

    public void menos(View view) {
        double v1 = Double.parseDouble(valor1.getText().toString());
        double v2 = Double.parseDouble(valor2.getText().toString());
        if (verifica()) {
            tvresult.setText("" + (v1 - v2));
        }
    }

    public void divide(View view) {
        double v1 = Double.parseDouble(valor1.getText().toString());
        double v2 = Double.parseDouble(valor2.getText().toString());
        if (verifica()) {
            tvresult.setText("" + (v1 / v2));
        }
    }

    public void multiplica(View view) {
        double v1 = Double.parseDouble(valor1.getText().toString());
        double v2 = Double.parseDouble(valor2.getText().toString());
        if (verifica()) {
            tvresult.setText("" + (v1 * v2));
        }

    }
}
