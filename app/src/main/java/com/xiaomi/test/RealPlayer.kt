package com.xiaomi.test

import android.util.Log

class RealPlayer : PlayerInterface {
    override fun loadVideo() {
        Log.i("TAG","load the video")
    }

    override fun plaVideo() {
        Log.i("TAG","play the video")
    }
}