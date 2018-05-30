package com.rodolforpr.rprproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // USING THE PLUGIN KOTLIN TO CALL THE TEXT_TODAYDATE
        text_todayDate.text = DateFormat.getDateInstance().format(Date()).toString()

        // CLICK TO GO TO ACCOUNT DETAILS FRAME
        button_details.setOnClickListener {
            val intent = Intent(applicationContext, DetailsActivity::class.java)
            startActivity(intent)
        }
    }
}
