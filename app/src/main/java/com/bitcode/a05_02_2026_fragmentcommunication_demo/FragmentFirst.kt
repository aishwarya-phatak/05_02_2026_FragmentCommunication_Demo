package com.bitcode.a05_02_2026_fragmentcommunication_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.bitcode.a05_02_2026_fragmentcommunication_demo.databinding.FragmentFirstBinding

class FragmentFirst : Fragment() {
    private lateinit var fragmentFirstBinding: FragmentFirstBinding
    private var fragmentManager = parentFragmentManager

    var city = ""
        set(value) {
            field = value
            fragmentFirstBinding.txtCity.text = value
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentFirstBinding = FragmentFirstBinding.inflate(layoutInflater)
        attachListeners()
        return fragmentFirstBinding.root
    }

    fun attachListeners() {
        //way 1 - direct communication between 2 fragments
        fragmentFirstBinding.btnNext.setOnClickListener {
            (fragmentManager.findFragmentById(R.id.fragmentSecond) as FragmentSecond).tName =
                fragmentFirstBinding.edtName.text.toString()
        }
    }
}