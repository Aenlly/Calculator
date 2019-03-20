package com.example.administrator.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView ding_view;//
    private int renshu=4;//人数

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        final RadioGroup rdg=(RadioGroup)findViewById(R.id.rdg);//单选按钮组

        final RadioButton four=(RadioButton)findViewById(R.id.tree);//单选按钮

        final EditText caitou=(EditText)findViewById(R.id.daduoda);

        final EditText huo1 =(EditText)findViewById(R.id.huo1);
        final EditText huo2 =(EditText)findViewById(R.id.huo2);
        final EditText huo3 =(EditText)findViewById(R.id.huo3);
        final EditText huo4 =(EditText)findViewById(R.id.huo4);

        final EditText tuo1 =(EditText)findViewById(R.id.tuo1);
        final EditText tuo2 =(EditText)findViewById(R.id.tuo2);
        final EditText tuo3 =(EditText)findViewById(R.id.tuo3);
        final EditText tuo4 =(EditText)findViewById(R.id.tuo4);

        final EditText xi1 =(EditText)findViewById(R.id.xi1);
        final EditText xi2 =(EditText)findViewById(R.id.xi2);
        final EditText xi3 =(EditText)findViewById(R.id.xi3);
        final EditText xi4 =(EditText)findViewById(R.id.xi4);

        final EditText guo1=(EditText)findViewById(R.id.guo1);
        final EditText guo2=(EditText)findViewById(R.id.guo2);
        final EditText guo3=(EditText)findViewById(R.id.guo3);
        final EditText guo4=(EditText)findViewById(R.id.guo4);


        final Button but_js=(Button)findViewById(R.id.jisuan);
        final Button but_qc=(Button)findViewById(R.id.qingchu);
        final Button but_tc=(Button)findViewById(R.id.tuichu);

        but_qc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<4;i++) {
                    huo1.setText("0");
                    huo2.setText("0");
                    huo3.setText("0");
                    huo4.setText("0");

                    tuo1.setText("0");
                    tuo2.setText("0");
                    tuo3.setText("0");
                    tuo4.setText("0");


                    xi1.setText("0");
                    xi2.setText("0");
                    xi3.setText("0");
                    xi4.setText("0");

                    guo1.setText("0");
                    guo2.setText("0");
                    guo3.setText("0");
                    guo4.setText("0");

                    caitou.setText("0.5");
                }
            }
        });

        but_tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.tree) {
                    tuo4.setEnabled(false);
                    huo4.setEnabled(false);
                    xi4.setEnabled(false);
                    tuo4.setText("");
                    huo4.setText("");
                    xi4.setText("");
                }
                else
                {
                    tuo4.setEnabled(true);
                    huo4.setEnabled(true);
                    xi4.setEnabled(true);
                }
            }
        });
    }
}
