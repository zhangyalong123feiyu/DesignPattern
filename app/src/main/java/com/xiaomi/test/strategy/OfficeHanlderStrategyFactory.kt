package com.xiaomi.test.strategy

class OfficeHanlderStrategyFactory {
    companion object{
        var map= HashMap<String, OfficeHandlerStrategy>()
        init {
            map["Doc"] = OfficeHandlerFactory.DocFileStrategy
            map["xlxs"] = OfficeHandlerFactory.XlsXFileStrategy
            map["ppt"] = OfficeHandlerFactory.PPtFileStrategy
        }

        fun getOfficeHandlerStrategy(filetype:String):OfficeHandlerStrategy?{
            return map.get(filetype)
        }

    }
}