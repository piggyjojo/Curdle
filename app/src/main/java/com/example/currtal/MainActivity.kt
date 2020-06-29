package com.example.currtal

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionProvider
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        featureTest.visibility = View.INVISIBLE

        var selectOpen = false
        setUp.visibility = View.INVISIBLE
        val tester = arrayListOf<String>()
        var currencyMade = 0
        val newCurrency = setUp.text


        select.setOnClickListener {
            selectOpen = !selectOpen

            if (selectOpen) {
                setUp.visibility = View.VISIBLE
            } else {
                setUp.visibility = View.INVISIBLE
            }
        }

        setUp.setOnClickListener {
            tester.add(newCurrency.toString())
            currency1.text = tester.toString()
            setUp.text.clear()
            setUp.visibility = View.INVISIBLE
            if (selectOpen)
                selectOpen = !selectOpen
        }

        if (currency1.visibility == View.VISIBLE) {
            featureTest.visibility = View.VISIBLE

            edit1.setOnClickListener {
                setUp.visibility = View.VISIBLE
                currency1.text = tester.toString()
                tester[0] =
                    (newCurrency.toString())

                if (selectOpen)
                    selectOpen = !selectOpen
                setUp.text.clear()
            }

        }

    }
}

