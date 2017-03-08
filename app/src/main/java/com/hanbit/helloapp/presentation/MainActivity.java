package com.hanbit.helloapp.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.helloapp.R;
import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;
import com.hanbit.helloapp.serviceImpl.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etFirstNum ,etSecondNum;
    Button btPlus ,btMinus ,btnMod ,btMulti ,btDiv ,btEqual;
    TextView tvResult;
    int result;
    CalcBean calc;
    CalcService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstNum= (EditText) findViewById(R.id.etFirstNum);
        etSecondNum= (EditText) findViewById(R.id.etSecondNum);
        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button) findViewById(R.id.btMinus);
        btDiv = (Button) findViewById(R.id.btDiv);
        btMulti = (Button) findViewById(R.id.btMulti);
        btnMod = (Button) findViewById(R.id.btnMod);
        btEqual = (Button) findViewById(R.id.btEqual);
        tvResult = (TextView) findViewById(R.id.tvResult);
        result=0;

        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btnMod.setOnClickListener(this);
        btEqual.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        calc = new CalcBean();
        service = new CalcServiceImpl();
        int firstNum= Integer.parseInt(etFirstNum.getText().toString());
        int secondNum= Integer.parseInt(etSecondNum.getText().toString());
        calc.setFirstNum(firstNum);
        calc.setSecondNum(secondNum);
        Log.d("firstNum=",String.valueOf(firstNum));
        Log.d("SecondNum=",String.valueOf(secondNum));
        switch (v.getId()){
            case  R.id.btPlus :
                result=service.plus(calc);
                break;
            case  R.id.btMinus  :
                result=service.minus(calc);
                break;
            case  R.id.btDiv :
                result=service.div(calc);
                break;
            case R.id.btMulti :
                result=service.multi(calc);
                break;
            case  R.id.btnMod :
                result=service.mod(calc);
                break;
            case R.id.btEqual :
                tvResult.setText("RESULT : " + result);
                break;

        }
    }
}
