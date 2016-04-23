package com.elaydis.bebrucewayne;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int suspicionLevel = 0;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {



        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new MenuFragment())
                .commit();

    }

    @Override
    protected void onResume() {
        super.onResume();

        mediaPlayer = MediaPlayer.create(this, R.raw.be_bruce_wayne_music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    @Override
    protected void onDestroy() {
        mediaPlayer.release();
        mediaPlayer = null;
        super.onDestroy();
    }

    public void raiseSuspicionLevel(int raiseBy) {
        suspicionLevel += raiseBy;
    }

    public void resetSuspicionLevel() {
        suspicionLevel = 0;
    }

    public int getSuspicionLevel() {
        return suspicionLevel;
    }
}
