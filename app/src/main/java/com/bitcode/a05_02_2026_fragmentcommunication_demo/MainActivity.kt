package com.bitcode.a05_02_2026_fragmentcommunication_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentFirst: FragmentFirst
    private lateinit var fragmentSecond: FragmentSecond

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        fragmentFirst = supportFragmentManager.findFragmentById(R.id.fragment_first) as FragmentFirst
        fragmentSecond = supportFragmentManager.findFragmentById(R.id.fragment_second) as FragmentSecond
    }
}