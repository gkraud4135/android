package com.example.hello1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//method

    //onclick 메서드추가
    public void onButtonClicked(View v){//onclick이름, 임포트
        Toast.makeText(getApplicationContext(),"버튼 눌러서 나온 메시지 입니다",Toast.LENGTH_LONG).show();

    }

    public void onButtonClicked2(View v){//onclick이름, 임포트
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com"));
        startActivity(myIntent);
    }

    public void onButtonClicked3(View v){//onclick이름, 임포트
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.84:9000/12_MVC/board/list.do"));
        startActivity(myIntent);
    }

    //전화걸기
    public void onButtonClicked4(View v){//onclick이름, 임포트
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01040431723"));
        startActivity(myIntent);
    }


    //http://localhost:9000/12_MVC/board/list.do

}//class