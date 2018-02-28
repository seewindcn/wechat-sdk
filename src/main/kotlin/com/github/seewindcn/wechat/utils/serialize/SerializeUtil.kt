package com.github.seewindcn.wechat.utils.serialize


/**
 *
 */
object SerializeUtil {
    // 使用jackson实现的序列化工具.如有自定义的实现修改此处即可
    var delegate: SerializeDelegate? = null

    /**
     * JSON字符串转Bean.
     */
    fun <T> jsonToBean(json: String, clazz: Class<T>): T {
        return delegate!!.jsonToBean(json, clazz)
    }

    /**
     * Bean转JSON字符串.
     */
    fun beanToJson(obj: Any): String {
        return delegate!!.beanToJson(obj)
    }

    /**
     * 将xml转换为对象.
     */
    fun <T> xmlToBean(xml: String, clazz: Class<T>): T {
        return delegate!!.xmlToBean(xml, clazz)
    }

    /**
     * 将对象转换为xml.
     */
    fun beanToXml(`object`: Any): String {
        return delegate!!.beanToXml(`object`)
    }

}

