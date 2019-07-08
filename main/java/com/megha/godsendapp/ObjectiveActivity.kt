package com.megha.godsendapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_objective.*

class ObjectiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_objective)

        objectivescroll.setTitle("OBJECTIVES")
        objectivescroll.setNavigationIcon(R.drawable.ic_action_back)
        objectivescroll.setNavigationOnClickListener {

            onBackPressed();
        }
    }
}