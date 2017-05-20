package com.navu.kijijifinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Post extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        ImageView imag = (ImageView) findViewById(R.id.imageView9);
        ImageView ima1 = (ImageView) findViewById(R.id.imageView13);
        ImageView imab = (ImageView) findViewById(R.id.imageView10);


        imab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyKijiji.class);
                startActivity(intent);
            }



        });
        imag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }



        });
        ima1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyMessages.class);
                startActivity(intent);
            }
        });
    }
    void mainClick(View view) {
        setContentView(R.layout.activity_main);

    }
    void mainClick1(View view) {
        setContentView(R.layout.activity_my_messages);

    }
    void mainClick2(View view) {
        setContentView(R.layout.activity_my_kijiji);

    }
}
