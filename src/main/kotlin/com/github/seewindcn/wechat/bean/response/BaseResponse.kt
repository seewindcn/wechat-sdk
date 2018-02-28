package com.github.seewindcn.wechat.bean.response

import com.github.seewindcn.wechat.bean.ReturnCode

/**
 * 微信请求返回基本状态数据.
 *
 */
open class BaseResponse {
    var errcode: Int? = null
        get() = if (field == null) SUCCESS_CODE else field
    var errmsg: String? = null
        get() {
            val msg = ReturnCode.get(errcode!!)
            return if (msg == null || msg.isEmpty()) field else msg
        }

    val isSuccess: Boolean
        get() = errcode == SUCCESS_CODE

    override fun toString(): String {
        return "BaseResponse{errcode=$errcode, errmsg='$errmsg'}"
    }

    companion object {
        private val SUCCESS_CODE = 0
    }
}




