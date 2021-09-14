package com.example.smartclickappprova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int i = -1;
    int u = -1;
    int a = -1;
    int y = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irParaSegundaTela(View view){
        Intent intent1 = new Intent(getApplicationContext(), SegundaTela.class);
        startActivity(intent1);
    }
    public void irParaTelaSobre(View view){
        Intent intent2 = new Intent(getApplicationContext(), TelaSobre.class);
        startActivity(intent2);
    }
}