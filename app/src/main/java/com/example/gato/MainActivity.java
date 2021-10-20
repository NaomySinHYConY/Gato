package com.example.gato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private int estado = 0;
    private int winner = 0;
    private final int[] juego= {-1, -1, -1, -1, -1, -1, -1, -1, -1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0; i<9; i++)
        btn1 = findViewById(R.id.imageButton);
        btn2 = findViewById(R.id.imageButton2);
        btn3 = findViewById(R.id.imageButton3);
        btn4 = findViewById(R.id.imageButton4);
        btn5 = findViewById(R.id.imageButton5);
        btn6 = findViewById(R.id.imageButton6);
        btn7 = findViewById(R.id.imageButton7);
        btn8 = findViewById(R.id.imageButton8);
        btn9 = findViewById(R.id.imageButton9);
        Button restart = findViewById(R.id.restart);

        btn1.setOnClickListener(view -> {
            if(estado==0){
                btn1.setImageResource(R.drawable.x);
                estado = 1;
                juego[0] = 1;
            }
            else{
                btn1.setImageResource(R.drawable.o);
                estado = 0;
                juego[0] = 0;
            }
            checkGanador();
            btn1.setEnabled(false);
        });

        btn2.setOnClickListener(view -> {
            if(estado==0){
                btn2.setImageResource(R.drawable.x);
                estado = 1;
                juego[1] = 1;
            }
            else{
                btn2.setImageResource(R.drawable.o);
                estado = 0;
                juego[1] = 0;
            }
            checkGanador();
            btn2.setEnabled(false);
        });

        btn3.setOnClickListener(view -> {
            if(estado==0){
                btn3.setImageResource(R.drawable.x);
                estado = 1;
                juego[2] = 1;
            }
            else{
                btn3.setImageResource(R.drawable.o);
                estado = 0;
                juego[2] = 0;
            }
            checkGanador();
            btn3.setEnabled(false);
        });

        btn4.setOnClickListener(view -> {
            if(estado==0){
                btn4.setImageResource(R.drawable.x);
                estado = 1;
                juego[3] = 1;
            }
            else{
                btn4.setImageResource(R.drawable.o);
                estado = 0;
                juego[3] = 0;
            }
            checkGanador();
            btn4.setEnabled(false);
        });

        btn5.setOnClickListener(view -> {
            if(estado==0){
                btn5.setImageResource(R.drawable.x);
                estado = 1;
                juego[4] = 1;
            }
            else{
                btn5.setImageResource(R.drawable.o);
                estado = 0;
                juego[4] = 0;
            }
            checkGanador();
            btn5.setEnabled(false);
        });

        btn6.setOnClickListener(view -> {
            if(estado==0){
                btn6.setImageResource(R.drawable.x);
                estado = 1;
                juego[5] = 1;
            }
            else{
                btn6.setImageResource(R.drawable.o);
                estado = 0;
                juego[5] = 0;
            }
            checkGanador();
            btn6.setEnabled(false);
        });

        btn7.setOnClickListener(view -> {
            if(estado==0){
                btn7.setImageResource(R.drawable.x);
                estado = 1;
                juego[6] = 1;
            }
            else{
                btn7.setImageResource(R.drawable.o);
                estado = 0;
                juego[6] = 0;
            }
            checkGanador();
            btn7.setEnabled(false);
        });

        btn8.setOnClickListener(view -> {
            if(estado==0){
                btn8.setImageResource(R.drawable.x);
                estado = 1;
                juego[7] = 1;
            }
            else{
                btn8.setImageResource(R.drawable.o);
                estado = 0;
                juego[7] = 0;
            }
            checkGanador();
            btn8.setEnabled(false);
        });

        btn9.setOnClickListener(view -> {
            if(estado==0){
                btn9.setImageResource(R.drawable.x);
                estado = 1;
                juego[8] = 1;
            }
            else{
                btn9.setImageResource(R.drawable.o);
                estado = 0;
                juego[8] = 0;
            }
            checkGanador();
            btn9.setEnabled(false);
        });

        restart.setOnClickListener(view -> {
            winner = 0;
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn1.setImageResource(R.drawable.vacio);
            btn2.setImageResource(R.drawable.vacio);
            btn3.setImageResource(R.drawable.vacio);
            btn4.setImageResource(R.drawable.vacio);
            btn5.setImageResource(R.drawable.vacio);
            btn6.setImageResource(R.drawable.vacio);
            btn7.setImageResource(R.drawable.vacio);
            btn8.setImageResource(R.drawable.vacio);
            btn9.setImageResource(R.drawable.vacio);
            estado = 0;
            for(int i=0; i<9; i++){
                juego[i] = -1;
            }
        });

    }
    private void checkGanador(){
        if(juego[0] == juego[1] && juego[0]== juego[2] && juego[0] != -1){
            Ganador();
        }
        if(juego[3] == juego[4] && juego[3]== juego[5] && juego[3] != -1){
            Ganador();
        }
        if(juego[6] == juego[7] && juego[6]== juego[8] && juego[6] != -1){
            Ganador();
        }
        if(juego[0] == juego[3] && juego[0]== juego[6] && juego[0] != -1){
            Ganador();
        }
        if(juego[1] == juego[4] && juego[1]== juego[7] && juego[1] != -1){
            Ganador();
        }
        if(juego[2] == juego[5] && juego[2]== juego[8] && juego[2] != -1){
            Ganador();
        }
        if(juego[0] == juego[4] && juego[0]== juego[8] && juego[0] != -1){
            Ganador();
        }
        if(juego[6] == juego[4] && juego[6]== juego[2] && juego[6] != -1){
            Ganador();
        }
        if(juego[0] != -1 && juego[1] != -1 && juego[2] != -1 && juego[3] != -1 && juego[4] != -1
                && juego[5] != -1 && juego[6] != -1 && juego[7] != -1 && juego[8] != -1 && winner==0){
            Toast.makeText(MainActivity.this, "Buuu, empate.", Toast.LENGTH_SHORT).show();
        }

    }
    private void Ganador(){
        if (estado == 1){
            Toast.makeText(MainActivity.this, "¡Ganaron las X!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "¡Ganaron las O!", Toast.LENGTH_SHORT).show();
        }
        winner=1;
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
}