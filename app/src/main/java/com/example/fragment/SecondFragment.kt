package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class SecondFragment : Fragment (){
    private  var comunicationViewModel : ComunicationViewModel? = null
    private  var txtName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        comunicationViewModel = ViewModelProvider(requireActivity()).get(ComunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_fragment_second,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        txtName = view.findViewById(R.id.textview1)
        super.onViewCreated(view, savedInstanceState)
        comunicationViewModel!!.name.observe(requireActivity(), Observer { s-> txtName!!.text= s})
    }
    companion object{
        fun newInstance(): SecondFragment{
            return SecondFragment()
        }
    }
}