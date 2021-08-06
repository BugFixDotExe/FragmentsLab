package com.raywenderlich.fragmentslab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text


class Counter : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val counterText = view.findViewById<TextView>(R.id.counter_text)
        val counter = view.findViewById<TextView>(R.id.counter)
        val plus = view.findViewById<Button>(R.id.plus)
        val minus = view.findViewById<Button>(R.id.minus)


        plus.setOnClickListener {
            var counterValue =  counter.text.toString().toInt()
            counter.text = (++counterValue).toString()
        }

        minus.setOnClickListener {
            var counterValue = counter.text.toString().toInt()
            if(counterValue > 0) {
                counter.text = (--counterValue).toString()
            }
        }

    }

}