package com.example.spotthedifferencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ans11 = (ImageView) findViewById(R.id.ans11);
        ImageView ans12 = (ImageView) findViewById(R.id.ans12);
        ImageView ans21 = (ImageView) findViewById(R.id.ans21);
        ImageView ans22 = (ImageView) findViewById(R.id.ans22);
        ImageView ans31 = (ImageView) findViewById(R.id.ans31);
        ImageView ans32 = (ImageView) findViewById(R.id.ans32);
        ImageView ans41 = (ImageView) findViewById(R.id.ans41);
        ImageView ans42 = (ImageView) findViewById(R.id.ans42);
        ImageView ans51 = (ImageView) findViewById(R.id.ans51);
        ImageView ans52 = (ImageView) findViewById(R.id.ans52);


        //region 1st
        ans11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans11.setImageResource(R.drawable.circlestyle3);
                ans12.setImageResource(R.drawable.circlestyle3);
            }
        });

        ans12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans11.setImageResource(R.drawable.circlestyle3);
                ans12.setImageResource(R.drawable.circlestyle3);
            }
        });
        //endregion
        //region 2nd
        ans21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans21.setImageResource(R.drawable.circlestyle2);
                ans22.setImageResource(R.drawable.circlestyle2);
            }
        });

        ans22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans21.setImageResource(R.drawable.circlestyle2);
                ans22.setImageResource(R.drawable.circlestyle2);
            }
        });
        //endregion
        //region 3rd
        ans31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans31.setImageResource(R.drawable.circlestyle1);
                ans32.setImageResource(R.drawable.circlestyle1);
            }
        });

        ans32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans31.setImageResource(R.drawable.circlestyle1);
                ans32.setImageResource(R.drawable.circlestyle1);
            }
        });
        //endregion

        //region 4th
        ans41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans41.setImageResource(R.drawable.circlestyle3);
                ans42.setImageResource(R.drawable.circlestyle3);
            }
        });

        ans42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans41.setImageResource(R.drawable.circlestyle3);
                ans42.setImageResource(R.drawable.circlestyle3);
            }
        });
        //endregion

        //region 5th
        ans51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ans51.setImageResource(R.drawable.circlestyle3);
                ans52.setImageResource(R.drawable.circlestyle3);
            }
        });

        ans52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ans51.setImageResource(R.drawable.circlestyle3);
                ans52.setImageResource(R.drawable.circlestyle3);
            }
        });
//endregion


    }
}