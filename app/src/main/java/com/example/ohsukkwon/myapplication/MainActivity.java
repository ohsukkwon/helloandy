package com.example.ohsukkwon.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    public static final String CLS_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
