package com.example.hello05relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked2(View v){
        setContentView(R.layout.overlay);  //overlay뷰
    }

    public void onButtonClicked3(View v){
        setContentView(R.layout.centerfill);  //centerfill뷰
    }



        //클릭시 overlay.xml에 정의된 하면 레이아웃 출력


}