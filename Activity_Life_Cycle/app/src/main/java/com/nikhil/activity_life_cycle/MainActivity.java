package com.nikhil.activity_life_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String Tag=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"OnCreate()");
    }

    public void launchActivity(View view) {
        Intent i =new Intent(MainActivity.this,SecondActivity.class);
        startActivity(i);
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
