package com.github.seewindcn.wechat.api

import io.vertx.kotlin.core.json.*

import com.github.seewindcn.wechat.Const
import com.github.seewindcn.wechat.bean.response.token.TokenResponse
import com.github.seewindcn.wechat.utils.client.HttpUtil

/**
 * 微信Token相关API接口.
 *
 */
object TokenApi {
    private val ACCESS_TOKEN_URL = Const.Uri.API_URI + "/cgi-bin/token"

    /**
     * 获取access_token.
     *
     * @param appId  第三方用户唯一凭证
     * @param secret 第三方用户唯一凭证密钥，即appsecret
     */
    fun token(appId: String, secret: String): TokenResponse {
        val params = json {
            obj(
                    "grant_type" to "client_credential",
                    "appid" to appId,
                    "secret" to secret
            )
        }
        return HttpUtil.getJsonBean(ACCESS_TOKEN_URL, params, TokenResponse::class.java)
    }
}