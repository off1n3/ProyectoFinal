package com.example.itlavision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Loading extends AppCompatActivity {

//    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loading);
//
//        ImageView imgview = findViewById(R.id.imgview);
//        animationDrawable = (AnimationDrawable)imgview.getDrawable();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Loading.this, Menu.class);
                startActivity(i);
                finish();
            }
        }, 5000);

    }
//
//    public void Start(View v){
//        animationDrawable.start();
//    }
//
//    public void Stop(View v){
//        animationDrawable.stop();
//    }


}
