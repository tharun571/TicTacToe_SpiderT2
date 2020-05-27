package com.example.tictactoe_spidert2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    Animation top,middle,bottom;

    private static int SPLASH=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top = AnimationUtils.loadAnimation(this,R.anim.top);
        middle = AnimationUtils.loadAnimation(this,R.anim.middle);
        bottom = AnimationUtils.loadAnimation(this,R.anim.bottom);

        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);

        t1.setAnimation(top);
        t2.setAnimation(middle);
        t3.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Dashboard.class);
                startActivity(intent);
                finish();
            }
        },SPLASH);

    }
}
