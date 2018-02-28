package com.github.seewindcn.wechat.utils.client

import io.vertx.core.json.JsonObject
import java.io.File

import com.github.seewindcn.wechat.utils.serialize.SerializeUtil

/**
 * Http请求工具类.
 *
 */
object HttpUtil {
    // 如果使用了自定义的实现类需要调整该处
    var delegate: HttpDelegate? = null

    operator fun get(url: String, params: JsonObject): String {
        return delegate!!.get(url, params)
    }

    fun post(url: String, params: JsonObject, postData: String): String {
        return delegate!!.post(url, params, postData)
    }

    fun upload(url: String, params: JsonObject, file: File): String {
        return delegate!!.upload(url, params, file)
    }

    /*
    fun download(url: String, params: Map<String, String>): MediaFile {
        return delegate!!.download(url, params)
    }
    */

    fun <T> getJsonBean(url: String, params: JsonObject, clazz: Class<T>): T {
        return SerializeUtil.jsonToBean(get(url, params), clazz)
    }

    /*
    fun <T> postJsonBean(url: String, params: Map<String, String>, postData: String, clazz: Class<T>): T {
        return SerializeUtil.jsonToBean(post(url, params, postData), clazz)
    }

    fun <T> uploadJsonBean(url: String, params: Map<String, String>, file: File, clazz: Class<T>): T {
        return SerializeUtil.jsonToBean(upload(url, params, file), clazz)
    }

    fun <T> getXmlBean(url: String, params: Map<String, String>, clazz: Class<T>): T {
        return SerializeUtil.xmlToBean(get(url, params), clazz)
    }

    fun <T> postXmlBean(url: String, params: Map<String, String>, postData: String, clazz: Class<T>): T {
        return SerializeUtil.xmlToBean(post(url, params, postData), clazz)
    }
    */
}