package com.megha.godsendapp



import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_video.*
import java.lang.reflect.Array
import java.nio.file.Path


class VideoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        videotoolbar.setNavigationIcon(R.drawable.ic_action_back)
        videotoolbar.setNavigationOnClickListener {

            onBackPressed();
        }
      var  pathofvideo = "android.resource://com.megha.godsendapp/" + R.raw.c
        videoplay.setVideoPath(pathofvideo)
        videoplay.setMediaController(MediaController(this))
        videoplay.start()

        nextone.setOnClickListener {
            var  pathofvideo = "android.resource://com.megha.godsendapp/" + R.raw.c
            videoplay.setVideoPath(pathofvideo)
            videoplay.setMediaController(MediaController(this))
            videoplay.start()
        }
        nexttwo.setOnClickListener {
            var  pathofvideo = "android.resource://com.megha.godsendapp/" + R.raw.d
            videoplay.setVideoPath(pathofvideo)
            videoplay.setMediaController(MediaController(this))
            videoplay.start()
        }

        nextthree.setOnClickListener {
            var  pathofvideo = "android.resource://com.megha.godsendapp/" + R.raw.b
            videoplay.setVideoPath(pathofvideo)
            videoplay.setMediaController(MediaController(this))
            videoplay.start()
        }


            }
        }
































//var array= intArrayOf(R.raw.c,R.raw.b,R.raw.d)



//    val pathofvideo = "android.resource://com.megha.godsendapp/" + R.raw.c
//    // val pathofvideo="https://youtu.be/mj8_w11MvH8";
//    videoplay.setVideoPath(pathofvideo)
//    videoplay.setMediaController(MediaController(this))
//    videoplay.start()
//for( i in 0..2) {
   //var i = 0
              // var pathofvideo = ""
    //when (i) {
        //0 -> {
//        for (i in 0..2){
//            next.setOnClickListener {
//            pathofvideo = "android.resource://com.megha.godsendapp/" + array[i]
//            videoplay.setVideoPath(pathofvideo)
//            videoplay.setMediaController(MediaController(this))
//            videoplay.start()}}
//          //  i += 1
        //}
        //1 -> {
//        next.setOnClickListener {
//            pathofvideo = "android.resource://com.megha.godsendapp/" + R.raw.b
//            videoplay.setVideoPath(pathofvideo)
//            videoplay.setMediaController(MediaController(this))
//            videoplay.start()}
          //  i += 1
        //}
        //2 -> {
            //pathofvideo = "android.resource://com.megha.godsendapp/" + R.raw.d
            //videoplay.setVideoPath(pathofvideo)
            //videoplay.setMediaController(MediaController(this))
            //videoplay.start()
          //  i=0
//        }
//    }
//}
  //  next.setOnClickListener {
    //i += 1


        // val pathofvideo="https://youtu.be/mj8_w11MvH8";
//        videoplay.setVideoPath(pathofvideo)
//        videoplay.setMediaController(MediaController(this))
//        videoplay.start()



//}
    //}
//}

