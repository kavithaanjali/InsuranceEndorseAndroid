package com.example.insuranceendorsementapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class PremiumActivity : Fragment(){
    lateinit var btn_1:Button
    lateinit var btn_2:Button
    lateinit var btn_3:Button
    lateinit var btn_4:Button
    lateinit var btn_5:Button
    lateinit var btn_6:Button
    lateinit var btn_7:Button
    lateinit var btn_8:Button
    lateinit var btn_9:Button
    lateinit var btn_10:Button



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_premium,container,false)
    }

}

