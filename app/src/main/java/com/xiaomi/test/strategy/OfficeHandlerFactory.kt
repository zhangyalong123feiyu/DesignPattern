package com.xiaomi.test.strategy

object OfficeHandlerFactory {

    object DocFileStrategy : OfficeHandlerStrategy{
        override fun handleOffice(filetype: String) {
            if (filetype.equals("Doc")){
                System.out.print("Doc")
            }
        }
    }

    object XlsXFileStrategy:OfficeHandlerStrategy {
        override fun handleOffice(filetype: String) {
            if (filetype.equals("xlsx")){
                System.out.print("xlsx")
            }
        }
    }

    object PPtFileStrategy:OfficeHandlerStrategy {
        override fun handleOffice(filetype: String) {
            if (filetype.equals("ppt")){
                System.out.print("ppt")
            }
        }
    }
}