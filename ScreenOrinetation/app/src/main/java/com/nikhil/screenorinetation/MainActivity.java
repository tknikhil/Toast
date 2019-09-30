package com.nikhil.screenorinetation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Look in AndroidManifest.xml

    int score;
    EditText edittext;
    String EditTextString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = (EditText) findViewById(R.id.Edittext);
        score = 0;
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(getApplicationContext(), "Potrait Mode", Toast.LENGTH_LONG).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(getApplicationContext(), "LandScape Mode", Toast.LENGTH_LONG).show();
        }
    }

    //For save value before activity get destroy
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        EditTextString = edittext.getText().toString();
        outState.putString("edittext", "EditTextString");
        outState.putInt("score", score);
    }

    //for retrieve saved value
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        edittext.setText(savedInstanceState.getString("edittext"));
        score = savedInstanceState.getInt("score");
    }

    public void performAction(View view) {
        switch (view.getId()) {
            case R.id.button:
                score += 1;
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "Score " + score, Toast.LENGTH_LONG).show();
                break;
        }
    }
}
