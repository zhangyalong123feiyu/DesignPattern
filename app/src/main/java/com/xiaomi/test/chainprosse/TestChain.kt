package com.xiaomi.test.chainprosse

class TestChain {
    fun doTest(){
        val managerProcessChain=ManagerProcessChain()
        val bossChainProcess=BossChainProcess()
        bossChainProcess.nextNode(managerProcessChain)
        bossChainProcess.doAction(LeaveRequest(5))

    }
}