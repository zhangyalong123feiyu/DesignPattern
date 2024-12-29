package com.xiaomi.test.chainprosse

import android.util.Log

class BossChainProcess(var process: Process?=null):Process {
    override fun nextNode(process: Process) {
        this.process=process
    }

    override fun doAction(leaveReques: LeaveReques) {
        if (leaveReques.day>6){
            Log.i("TAG"," go")
        }else{
            process!!.doAction(leaveReques)
        }

    }
}