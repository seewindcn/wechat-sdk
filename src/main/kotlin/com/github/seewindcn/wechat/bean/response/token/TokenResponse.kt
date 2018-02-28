package com.github.seewindcn.wechat.bean.response.token


import com.github.seewindcn.wechat.bean.response.BaseResponse

class TokenResponse : BaseResponse() {
    var accessToken: String? = null
    var expiresIn: Int? = null

    override fun toString(): String {
        return ("TokenResponse{accessToken='$accessToken', expiresIn=$expiresIn, errcode=${super.errcode}, errmsg='${super.errmsg}'}")
    }
}

