package com.example.administrator.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        float arc=4;
        findViewBy();
    }
    private void findViewBy(){
        RadioGroup rdg=(RadioGroup)findViewById(R.id.rdg);

        RadioButton four=(RadioButton)findViewById(R.id.tree);

        EditText duoda=(EditText)findViewById(R.id.daduoda);

        EditText huo1 =(EditText)findViewById(R.id.huo1);
        EditText huo2 =(EditText)findViewById(R.id.huo2);
        EditText huo3 =(EditText)findViewById(R.id.huo3);
        EditText huo4 =(EditText)findViewById(R.id.huo4);

        EditText tuo1 =(EditText)findViewById(R.id.tuo1);
        EditText tuo2 =(EditText)findViewById(R.id.tuo2);
        EditText tuo3 =(EditText)findViewById(R.id.tuo3);
        EditText tuo4 =(EditText)findViewById(R.id.tuo4);

        EditText xi1 =(EditText)findViewById(R.id.xi1);
        EditText xi2 =(EditText)findViewById(R.id.xi2);
        EditText xi3 =(EditText)findViewById(R.id.xi3);
        EditText xi4 =(EditText)findViewById(R.id.xi4);

        EditText guo1=(EditText)findViewById(R.id.guo1);
        EditText guo2=(EditText)findViewById(R.id.guo2);
        EditText guo3=(EditText)findViewById(R.id.guo3);
        EditText guo4=(EditText)findViewById(R.id.guo4);

        Button but_js=(Button)findViewById(R.id.jisuan);
        Button but_qc=(Button)findViewById(R.id.qingchu);
        Button but_tc=(Button)findViewById(R.id.tuichu);
    }
}
