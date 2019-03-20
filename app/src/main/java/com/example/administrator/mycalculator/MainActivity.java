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

    private RadioGroup rbg;
    private RadioButton three;
    private EditText editText[][]=new EditText[4][4];
    private int renshu=4;
    private int jieguo[]={0,0,0,0};
    private Button btn_tc,btn_qc,btn_js;

    private double caitou=0.5;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        findBy();

       btn_qc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<4;i++){
                    for (int j=0;j<4;j++){
                        editText[i][j].setText("0");
                    }
                }
            }
        });

        btn_tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        rbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==three.getId()) {
                    for (int i=0;i<3;i++) {
                        editText[3][i].setText("0");
                        editText[3][i].setEnabled(false);
                    }
                    renshu=3;
                }
                else{
                    for (int i=0;i<3;i++) {
                        editText[3][i].setEnabled(true);
                    }
                    renshu=4;
                }

            }
        });
        btn_js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void findBy(){

        rbg=(RadioGroup)findViewById(R.id.rdg);

        three=(RadioButton)findViewById(R.id.tree);

      /*  EditText daduoshao = (EditText) findViewById(R.id.daduoda);
        */
        editText[0][0] = (EditText) findViewById(R.id.huo1);
        editText[1][0] = (EditText) findViewById(R.id.huo2);
        editText[2][0] = (EditText) findViewById(R.id.huo3);
        editText[3][0] = (EditText) findViewById(R.id.huo4);


        editText[0][1] = (EditText) findViewById(R.id.tuo1);
        editText[1][1] = (EditText) findViewById(R.id.tuo2);
        editText[2][1] = (EditText) findViewById(R.id.tuo3);
        editText[3][1] = (EditText) findViewById(R.id.tuo4);


        editText[0][2] = (EditText) findViewById(R.id.xi1);
        editText[1][2] = (EditText) findViewById(R.id.xi2);
        editText[2][2] = (EditText) findViewById(R.id.xi3);
        editText[3][2] = (EditText) findViewById(R.id.xi4);


        editText[0][3] = (EditText) findViewById(R.id.guo1);
        editText[1][3] = (EditText) findViewById(R.id.guo2);
        editText[2][3] = (EditText) findViewById(R.id.guo3);
        editText[3][3] = (EditText) findViewById(R.id.guo4);


        btn_js = (Button) findViewById(R.id.jisuan);
        btn_qc = (Button) findViewById(R.id.qingchu);
        btn_tc = (Button) findViewById(R.id.tuichu);
    }
}
