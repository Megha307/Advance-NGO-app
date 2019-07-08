package com.megha.godsendapp

import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var mainActivity = EventsActivity() // object
        detailtoolbar.setTitle("DETAIL")
        detailtoolbar.setNavigationIcon(R.drawable.ic_action_back)
        detailtoolbar.setNavigationOnClickListener {

            onBackPressed();}


        var intent = intent
        var pos = intent.getIntExtra("position", 0)

        if (pos == 0) {

            Glide.with(this).load("https://lh5.googleusercontent.com/IpjnBW7A9u05S_WOH92ALbEronf1XgmVPtryeMZOV_DoM7qRxopD97vzOh3zfdDZRVvmay5z0nbTOovjAanRwx07GnRGtwlbZl-Gm4apIRvC3rjiXRFrJuNVq2U758Idx02uDDT549MtSMdVnA").into(ivdetail);
            tvdetail.text = "Godsend Society Trust organized Painting Competition of 4 hours duration on November 2013 in association with Asha Convent School and St. Thomas Christian High School Faridabad, on the topic “Help the Poor”. The children studying in the standards 1st to 10th hadparticipated in the painting competition"
        }
        if (pos == 1) {
            Glide.with(this).load("https://lh5.googleusercontent.com/R0nCWuAnlkcBY5HlxEz7O0epetHyGRTTDLVH9dkEy_jMD997xxGSM_zlgxZwh01VpJIm-qIIhuEP_WTn67B7t2gI0SHKwvoQ6bi14wBsqH9m14UwpZYRP83DQpus9jBGgnWNH4GQGOSBzOCmAQ").into(ivdetail);
            tvdetail.text = "SPONSORED BY LEADING KING OF THE MASALA COMPANY M.D.H."
        }
        if (pos == 2) {

            Glide.with(this).load("https://lh5.googleusercontent.com/IpjnBW7A9u05S_WOH92ALbEronf1XgmVPtryeMZOV_DoM7qRxopD97vzOh3zfdDZRVvmay5z0nbTOovjAanRwx07GnRGtwlbZl-Gm4apIRvC3rjiXRFrJuNVq2U758Idx02uDDT549MtSMdVnA").into(ivdetail);
            tvdetail.text = "A Buzz ‘ Summer Champion 2014’ was organised by Godsend Society Trust on 28th June, 2014 in order to promote a social message ‘Help Poor Children’. The program was conducted in Lakhani Auditorium,NIT Faridabad. The event involved many cultural activities like dance, music, skits with social messages.Cultural event were organized by different team members. Awards and Prizes were distributed to the participantsfor showcasing their talent and hardwork. The view was to make society aware about the changes required in our thought towards Girl Child. The event was a grand success and it has led to a increased enthusiasm of our members."
        }
        if (pos == 3) {
            Glide.with(this).load("https://lh3.googleusercontent.com/C5g4vRglpXj9kiJOhxvu_17UO7_3xTpwxl_3JQiDAX8ENk738gC3kBO2OprjyVcvSws8-I3D4zRDqXPabehSaAaFfRjL0MVvHIWycNJwU9mtlYOxQGd91Lfyi1X2bZLRgMVd5SN7cnBB2WsLrg").into(ivdetail);
tvdetail.text="A one day Seminar on “CHILD WELFARE PROGRAMS” was organised by “Godsend Society Trust on 02nd November 2014 in order to promote a social messages like Dowry System, Child Marriage,Child Labour, Female Foeticide etc . The program was conducted in KRIMS Auditorium, Delhi. The seminar involved many cultural activities like dance, music with social messages. The view was to make society aware about the changes required in our thought towards Child Welfare Activities."
        }
        if (pos == 4) {
            Glide.with(this)
                    .load("https://lh4.googleusercontent.com/_jLCI9uMqeHRHcaXQGjM7jO02RFtYmzcAsBIxJT4UMa6pnR0oOCFfibB-KA942QAniNbmBr07KmkOf5AdhLaH73A3g_PPV4lK_RLBYkHtjN7aztmBdsv4fXjBaeE87pSoM96dOhxJBlvBIGr4Q").into(ivdetail)


            tvdetail.text="This book explains about the real purpose of our living life using scientific theories and evidences given by Albert Einstein, Theory of Evolution , Theory of Relativity, Thermodynamics,Meditation , Buddhism etc to make ourselves happy and healthy, embedded with positive thinking that can make life changing results and theories about life, death, reality and our existence in cosmos."

        }
        if (pos == 5) {
            Glide.with(this).load("https://lh5.googleusercontent.com/IpjnBW7A9u05S_WOH92ALbEronf1XgmVPtryeMZOV_DoM7qRxopD97vzOh3zfdDZRVvmay5z0nbTOovjAanRwx07GnRGtwlbZl-Gm4apIRvC3rjiXRFrJuNVq2U758Idx02uDDT549MtSMdVnA").into(ivdetail);
            tvdetail.text="An event  “G.S. Champ-2015”  was organised by Godsend Society Trust on 20th June ,2015 in order to promote a social message ‘Save a Girl Child’. The program was conducted in KRIMS Auditorium , Pitampura , Delhi. The guests Honour were Shree Mahesh Chandra Sharma ( Ex-Mayor, Delhi), Mr. Gulab Singh Rathore (MCD Counsellor: Mukundpur,  Chairman Health Committee MCD) and many more..  The event involved many cultural activities like dance, music, skits with social messages. Cultural event were organized by different team members.  Awards and Prizes were distributed to the participants for showcasing their talent and hard-work. The view was to make society aware about the changes required in our thought towards Girl Child.  The event was a grand success and it has led to a increased enthusiasm of our members. The event had become a grand success and I would like to give thanks to all the members of Godsend Society Trust for their effort and believe for making it a grand success."

        }

        if(pos==6) {
            Glide.with(this).load("https://lh5.googleusercontent.com/R0nCWuAnlkcBY5HlxEz7O0epetHyGRTTDLVH9dkEy_jMD997xxGSM_zlgxZwh01VpJIm-qIIhuEP_WTn67B7t2gI0SHKwvoQ6bi14wBsqH9m14UwpZYRP83DQpus9jBGgnWNH4GQGOSBzOCmAQ").into(ivdetail);
            tvdetail.text = "Independence Day 2016 in Vanprastha Ashram, Delhi has been celebrated by Godsend Society Trust in association with FACE-NGO, sponsored by ADC Electrosoft Pvt. Ltd.  on 15th of August, at Monday. It was celebrated with pomp and show in Vanprastha Ashram. The Chief Guest unfurled the National Flag , followed by the National Anthem sung by the team members.The programme ended with the distribution of sweets."
        }
        if(pos==7){
            Glide.with(this).load("https://lh4.googleusercontent.com/5OEZDd_ByAOn3TeJ2vUhsfHK_YbmdN2WUSLRs1ZniVa0aSMyKHH9xNSZMe75Ob3kf1MEjLaOjbIiix5vyMp4Yky-wgwOAgxBmwJRum1tWmIyCyNYv18pABsPLhprwa2VEyBrYm_Q0MmtC6MFcQ").into(ivdetail);
            tvdetail.text="To promote a message “Gender Discrimination”, a “G.S. Champ 2017”, championship was organised by Godsend Society Trust on 6th August, 2017. The program was conducted in KRIMS Auditorium, Prashant Vihar, Delhi. The guests of Honour were Shri Mahesh Chandra Sharma ( Ex –Mayor ( MCD)), Mr. Gulab Singh Rathore (MCD Counsellor: Mukundpur, Chairman Health Committee MCD) and Shri T.C. Nakh (Ex. –Comissioner/Megistrate).The participation certificate is issued by “Godsend Society Trust” to all the team members of the programme"
        }
    }
}
