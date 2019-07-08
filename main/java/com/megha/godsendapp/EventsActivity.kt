package com.megha.godsendapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_events.*


class EventsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

      horizontaltablayout.setNavigationIcon(R.drawable.ic_action_back)
        horizontaltablayout.setNavigationOnClickListener {

            onBackPressed();}


        var itemsList = arrayOf("FIRST - Painting Competition held on 12th January 2014",
                "GODSEND SOCIETY TRUST LAUNCHED ITS MAGAZINE 1st ISSUE", "Summer Champion 2014” to Spread the Message Help Poor Children"
                , "One Day Seminar on 02nd of November 2014", "First  Book Our Existence in Cosmos launched in MAY 2015"
                , "An event  “G.S. Champ-2015 was organised by Godsend Society Trust on 20th June ,2015 in order to promote a social message ‘Save a Girl Child’."
        ,"70th Independence Day Celebration-2016 ","Gender Discrimination Powered By “Splash-Water Park")


        var dataAdapter = ArrayAdapter(this, R.layout.custom_listview, itemsList)

        listview.adapter = dataAdapter

        listview.setOnItemClickListener { _, _, position, _ ->


var intent=Intent(this,DetailActivity::class.java)
                intent.putExtra("position",position)
                startActivity(intent)


        }
    }


}