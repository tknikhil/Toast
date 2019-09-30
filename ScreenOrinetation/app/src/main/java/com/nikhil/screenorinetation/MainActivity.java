package com.nikhil.screenorinetation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Look in AndroidManifest.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(getApplicationContext(),"Potrait Mode",Toast.LENGTH_LONG).show();
        }
        else if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(getApplicationContext(),"LandScape Mode",Toast.LENGTH_LONG).show();
        }
    }


}
