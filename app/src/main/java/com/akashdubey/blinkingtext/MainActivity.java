package com.akashdubey.blinkingtext;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements Animation.AnimationListener{

    TextView rockstar;
    Button startanimation;
    Animation fadein,fadeout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockstar=(TextView) findViewById(R.id.textView);
        rockstar.setBackgroundColor(Color.parseColor("#000000"));
        rockstar.setTextColor(Color.parseColor("#FFFFFF"));
        startanimation=(Button)findViewById(R.id.Button);
        fadein= AnimationUtils.loadAnimation(getApplicationContext(),android.R.anim.fade_in);
        fadein.setAnimationListener(this);
        startanimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    rockstar.startAnimation(fadein);
                    fadein.scaleCurrentDuration(20);

            }


        });


    }


    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
