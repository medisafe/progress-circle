package com.tgd.libraries.views.progresscircledemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.tgd.libraries.views.progresscircle.ProgressCircle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ProgressCircle mCircleProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCircleProgress = (ProgressCircle) findViewById(R.id.circle_progress);

        final Random random = new Random();

        final Handler progressHandler = new Handler();
        Runnable progressRunnable = new Runnable() {
            @Override
            public void run() {
                int randomProgress = random.nextInt(100);
                mCircleProgress.setProgress(randomProgress);
                progressHandler.postDelayed(this, 1500);
            }
        };
        progressHandler.post(progressRunnable);

    }


}
