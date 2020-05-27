package com.example.tictactoe_spidert2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Gamem extends AppCompatActivity {

    String st1,st2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();                                                            //

        st1 = intent.getStringExtra(Multi.EXTRA_P1);
        st2 = intent.getStringExtra(Multi.EXTRA_P2);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamem);

        new Games(st1,st2);

    }
}
