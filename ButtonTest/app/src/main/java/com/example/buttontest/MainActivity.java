package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ArrowKeyMovementMethod;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doSomething(View v){

        if(v.getId()==R.id.button)
        Log.d("RRK", v.getId()+" FIRST BUTTON WAS CLICKED");
        else if(v.getId()==R.id.button2)
            Log.d("RRK", v.getId()+" SECOND BUTTON WAS CLICKED");

    }



}