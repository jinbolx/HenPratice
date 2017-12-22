package com.hencoder.hencoderpracticedraw3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hencoder.hencoderpracticedraw3.practice.Practice13GetTextBoundsView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        setContentView(new Practice13GetTextBoundsView(this));
    }
}
