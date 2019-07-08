package com.megha.godsendapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderLayout
import com.smarteist.autoimageslider.SliderView
import com.smarteist.autoimageslider.DefaultSliderView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var sliderLayout: SliderLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         sliderLayout = findViewById<SliderLayout>(R.id.imageSlider);
        sliderLayout!!.setIndicatorAnimation(IndicatorAnimations.SWAP)
        sliderLayout!!.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION)
        sliderLayout!!.scrollTimeInSec = 1;
tv.isSelected=true;
        setSliderViews()

        horizontaltablayout.setTitle("HOME")
        horizontaltablayout.setNavigationIcon(R.drawable.ic_action_back)
        horizontaltablayout.setNavigationOnClickListener {

            onBackPressed();}

        explore.setOnClickListener {
            var intent=Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }


    }
    fun setSliderViews(){
    for (i in 0..2){
        val sliderView = DefaultSliderView(this)
        when (i) {
            0 -> sliderView.imageUrl="https://lh5.googleusercontent.com/IpjnBW7A9u05S_WOH92ALbEronf1XgmVPtryeMZOV_DoM7qRxopD97vzOh3zfdDZRVvmay5z0nbTOovjAanRwx07GnRGtwlbZl-Gm4apIRvC3rjiXRFrJuNVq2U758Idx02uDDT549MtSMdVnA"
           1-> sliderView.imageUrl="https://lh5.googleusercontent.com/R0nCWuAnlkcBY5HlxEz7O0epetHyGRTTDLVH9dkEy_jMD997xxGSM_zlgxZwh01VpJIm-qIIhuEP_WTn67B7t2gI0SHKwvoQ6bi14wBsqH9m14UwpZYRP83DQpus9jBGgnWNH4GQGOSBzOCmAQ"

            2 -> sliderView.imageUrl = "https://lh4.googleusercontent.com/5OEZDd_ByAOn3TeJ2vUhsfHK_YbmdN2WUSLRs1ZniVa0aSMyKHH9xNSZMe75Ob3kf1MEjLaOjbIiix5vyMp4Yky-wgwOAgxBmwJRum1tWmIyCyNYv18pABsPLhprwa2VEyBrYm_Q0MmtC6MFcQ"

        }
        sliderView.setImageScaleType(ImageView.ScaleType.FIT_XY)
        sliderLayout!!.addSliderView(sliderView)
    }
}

    }


