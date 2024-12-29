package com.xiaomi.test.chainprosse

interface Process {
    fun nextNode(process: Process)
    fun doAction(leaveRequest: LeaveRequest)
}