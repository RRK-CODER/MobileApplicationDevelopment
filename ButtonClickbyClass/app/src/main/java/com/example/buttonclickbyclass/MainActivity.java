package com.example.buttonclickbyclass;

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
public class MainActivity extends AppCompatActivity {

        Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button1);
        button.setOnClickListener(new RRKHandler());
    }
    class RRKHandler implements OnClickListener
    {
        @Override
        public void onClick(View v){
            Log.d("RRK","button was clicked");
        }
    }

}
