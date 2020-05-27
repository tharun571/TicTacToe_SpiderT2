package com.example.tictactoe_spidert2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Single extends AppCompatActivity {

    Button d;
    EditText n;

    public static final String EXTRA_P1="com.example.STAPISS.SpiderT1.EXTRA_P1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        n=(EditText)findViewById(R.id.name);
        d=(Button)findViewById(R.id.don);

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (n.getText().toString().matches("")) {
                    Toast.makeText(Single.this, "Enter a name", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {

                    String s1=n.getText().toString();

                    Intent intent = new Intent(Single.this, Gamess.class);

                    intent.putExtra(EXTRA_P1, s1);

                    startActivity(intent);

                }
            }
        });

    }
}
