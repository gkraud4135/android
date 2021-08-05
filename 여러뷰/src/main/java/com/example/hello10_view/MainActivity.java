package com.example.hello10_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked01(View v){
        setContentView(R.layout.textview);
    }

    public void onButtonClicked02(View v){
        setContentView(R.layout.button);

    }
    public void onButtonClicked03(View v){
        setContentView(R.layout.edittext);

    }

    public void onCheckBox1(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "하루종일 체크박스 클릭됨", Toast.LENGTH_SHORT);
        myToast.show();

    }

    public void onRadioClicked1(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "남자선택", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void onRadioClicked2(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "여자선택", Toast.LENGTH_SHORT);
        myToast.show();
    }



}