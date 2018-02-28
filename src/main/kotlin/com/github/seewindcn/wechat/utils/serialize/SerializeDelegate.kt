package com.github.seewindcn.wechat.utils.serialize


/**
 * 微信交互数据序列化代理实现接口.不同的序列化需要实现该接口.
 *
 */
interface SerializeDelegate {
    /**
     * JSON字符串转Bean.
     */
    fun <T> jsonToBean(json: String, clazz: Class<T>): T

    /**
     * Bean转JSON字符串.
     */
    fun beanToJson(`object`: Any): String

    /**
     * 将xml转换为对象.
     */
    fun <T> xmlToBean(xml: String, c: Class<T>): T

    /**
     * 将对象转换为xml.
     */
    fun beanToXml(obj: Any): String
}

