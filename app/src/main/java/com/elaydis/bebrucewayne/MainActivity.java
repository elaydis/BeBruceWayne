package com.elaydis.bebrucewayne;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int suspicionLevel = 0;

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
