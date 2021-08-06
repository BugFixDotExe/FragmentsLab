package com.raywenderlich.fragmentslab

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import java.lang.reflect.Type


class Figment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_figment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val boldButton = view.findViewById<Button>(R.id.bold_button)
        val italicButton = view.findViewById<Button>(R.id.italic_button)
        val resetButton = view.findViewById<Button>(R.id.reset_button)
        val helloTextView = view.findViewById<TextView>(R.id.hello_world)


        boldButton.setOnClickListener {
            if(helloTextView.typeface?.isItalic == true) {
                helloTextView.setTypeface(helloTextView.typeface, Typeface.BOLD_ITALIC)
            }

            else {
                helloTextView.setTypeface(null, Typeface.BOLD)
            }
        }

        italicButton.setOnClickListener {
            if(helloTextView.typeface?.isBold == true) {
                helloTextView.setTypeface(helloTextView.typeface, Typeface.BOLD_ITALIC)
            }

            else {
                helloTextView.setTypeface(null, Typeface.ITALIC)
            }
        }

        resetButton.setOnClickListener {
            helloTextView.setTypeface(null, Typeface.NORMAL)
        }

    }

}