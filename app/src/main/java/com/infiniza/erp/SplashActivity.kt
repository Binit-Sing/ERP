package com.infiniza.erp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    private val splashTimeOut = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Hi this is my first git hub change
        // i have added few more lines here in master branch here

        Handler().postDelayed({
            val i = Intent(this@SplashActivity, ERP_login::class.java)
            startActivity(i)
            finish()
        }, splashTimeOut.toLong())
        val myanim = AnimationUtils.loadAnimation(this, R.anim.bounce)
        logosplash!!.startAnimation(myanim)
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}
