package com.megha.godsendapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_upcoming_event.*

class UpcomingEvent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upcoming_event)
        upcomingtoolbar.title = "Upcoming Events"
        upcomingtoolbar.setNavigationIcon(R.drawable.ic_action_back)
        upcomingtoolbar.setNavigationOnClickListener {

            onBackPressed()}

    }
}
