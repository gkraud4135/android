package com.example.hello09scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

/*

스크롤뷰 사용하기

    -앱을 실행하면 화면보다 큰 이미지가 손가락 터치에 다라 좌우/상하 스크롤된다.
    -가로방향과 세로방향 스크롤을 만들때 스크롤뷰를 어떻게 사용하는지 xml 레이아웃을 확인하자

*/


public class MainActivity extends AppCompatActivity {


    ScrollView scrollview01;
    ImageView imgview;
    BitmapDrawable bitmap;

    Boolean img = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //layout-의 id를 참조하여 객체생성
        scrollview01 = (ScrollView) findViewById(R.id.scrollView01);
        imgview = (ImageView) findViewById(R.id.imageView01);
        Button button01 = (Button) findViewById(R.id.button01);


        //가로 스크롤뷰의 메소드 호출 , 수푱 스크롤바 사용기능 설정
        scrollview01.setHorizontalScrollBarEnabled(true);

        // drawable-리소스에 있는 이미지를 가져와 이미지뷰에 설정, 리소스 이미지 참조
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);

        //이미지 넓이, 높이 설정
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imgview.setImageDrawable(bitmap);
        imgview.getLayoutParams().width = bitmapWidth;
        imgview.getLayoutParams().height = bitmapHeight;
    }

    //버튼클릭시 이미지 변경시켜주기
    public void onButtonClicked01(View v){



        changeImage(img); //메서드 호출
        img = (img==true) ? false: true;

    } // end-onbutton


    //이미지 변경을 위한 메서드 생성
    private void changeImage(Boolean img){

        Resources res = getResources();

        if(img==true){

            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        }  else {

            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image02);
        }


        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imgview.setImageDrawable(bitmap);
        imgview.getLayoutParams().width = bitmapWidth;
        imgview.getLayoutParams().height = bitmapHeight;

    }

}



