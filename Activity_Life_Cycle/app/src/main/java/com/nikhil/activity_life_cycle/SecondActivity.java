package com.nikhil.activity_life_cycle;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String Tag=SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Log.d(Tag,"onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag,"onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"onDestroy()");
    }

}
