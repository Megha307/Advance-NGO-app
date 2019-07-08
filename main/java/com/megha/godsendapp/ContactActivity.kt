package com.megha.godsendapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contact.*

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)



        horizontaltablayout.setNavigationIcon(R.drawable.ic_action_back)
        horizontaltablayout.setNavigationOnClickListener {

            onBackPressed();
        }

    }

}
