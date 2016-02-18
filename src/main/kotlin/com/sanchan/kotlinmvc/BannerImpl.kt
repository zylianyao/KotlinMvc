package com.sanchan.kotlinmvc

/**
 * Created by zylia on 2016/2/18 0018.
 */
import java.io.PrintStream;

import org.springframework.core.env.Environment;
import org.springframework.boot.Banner

//当没有指定的banner静态文件时才会生效
class BannerImpl : Banner {

    public override fun printBanner(environment: Environment, sourceClass: Class<*>, out: PrintStream) {
        println("可以在BannerImpl中设定")

    }
}