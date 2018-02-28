package com.github.seewindcn.wechat

/**
 * 微信相关常量.
 *
 */
class Const {
    companion object Uri {
        val API_URI_HTTP = "http://api.weixin.qq.com"
        val API_URI = "https://api.weixin.qq.com"
        val FILE_URI = "http://file.api.weixin.qq.com"
        val MP_URI = "https://mp.weixin.qq.com"
        val MCH_URI = "https://api.mch.weixin.qq.com"
        val OPEN_URI = "https://open.weixin.qq.com"
    }

    interface Charset {
        companion object {
            val UTF_8 = "UTF-8"
            val ISO_8859_1 = "iso-8859-1"
        }
    }

    interface Lang {
        companion object {
            val ZH_CN = "zh_CN"
        }
    }
}
