package com.example.yo.aula1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvValor1;
    private EditText edtValor1;
    TextView tvValor2;
    private EditText edtValor2;
    private TextView tvResult;
    Button btnSoma;
    private FloatingActionButton fab;
    RadioButton rbsoma;
    RadioButton rbsubitrai;
    RadioButton rbmultiplica;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvValor1 = (TextView) findViewById(R.id.tvValor1);
        tvValor2 = (TextView) findViewById(R.id.tvValor2);
        edtValor1 = (EditText) findViewById(R.id.edtValor1);
        edtValor2 = (EditText) findViewById(R.id.edtValor2);
        tvResult = (TextView) findViewById(R.id.tvResult);
        //btnSoma = (Button) findViewById(R.id.btnSomar);
        rbsoma = (RadioButton) findViewById(R.id.rbsoma);
        rbsubitrai = (RadioButton) findViewById(R.id.rbmenos);
        rbmultiplica = (RadioButton) findViewById(R.id.rbmultiplica);



        Log.i("1111111111111111", "@@@@@@@@@@@@@@@@@@ Actyvity Criado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("22222222222222222222", "@@@@@@@@@@@@@@@@@@ START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("33333333333333333333", "@@@@@@@@@@@@@@@@@@ RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("444444444444444444444", "@@@@@@@@@@@@@@@@@@@@@@@@@ PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("555555555555555555555", "@@@@@@@@@@@@@@@@@@ STOOOOOPPP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("666666666666666666666", "@@@@@@@@@@@@@@@@@@ DESTROOOYYYYYYYYYY NOOOOOOOOOOOO");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("777777777777777777777", "@@@@@@@@@@@@@@@@@@ RESTARTTTTT");
    }

    private boolean ifnull(){
        if(edtValor1.getText().toString().equals("") | edtValor2.getText().toString().equals("")){
            tvResult.setText("Os campos devem ser preenchidos.");
            return false;
        }
        else{
            return true;
        }
    }

    public void calcula(View view) {
        if(ifnull()){
            if(rbsoma.isChecked())
                tvResult.setText((int) ((Float.parseFloat(edtValor1.getText().toString())) + (Float.parseFloat(edtValor2.getText().toString()))));
            else if(rbsubitrai.isChecked())
                    tvResult.setText((int)((Float.parseFloat(edtValor1.getText().toString())) - (Float.parseFloat(edtValor2.getText().toString()))));
            else
                tvResult.setText((int)((Float.parseFloat(edtValor1.getText().toString())) * (Float.parseFloat(edtValor2.getText().toString()))));

            }
    }
}
