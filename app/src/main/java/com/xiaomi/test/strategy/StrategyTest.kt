package com.xiaomi.test.strategy

class StrategyTest {
    fun doStrategy(){
        val filePath = "C://file/123.xlsx"
        val type: String = getFileExtension(filePath)

        OfficeHanlderStrategyFactory.getOfficeHandlerStrategy(type)?.handleOffice(filePath)
    }

    private fun getFileExtension(filePath: String): String {
        // 解析文件名获取文件扩展名,比如 文档.docx，返回 docx
        val fileExtension = filePath.substring(filePath.lastIndexOf(".") + 1)
        return fileExtension
    }
}