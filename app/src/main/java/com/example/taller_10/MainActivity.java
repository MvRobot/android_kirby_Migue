package com.example.taller_10;

import static kotlinx.coroutines.DelayKt.delay;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity {
    ObjectAnimator wait;
    private int cont, typeanimation;
    private Button btn1;
    private ImageView huevo;
    private Animation jump_anim;
    private AnimationDrawable prejump_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button)findViewById(R.id.btn);
        huevo = (ImageView) findViewById(R.id.huevo);

        jump_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.kirby_jump);
        huevo.setBackgroundResource(R.drawable.prejump);
        prejump_anim = (AnimationDrawable) huevo.getBackground();



        cont = 0;
        typeanimation = 1;


        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                typeanimation = 2;
                //huevo.setImageResource(R.drawable.salto1);

            }

        });
        huevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prejump_anim.stop();
                prejump_anim.start();
                huevo.startAnimation(jump_anim);
            }
        });

    }
}