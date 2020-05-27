package com.example.tictactoe_spidert2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class s extends AppCompatActivity {
    String st1;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent=getIntent();
        st1 = intent.getStringExtra(Gameplays.EXTRA_P1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score=(TextView)findViewById(R.id.sc);

        score.setText(st1);
    }
}
