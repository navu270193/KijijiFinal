package com.navu.kijijifinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView im = (ImageView) findViewById(R.id.imageView11);
        Button bt = (Button) findViewById(R.id.button);
        ImageView ima = (ImageView) findViewById(R.id.imageView11);
        ImageView imag1 = (ImageView) findViewById(R.id.imageView10);
        ImageView imag2 = (ImageView) findViewById(R.id.imageView12);


        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }


        });
        imag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }


        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectCategory.class);
                startActivity(intent);
            }


        });
        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Post.class);
                startActivity(intent);
            }


        });
        imag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyKijiji.class);
                startActivity(intent);
            }


        });
    }

    void mainClick(View view) {
        setContentView(R.layout.activity_main2);

    }
    void mainClick2(Button view) {
        setContentView(R.layout.activity_select_category);

    }
    void mainClick1(View view) {
        setContentView(R.layout.activity_post);

    }
    void mainClick3(View view) {
        setContentView(R.layout.activity_my_kijiji);

    }
    void mainClick4(View view) {
        setContentView(R.layout.activity_main2);

    }
}
