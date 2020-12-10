package com.fjsdxy.j093a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MyRadioButton extends AppCompatActivity {
    private RadioGroup radioGroup;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_radio_button);
        radioGroup = (RadioGroup) findViewById(R.id.rdg);
        textView = (TextView) findViewById(R.id.tv);
        //利用setOnCheckedChangeListener()为RadioGroup建立监听
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //判断点击的是哪个RadioButton
                if (checkedId == R.id.rbtn) {
                    textView.setText("您的性别是：男");
                } else {
                    textView.setText("您的性别是：女");
                }
            }
        });
    }
}