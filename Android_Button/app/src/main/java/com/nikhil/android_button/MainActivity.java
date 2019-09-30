package com.nikhil.android_button;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener */ {
    private static final String TAG = MainActivity.class.getSimpleName();
    Button click_button/*, second_button*/;

    //Second way to create button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_button = (Button) findViewById(R.id.click_button);

        click_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "First button clicked");
            }
        });
      /*
            ------this is first way to create button-----
      click_button = (Button) findViewById(R.id.click_button);
        second_button = (Button) findViewById(R.id.click_button2);
        click_button.setOnClickListener(MainActivity.this);
        second_button.setOnClickListener(MainActivity.this);*/
    }

 /*
   ------follow on with OnClickListener-----
 @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.click_button:
                Log.d(TAG, "First button clicked");
                break;
            case R.id.click_button2:
                Log.d(TAG, "Second button clicked");
                break;
        }
    }*/
 //this is third way to create button
 public  void  performAction(View v){
     //if code getting confuse which button is clicked then use switch case and
     //differentiate by thier id
     Log.d(TAG, "Third button clicked");
 }


}
