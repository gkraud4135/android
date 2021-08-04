package com.example.hello08imgevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    ImageView imgView;
    Integer imgs[]={R.drawable.b1,R.drawable.b2,R.drawable.b3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.btn01);
        b2=(Button)findViewById(R.id.btn02);
        b3=(Button)findViewById(R.id.btn03);

        imgView=(ImageView)findViewById(R.id.img);

        b1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
//                 imgView.setImageResource(imgs[0]);
                    click(1);
                }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//              imgView.setImageResource(imgs[1]);
                click(2);
            }
        });


        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                imgView.setImageResource(imgs[2]);
                click(3);
            }
        });


    }

    public void click(int a){
        imgView.setImageResource(imgs[a-1]);
        Toast.makeText(getApplicationContext(), "변경", Toast.LENGTH_SHORT).show();
    }




}