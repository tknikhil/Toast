package com.nikhil.toast;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateToast(View view) {
        switch (view.getId()) {
            case R.id.button:
                toast = Toast.makeText(MainActivity.this, "Here is your Burnt Toast!!", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0, 0); //if you want to display at particular location just give xoffset and yoffset accordingly
                toast.show();
                break;
            case R.id.button2:
                LayoutInflater inflater = getLayoutInflater();
                View appearance = inflater.inflate(R.layout.taost_layout, (ViewGroup) findViewById(R.id.btoast_layout));
                toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.setView(appearance);
                toast.show();
                break;
        }

    }
}
