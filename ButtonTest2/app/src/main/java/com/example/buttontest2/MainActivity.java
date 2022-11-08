package com.example.buttontest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/*
1)tell android you are interested in listening to a button click
2)bring your xml button inside java
3)tell your java button whose responding when it's clicked
4)what should happen when button is clicked
 */
public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button button;
    Button another;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button1);
        another=(Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        another.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v.getId()==R.id.button1)
        Log.d("RRK","First button was clicked");
        else if(v.getId()==R.id.button2)
            Log.d("RRK", "Second button was clicked");
    }
}