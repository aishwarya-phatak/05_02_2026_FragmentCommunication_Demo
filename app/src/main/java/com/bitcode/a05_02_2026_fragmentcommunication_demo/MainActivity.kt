package com.bitcode.a05_02_2026_fragmentcommunication_demo

import android.app.FragmentManager
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bitcode.a05_02_2026_fragmentcommunication_demo.databinding.ActivityMainBinding
import com.bitcode.a05_02_2026_fragmentcommunication_demo.databinding.FragmentFirstBinding
import com.bitcode.a05_02_2026_fragmentcommunication_demo.databinding.FragmentSecondBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var fragmentFirst: FragmentFirst
    private lateinit var fragmentSecond: FragmentSecond
    private val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(activityMainBinding.root)
    }
}