package com.hencoder.hencoderpracticedraw1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hencoder.hencoderpracticedraw1.practice.Practice11PieChartView

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_demo)
        setContentView(Practice11PieChartView(this))
    }
}
