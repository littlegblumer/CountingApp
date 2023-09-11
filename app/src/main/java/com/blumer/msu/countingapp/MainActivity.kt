package com.blumer.msu.countingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Counter {
    private var count: Int = 0

    fun addCount() {
        count++
    }

    fun getCount(): Int {
        return count
    }
}

class MainActivity : AppCompatActivity() {

    private lateinit var count: Counter
    private lateinit var tvCount: TextView
    private lateinit var buttonCounterTap: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = Counter()
        tvCount = findViewById(R.id.count)
        buttonCounterTap = findViewById(R.id.button_increment)

        buttonCounterTap.setOnClickListener {
            count.addCount()
            tvCount.text = count.getCount().toString()
        }
    }
}