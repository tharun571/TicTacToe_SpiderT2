package com.example.tictactoe_spidert2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Random;

class Example{
public static String a;
public static String b;
}
class Games{

public Games(String a,String b){

Example.a=a;
Example.b=b;
}

}
public class Gameplaym extends View {

    ArrayList<Integer> box = new ArrayList<>();
    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> o = new ArrayList<>();

    Context c;

    int start=1;

    private static final String TAG="MyActivity";
    public static final String EXTRA_P1="com.example.STAPISS.SpiderT1.EXTRA_P1";


    MediaPlayer p1= MediaPlayer.create(getContext(),R.raw.p1);
    MediaPlayer p2= MediaPlayer.create(getContext(),R.raw.p2);
    MediaPlayer draw= MediaPlayer.create(getContext(),R.raw.draw);

    public Gameplaym(Context context) {
        super(context);
        init(context);
    }

    public Gameplaym(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        c=context;
        init(context);
    }

    public Gameplaym(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context);
    }


    public void init(Context context) {
        final int r = new Random().nextInt(2);
        start=r;

    }


    protected void onDraw(Canvas canvas) {
        int i, j, u = 4;
        int va = (180 * 4) / (u - 1);
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#C0C0C0"));
        paint.setStrokeWidth(15);

        for(i=1;i<u;i++){
            int a11=30+(va*i);
            int a22=30+(va*(i-1));
            for( j=0;j<u;j++){
                int b11=30+(va*j);
                int b22=30+(va*(j));





                    paint.setColor(Color.parseColor("#FF4500"));
                    canvas.drawLine(a22, b22, a11, b11, paint);



            }
        }

        for(i=0;i<u;i++){
            int a11=30+(va*i);
            int a22=30+(va*(i));
            for(j=1;j<u;j++){
                int b11=30+(va*j);
                int b22=30+(va*(j-1));






                    paint.setColor(Color.parseColor("#FF4500"));
                    canvas.drawLine(a22, b22, a11, b11, paint);



            }
        }


        int m=0;
        int a1,b1,a2,b2;
        for(i=0;i<3;i++){
            a1=30+va*i;
            a2=30+va*(i+1);
            for(j=0;j<3;j++){
                b1=30+va*j;
                b2=30+va*(j+1);
                m++;
                if(box.contains(m)==true){
                    if(x.contains(m)==true){
                        paint.setColor(Color.parseColor("#ffffff"));

                        canvas.drawLine(a1+50,b1+50,a2-50,b2-50,paint);
                        canvas.drawLine(a1+50,b2-50,a2-50,b1+50,paint);
                    }
                    else if(o.contains(m)==true){
                        paint.setColor(Color.parseColor("#000000"));
                        canvas.drawCircle((a1+a2)/2,(b1+b2)/2,(va/2)-50,paint);
                    }

                }

            }


        }

        if(x.contains(1)&&x.contains(2)&&x.contains(3)){
            p1.start();
            Intent intent=new Intent(c,Score.class);
            intent.putExtra(EXTRA_P1,Example.a+" IS THE WINNER");
            c.startActivity(intent);

        }
        else if(x.contains(1)&&x.contains(7)&&x.contains(4)){
            Intent intent=new Intent(c,Score.class); p1.start();
            intent.putExtra(EXTRA_P1,Example.a+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(x.contains(1)&&x.contains(5)&&x.contains(9)){
            Intent intent=new Intent(c,Score.class); p1.start();
            intent.putExtra(EXTRA_P1,Example.a+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(x.contains(6)&&x.contains(5)&&x.contains(4)){
            Intent intent=new Intent(c,Score.class); p1.start();
            intent.putExtra(EXTRA_P1,Example.a+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(x.contains(7)&&x.contains(8)&&x.contains(9)){
            Intent intent=new Intent(c,Score.class); p1.start();
            intent.putExtra(EXTRA_P1,Example.a+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(x.contains(8)&&x.contains(5)&&x.contains(2)){
            Intent intent=new Intent(c,Score.class); p1.start();
            intent.putExtra(EXTRA_P1,Example.a+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(x.contains(3)&&x.contains(6)&&x.contains(9)){
            Intent intent=new Intent(c,Score.class); p1.start();
            intent.putExtra(EXTRA_P1,Example.a+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(x.contains(7)&&x.contains(5)&&x.contains(3)){
            Intent intent=new Intent(c,Score.class); p1.start();
            intent.putExtra(EXTRA_P1,Example.a+" IS THE WINNER");
            c.startActivity(intent);
        }

        if(o.contains(1)&&o.contains(2)&&o.contains(3)){
            Intent intent=new Intent(c,Score.class); p2.start();
            intent.putExtra(EXTRA_P1,Example.b+" IS THE WINNER");
            c.startActivity(intent);

        }
        else if(o.contains(1)&&o.contains(7)&&o.contains(4)){
            Intent intent=new Intent(c,Score.class);p2.start();
            intent.putExtra(EXTRA_P1,Example.b+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(o.contains(1)&&o.contains(5)&&o.contains(9)){
            Intent intent=new Intent(c,Score.class);p2.start();
            intent.putExtra(EXTRA_P1,Example.b+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(o.contains(6)&&o.contains(5)&&o.contains(4)){
            Intent intent=new Intent(c,Score.class);p2.start();
            intent.putExtra(EXTRA_P1,Example.b+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(o.contains(7)&&o.contains(8)&&o.contains(9)){
            Intent intent=new Intent(c,Score.class);p2.start();
            intent.putExtra(EXTRA_P1,Example.b+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(o.contains(8)&&o.contains(5)&&o.contains(2)){
            Intent intent=new Intent(c,Score.class);p2.start();
            intent.putExtra(EXTRA_P1,Example.b+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(o.contains(3)&&o.contains(6)&&o.contains(9)){
            Intent intent=new Intent(c,Score.class);p2.start();
            intent.putExtra(EXTRA_P1,Example.b+" IS THE WINNER");
            c.startActivity(intent);
        }
        else if(o.contains(7)&&o.contains(5)&&o.contains(3)){
            Intent intent=new Intent(c,Score.class);p2.start();
            intent.putExtra(EXTRA_P1,Example.b+" IS THE WINNER");
            c.startActivity(intent);
        }


        else if(box.size()==9){
            Intent intent=new Intent(c,Score.class);draw.start();
            intent.putExtra(EXTRA_P1,"DRAW MATCH");
            c.startActivity(intent);
        }

        score();

    }

    private void score(){

        TextView s=((Gamem)getContext()).findViewById(R.id.turn);

        if(start==1){
            s.setText(Example.a+"'s TURN");
        }
        else if(start==0){
            s.setText(Example.b+"'s TURN");
        }

    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean value1=super.onTouchEvent(event);

        float x = event.getX();
        float y = event.getY();

        int c1 = Math.round(x);
        int c2 = Math.round(y);

        function(c1,c2);

        return value1;

    }


    private void function(int c1,int c2){

        int m=0,i,j;
        int va = (180 * 4) / (4 - 1);
        int a1,b1,a2,b2;
        for(i=0;i<3;i++){
            a1=30+va*i;
            a2=30+va*(i+1);
            for(j=0;j<3;j++){
                b1=30+va*j;
                b2=30+va*(j+1);
                m++;
                if(c1<a2&&c1>a1&&c2<b2&&c2>b1){
                    if(box.contains(m)==false){
                        box.add(m);
                        turns();
                        Log.w(TAG, "BOX " + m);
                    }
                    else{
                        Toast.makeText(c, "Box already chosen", Toast.LENGTH_SHORT).show();
                    }
                }

            }


        }



    }

    private void turns(){
        if(start==1){

            x.add(box.get(box.size()-1));

            start--;
        }

        else if(start==0){

            o.add(box.get(box.size()-1));

            start++;
        }

        postInvalidate();
    }

}