package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRK","onCreate was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRK","onResume was called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRK","onStart was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRK","onPause was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRK","onStop was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRK","onRestart was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRK","onDestroy was called");
    }

}