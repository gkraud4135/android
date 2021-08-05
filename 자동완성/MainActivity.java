package com.example.book04_250;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//activity_main.xml

        String[] items={"CSI-뉴욕",
                "CSI-라스베가스",
                "CSI-마이애미",
                "Friends",
                "Fringe", "Lost"};

        AutoCompleteTextView auto=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,items);

        auto.setAdapter(adapter);


        MultiAutoCompleteTextView multi=
                (MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);

        MultiAutoCompleteTextView.CommaTokenizer token=
                new MultiAutoCompleteTextView.CommaTokenizer();

        multi.setTokenizer(token);
        multi.setAdapter(adapter);
    }//onCreate() end
}//class end
