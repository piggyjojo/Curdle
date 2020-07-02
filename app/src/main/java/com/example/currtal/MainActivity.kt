package com.example.currtal

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currency1.visibility = View.INVISIBLE
        currency2.visibility = View.INVISIBLE
        currency3.visibility = View.INVISIBLE
        edit1.visibility = View.INVISIBLE
        edit2.visibility = View.INVISIBLE
        edit3.visibility = View.INVISIBLE


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
            when (View.INVISIBLE) {
                (currency1.visibility) -> {
                    currency1.text = tester[0]
                    currency1.visibility = View.VISIBLE
                    edit1.visibility = View.VISIBLE
                }
                (currency2.visibility) -> {
                    currency2.text = tester[1]
                    currency2.visibility = View.VISIBLE
                    edit2.visibility = View.VISIBLE
                }
                (currency3.visibility) -> {
                    currency3.text = tester[2]
                    currency3.visibility = View.VISIBLE
                    edit3.visibility = View.VISIBLE
                }
            }
            setUp.text.clear()
            setUp.visibility = View.INVISIBLE
            selectOpen = !selectOpen
        }


        edit1.setOnClickListener {
            setUp.visibility = View.VISIBLE
            tester[0] = (newCurrency.toString())
            currency1.text = tester.toString()


        }
        edit2.setOnClickListener {
            setUp.visibility = View.VISIBLE
            currency1.text = tester.toString()
            tester[1] = (newCurrency.toString())


        }
        edit3.setOnClickListener {
            setUp.visibility = View.VISIBLE
            currency1.text = tester.toString()
            tester[2] = (newCurrency.toString())


        }

    }


}



