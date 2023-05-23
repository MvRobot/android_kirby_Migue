package com.example.taller_10;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
/*Proyeto #1 de Desarrollo Movile
*Desarrollado por:
* Miguel Vivas
* Daniela Moscoso
* Benjamín Rodríguez
* César Mancilla
*
 * */

public class MainActivity extends AppCompatActivity {
    public int typeanimation;
    public Button btn1;
    public ImageView huevo;
    public Animation jump_anim;
    public AnimationDrawable prejump_anim, kameha_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button)findViewById(R.id.btn);
        huevo = (ImageView) findViewById(R.id.huevo);

        jump_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.kirby_jump);

        huevo.setBackgroundResource(R.drawable.prejump);
        prejump_anim = (AnimationDrawable) huevo.getBackground();

        typeanimation = 1;




        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (typeanimation == 1) {
                    huevo.setBackgroundResource(0);
                    huevo.setBackgroundResource(R.drawable.ondavital);
                    kameha_anim = (AnimationDrawable) huevo.getBackground();
                    typeanimation = 2;
                }
                else if (typeanimation == 2){
                    huevo.setBackgroundResource(0);
                    huevo.setBackgroundResource(R.drawable.prejump);
                    prejump_anim = (AnimationDrawable) huevo.getBackground();
                    typeanimation = 1;
                }
            }

        });
        huevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (typeanimation == 1) {
                    jump_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.kirby_jump);

                    prejump_anim.stop();
                    prejump_anim.start();

                    huevo.startAnimation(jump_anim);
                }
                else if (typeanimation == 2) {
                    kameha_anim.stop();
                    kameha_anim.start();
                }
            }
        });

    }
}