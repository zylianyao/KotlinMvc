package com.sanchan.kotlinmvc.controller

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * Created by zylia on 2016/2/18 0018.
 */
@RestController
class IndexCtr {
    /**
     * 用于处理异常的
     * @return
     */
    //@RequestMapping("/error")与以下是相同的效果
    @ExceptionHandler()
    fun exception(e: Exception): String = "错误" + e.message

    @RequestMapping("/")
    fun index(): java.util.HashMap<String, String> {
        val result = HashMap<String, String>()
        result.put("1", "一")
        result.put("2", "二")
        return result;
    }

    @RequestMapping("/login")
    fun login(): String = "登录！！！"
}