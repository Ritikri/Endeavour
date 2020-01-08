package com.example.endeavour;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ImageView;



public class splashAct extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView1);

        final Animation animation_1 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.zoom_in);
        final Animation animation_2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.antirotate);
        //final Animation animation_3 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.zoom_out);

        imageView.startAnimation(animation_2);
        animation_2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation_1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        animation_1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation_2);
                finish();
                Intent i = new Intent(getBaseContext(),RegAct.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });




    }
}
