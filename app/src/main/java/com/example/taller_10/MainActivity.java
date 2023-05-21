package com.example.taller_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int cont, typeanimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont = 0;
        typeanimation = 1;

        Button btn1 = (Button)findViewById(R.id.btn);
        ImageView huevo = (ImageView) findViewById(R.id.huevo);


        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                typeanimation = 2;
                huevo.setImageResource(R.drawable.salto1);
            }

        });
        huevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont++;
                if (typeanimation == 1) {
                    if (cont > 0){
                        huevo.setImageResource(R.drawable.huevo2);
                    }
                    if (cont > 1){
                        huevo.setImageResource(R.drawable.huevo3);
                    }
                    if (cont > 2){
                        huevo.setImageResource(R.drawable.huevo4);
                    }
                    if (cont > 3){
                        huevo.setImageResource(R.drawable.huevo5);
                    }
                    if (cont > 4){
                        huevo.setImageResource(R.drawable.huevo6);
                    }
                    if (cont > 5) {
                        huevo.setImageResource(R.drawable.huevo7);
                    }
                    if (cont > 6) {
                        huevo.setImageResource(R.drawable.huevo8);
                    }
                    if (cont > 7) {
                        huevo.setImageResource(R.drawable.huevo9);
                    }
                    if (cont > 8) {
                        huevo.setImageResource(R.drawable.huevo10);
                    }
                    if (cont > 9) {
                        huevo.setImageResource(R.drawable.huevo11);
                    }
                    if (cont > 10) {
                        huevo.setImageResource(R.drawable.huevo12);
                    }
                    if (cont > 11) {
                        huevo.setImageResource(R.drawable.huevo1);
                        cont = 0;
                    }
                }else if (typeanimation == 2){
                    if (cont > 0){
                        huevo.setImageResource(R.drawable.salto2);
                    }
                    if (cont > 1){
                        huevo.setImageResource(R.drawable.salto3);
                    }
                    if (cont > 2){
                        huevo.setImageResource(R.drawable.salto4);
                    }
                    if (cont > 3){
                        huevo.setImageResource(R.drawable.salto5);
                    }
                    if (cont > 4){
                        huevo.setImageResource(R.drawable.salto6);
                    }
                    if (cont > 5) {
                        huevo.setImageResource(R.drawable.salto7);
                    }
                    if (cont > 6) {
                        huevo.setImageResource(R.drawable.salto8);
                    }
                    if (cont > 7) {
                        huevo.setImageResource(R.drawable.salto9);
                    }
                    if (cont > 8) {
                        huevo.setImageResource(R.drawable.salto10);
                    }
                    if (cont > 9) {
                        huevo.setImageResource(R.drawable.salto11);
                    }
                    if (cont > 10) {
                        huevo.setImageResource(R.drawable.salto12);
                    }
                    if (cont > 11) {
                        huevo.setImageResource(R.drawable.salto13);
                    }
                    if (cont > 12) {
                        huevo.setImageResource(R.drawable.salto14);
                    }
                    if (cont > 13) {
                        huevo.setImageResource(R.drawable.salto15);
                    }
                    if (cont > 14) {
                        huevo.setImageResource(R.drawable.salto16);
                    }
                    if (cont > 15) {
                        huevo.setImageResource(R.drawable.salto1);
                        cont = 0;
                    }
                }


            }
        });

    }
}