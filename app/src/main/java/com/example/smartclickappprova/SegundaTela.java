package com.example.smartclickappprova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class SegundaTela extends AppCompatActivity {
    int i = -1;
    int u = -1;
    int a = -1;
    int y = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        setTitle("                         PRODUTOS");
    }

    public void itemZoomArduino(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.arduino_uno_r3_similar);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(SegundaTela.this).
                        setPositiveButton("COMPRAR", (dialog, which) -> dialog.dismiss()).
                        setMessage("R$55,00").
                        setView(image).
                        setTitle("Placa Arduino UNO Nova");
        builder.create().show();
    }

    public void itemZoomTeclado(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.tecladogamer);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(SegundaTela.this).
                        setPositiveButton("COMPRAR", (dialog, which) -> dialog.dismiss()).
                        setMessage("R$125,00").
                        setView(image).
                        setTitle("Teclado Gamer SmartClick");
        builder.create().show();
    }

    public void itemZoomMouse(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.mousegamer);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(SegundaTela.this).
                        setPositiveButton("COMPRAR", (dialog, which) -> dialog.dismiss()).
                        setMessage("R$75,00").
                        setView(image).
                        setTitle("Mouse Gamer Colorido Razer");
        builder.create().show();
    }

    public void itemZoomHeadset(View view) {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.fonedeouvidoprincipal);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(SegundaTela.this).
                        setPositiveButton("COMPRAR", (dialog, which) -> dialog.dismiss()).
                        setMessage("R$95,00").
                        setView(image).
                        setTitle("Fone de Ouvido Gamer Azul Onbyte");
        builder.create().show();
    }

    public void irParaTelaInicial(View view){
        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
        intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent2);
        finish();
    }

    public void mudarIconHeadset(View v) {
        ImageButton aButton = (ImageButton) v;
        i++;
        if (i == 0){
            aButton.setImageResource(R.drawable.fonedeouvidoimg2);
        }
        if (i == 1){
            aButton.setImageResource(R.drawable.fonedeouvidoimg3);
        }
        if (i == 2){
            aButton.setImageResource(R.drawable.fonedeouvidoprincipal);
            i = -1;
        }
    }
    public void mudarIconArduino(View v) {
        ImageButton aButton = (ImageButton) v;
        u++;
        if (u == 0) {
            aButton.setImageResource(R.drawable.arduino2);
        }
        if (u == 1) {
            aButton.setImageResource(R.drawable.arduino_uno_r3_similar);
            u = -1;
        }
    }
    public void mudarIconTeclado(View v) {
        ImageButton aButton = (ImageButton) v;
        a++;
        if (a == 0) {
            aButton.setImageResource(R.drawable.tecladogamer2);
        }
        if (a == 1) {
            aButton.setImageResource(R.drawable.tecladogamer3);
        }
        if (a == 2) {
            aButton.setImageResource(R.drawable.tecladogamer4);
        }
        if (a == 3) {
            aButton.setImageResource(R.drawable.tecladogamer);
            a = -1;
        }
    }
    public void mudarIconMouse(View v) {
        ImageButton aButton = (ImageButton) v;
        y++;
        if (y == 0) {
            aButton.setImageResource(R.drawable.mousegamer2);
        }
        if (y == 1) {
            aButton.setImageResource(R.drawable.mousegamer3);
        }
        if (y == 2) {
            aButton.setImageResource(R.drawable.mousegamer4);
        }
        if (y == 3) {
            aButton.setImageResource(R.drawable.mousegamer);
            y = -1;
        }
    }
}