package com.example.lenovo.matt;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;


public class Main2Activity extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gestureObject = new GestureDetectorCompat(this , new weerapat() );


    }

    @Override
    public boolean onTouchEvent (MotionEvent event){
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class weerapat extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

            if (e2.getX()< e1.getX()){

                Intent intent = new Intent(Main2Activity.this , MainActivity.class);
                startActivity(intent);
                finish();
            }

            return super.onFling(e1, e2, velocityX, velocityY);
        }
    }

    }
