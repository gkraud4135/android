package com.example.hello3_linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked2(View v){
       // setContentView(R.layout.activity_main);
    }

    public void onButtonClicked8(View v){
        Intent intent = new Intent(getApplicationContext(),SampleLayoutCodeActivity.class);
        startActivity(intent);
    }
}