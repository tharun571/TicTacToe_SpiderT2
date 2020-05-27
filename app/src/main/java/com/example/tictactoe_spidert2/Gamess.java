package com.example.tictactoe_spidert2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Gamess extends AppCompatActivity {

    String st1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();                                                            //
        st1 = intent.getStringExtra(Single.EXTRA_P1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamess);

        new Games1(st1,"Computer");
    }
}
