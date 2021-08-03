package com.example.hellostring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View v){
        Toast.makeText(getApplicationContext(),"버튼이 클릭됨",Toast.LENGTH_LONG).show();
    }

    public void onButtonClicked2(View v){
        Intent intent = new Intent(getApplicationContext(),NewActivity.class);
        startActivity(intent);
    }
}