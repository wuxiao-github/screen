package com.example.wuxiao01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wuxiao01.util.Utils;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text_screen;
    private TextView word;
    private Button click;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text_screen=findViewById(R.id.name);
         word=findViewById(R.id.word);







        int dip_10= Utils.dip2x(this, 10L);
        text_screen.setPadding(dip_10,dip_10,dip_10,dip_10);
        text_screen.setBackgroundColor(0xff00ffff);
        text_screen.setTextColor(0xff333333);
       // showScreenInfo();  无法生成
        word.setPadding(dip_10,dip_10,dip_10,dip_10);
        word.setBackgroundColor(0xff0000);
        word.setTextColor(0xff00ffff);
        word.setTextSize(60);








        findViewById(R.id.Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"1890063 武潇",Toast.LENGTH_LONG).show();



            }
        });




    }
}