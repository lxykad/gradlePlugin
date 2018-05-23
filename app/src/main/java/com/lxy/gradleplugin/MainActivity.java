package com.lxy.gradleplugin;

import android.os.Bundle;
import android.support.animation.SpringAnimation;
import android.support.animation.SpringForce;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * @author a
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);

        SpringForce force = new SpringForce(200)
                .setDampingRatio(0.2f)
                .setStiffness(100f);

        SpringAnimation animation = new SpringAnimation(tv, SpringAnimation.TRANSLATION_X)
                .setSpring(force);


        animation.start();


    }
}
