package com.megha.godsendapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_members.*

class MembersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_members)
        membersscroll.setTitle("MEMBERS")
        membersscroll.setNavigationIcon(R.drawable.ic_action_back)
        membersscroll.setNavigationOnClickListener {

            onBackPressed();
        }

    }
}