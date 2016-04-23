package com.elaydis.bebrucewayne;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    void initialize() {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new MenuFragment())
                .commit();

    }
}
