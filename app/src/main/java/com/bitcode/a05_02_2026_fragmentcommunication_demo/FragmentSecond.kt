package com.bitcode.a05_02_2026_fragmentcommunication_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.bitcode.a05_02_2026_fragmentcommunication_demo.databinding.FragmentSecondBinding

class FragmentSecond : Fragment() {

    private lateinit var fragmentSecondBinding: FragmentSecondBinding
    private var fragmentManager = parentFragmentManager
    var tName = ""
        set(value) {
            field = value
            fragmentSecondBinding.txtName.text = value
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSecondBinding = FragmentSecondBinding.inflate(layoutInflater)
        return fragmentSecondBinding.root
    }

    fun attachListeners() {
        fragmentSecondBinding.btnBack.setOnClickListener {
            (fragmentManager.findFragmentById(R.id.fragmentFirst) as FragmentFirst).city =
                fragmentSecondBinding.edtCity.text.toString()
        }
    }
}