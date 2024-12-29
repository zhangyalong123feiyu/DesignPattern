package com.xiaomi.test.chainprosse

import android.util.Log

class ManagerProcessChain(var process: Process? =null) : Process {

    override fun doAction(leaveRequest: LeaveRequest) {
        if (leaveRequest.day<5){
            Log.i("TAG","ok go")
        }else {
            process!!.doAction(leaveRequest)
        }
    }

    override fun nextNode(process: Process) {
        this.process=process
    }

}