package com.bitcode.a05_02_2026_fragmentcommunication_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentSecond : Fragment() {
    private lateinit var edtCity : EditText
    private lateinit var txtName : TextView
    private lateinit var btnBack : Button

    private var fragmentManager = parentFragmentManager
    var tName = ""
        set(value) {
            field = value
            txtName.text = value
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentSecondView : View = inflater.inflate(R.layout.fragment_second, null,false)

        edtCity = fragmentSecondView.findViewById(R.id.edtCity)
        txtName = fragmentSecondView.findViewById(R.id.txtName)
        btnBack = fragmentSecondView.findViewById(R.id.btnBack)

        (parentFragmentManager.findFragmentById(R.id.fragment_first) as FragmentFirst).city =
            edtCity.text.toString()

        return fragmentSecondView
    }
}