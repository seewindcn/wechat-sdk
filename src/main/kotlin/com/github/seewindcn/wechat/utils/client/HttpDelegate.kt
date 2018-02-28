package com.github.seewindcn.wechat.utils.client

import io.vertx.core.json.JsonObject
import java.io.File


/**
 * 代理请求实现接口.不同客户端实现需实现该接口.
 *
 */
interface HttpDelegate {

    /**
     * 发送GET请求。
     */
    operator fun get(url: String, params: JsonObject): String

    /**
     * 发送POST请求。
     */
    fun post(url: String, params: JsonObject, postData: String): String

    /**
     * 上传文件.
     */
    fun upload(url: String, params: JsonObject, file: File): String

    /**
     * 下载文件.
     */
//    fun download(url: String, params: JsonObject): MediaFile
}

