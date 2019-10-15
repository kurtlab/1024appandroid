package com.t66y.android.a1024app_android.modules.main.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.t66y.android.a1024app_android.MainActivity;
import com.t66y.android.a1024app_android.R;

/**
 * Created by kurtchen on 2019/10/14.
 */

public class SplashActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState){
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3F, 1.0F);
        alphaAnimation.setDuration(1500);

        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        findViewById(R.id.layout_splash).startAnimation(alphaAnimation);



    }


}
