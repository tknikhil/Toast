package com.nikhil.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoActivity(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
                break;
            case R.id.button2:
                Intent j=new Intent("com.nikhil.explicit_intent.SecondActivity");
                startActivity(j);
                break;
            case R.id.button3:
                Intent k=new Intent();
                k.setClassName("com.nikhil.explicit_intent","com.nikhil.explicit_intent.SecondActivity");
                startActivity(k);
                break;
        }
    }
}
