package com.tgd.libraries.views.progresscircle;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ProgressCircle mCircleProgressIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCircleProgressIndicator = (ProgressCircle) findViewById(R.id.circle_progress_indicator);

        final Random random = new Random();

        final Handler progressHandler = new Handler();
        Runnable progressRunnable = new Runnable() {
            @Override
            public void run() {
                int randomProgress = random.nextInt(100);
                mCircleProgressIndicator.setProgress(randomProgress);
                progressHandler.postDelayed(this, 1500);
            }
        };
        progressHandler.post(progressRunnable);


        Button setRandomProgressBtn = (Button) findViewById(R.id.button);
        assert setRandomProgressBtn != null;
        setRandomProgressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progressHandler != null ){
                    progressHandler.removeCallbacksAndMessages(null);
                }

                int randomProgress = random.nextInt(100);
                mCircleProgressIndicator.setProgress(randomProgress);
            }
        });

    }


}
