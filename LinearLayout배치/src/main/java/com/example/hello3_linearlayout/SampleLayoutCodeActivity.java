package com.example.hello3_linearlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SampleLayoutCodeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainlayout = new LinearLayout(this); //LinearLayout 객체생성
        mainlayout.setOrientation(LinearLayout.VERTICAL);        //수직정렬
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );


        Button button1 = new Button(this); //버튼생성
        button1.setText("button01");
        button1.setLayoutParams(params);
        mainlayout.addView(button1);

        Button button2 = new Button(this); //버튼생성
        button2.setText("button02");
        button2.setLayoutParams(params);
        mainlayout.addView(button2);

        Button button3= new Button(this); //버튼생성
        button3.setText("button03");
        button3.setLayoutParams(params);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext() , "클릭됨", Toast.LENGTH_SHORT).show();
                SampleLayoutCodeActivity.this.finish();

            }
        });

        mainlayout.addView(button3);

        setContentView(mainlayout);

    }

    //자바코드로 버튼만들기


}