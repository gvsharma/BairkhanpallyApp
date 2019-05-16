package com.bkpapp.android.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bkpapp.android.R


class SplashActivity : AppCompatActivity() {
//    private var mFirebaseAnalytics: FirebaseAnalytics? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
//        logEvent()
        Thread.sleep(2000)
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
//
//    fun logEvent() {
//        val bundle = Bundle()
//        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "100")
//        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Splash Screen")
//        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Splash Screen")
//        mFirebaseAnalytics?.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
//    }
}
