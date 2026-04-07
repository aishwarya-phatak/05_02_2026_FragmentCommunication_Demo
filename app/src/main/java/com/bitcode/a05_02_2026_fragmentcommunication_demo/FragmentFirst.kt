package com.bitcode.a05_02_2026_fragmentcommunication_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentFirst : Fragment() {
    private lateinit var edtName : EditText
    private lateinit var txtCity : TextView
    private lateinit var btnNext : Button

    var city = ""
        set(value) {
            field = value
            txtCity.text = value
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentFirstView : View = inflater.inflate(R.layout.fragment_first,null,false)

        edtName = fragmentFirstView.findViewById(R.id.edtName)
        txtCity = fragmentFirstView.findViewById(R.id.txtCity)
        btnNext = fragmentFirstView.findViewById(R.id.btnNext)

        (parentFragmentManager.findFragmentById(R.id.fragment_second) as FragmentSecond).tName =
            edtName.text.toString()

        return fragmentFirstView
    }
}