package com.example.hello06tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked01(View v){
        setContentView(R.layout.linyear_layout);

        Button button1 = (Button)findViewById(R.id.button01);


        button1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Toast.makeText(getApplicationContext(), "버튼이 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void onButtonClicked02(View v){
        setContentView(R.layout.table_layout);
    }

    public void onButtonClicked03(View v){
        setContentView(R.layout.table_layout2);

    }



}