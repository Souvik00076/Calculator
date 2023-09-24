package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button plusButton, minusButton, enterButton, acButton, mulButton, percentButton, modButton, pieButton;
    private EditText inputBox;
    private TextView resultTv;
    private Button oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String flag = inputBox.getText().toString();
                inputBox.setText(flag.concat("+"));
            }
        });
        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputBox.setText("");
                resultTv.setText("");
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String flag = inputBox.getText().toString();
                inputBox.setText(flag.concat("-"));
            }
        });
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String param = inputBox.getText().toString();
                calculate(param);
            }
        });
    }

    private void calculate(String param) {

    }

    private void init() {
        plusButton = findViewById(R.id.plus);
        minusButton = findViewById(R.id.minus);
        enterButton = findViewById(R.id.enter);
        inputBox = findViewById(R.id.input_box);
        resultTv = findViewById(R.id.result_tv);
        acButton = findViewById(R.id.ac);
    }
}