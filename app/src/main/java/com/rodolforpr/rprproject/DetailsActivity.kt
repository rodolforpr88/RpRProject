package com.rodolforpr.rprproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        // BUTTON BACK TO MAIN FRAME
        image_back_details.setOnClickListener {
            finish()
        }

        // CLICK TO USE THE FUNCTION CHECK AND SAVE
        image_save_details.setOnClickListener {
            saveEdition()
        }
    }

    // FUNCTION TO SAVE IN DATABASE
    fun saveEdition () {
        Toast.makeText(applicationContext, "Save succesful", Toast.LENGTH_SHORT).show()
    }
    // FUNCTION TO CHECK DATAS IN DATABASE
    fun checkDatas () {

    }

}
