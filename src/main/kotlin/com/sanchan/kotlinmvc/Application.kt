/**
 * Created by zylia on 2016/2/16 0016.
 */
package com.sanchan.kotlinmvc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ExceptionHandler

//@RestController注解告诉Spring以字符串的形式渲染结果,并直接返回给调用者。
//这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring
//由于spring-boot-starter-web添加了Tomcat和Spring MVC，所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。
//如果发现应用了你不想要的特定自动配置类，你可以使用@EnableAutoConfiguration注解的exclude属性来禁用它们。例如：@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan自动扫描注入
//Spring Boot提倡基于Java的配置。尽管你可以使用一个XML源来调用SpringApplication.run()，我们通常建议你使用@Configuration类作为主要源。一般定义main方法的类也是主要@Configuration的一个很好候选。
//你可以使用附加的@Import注解可以用来导入其他配置类 @ImportResource注解加载XML配置文件
@SpringBootApplication // 相当于 @Configuration @EnableAutoConfiguration @ComponentScan
open class Application {

    //在项目根目录mvn spring-boot:run可以运行
    //由于Spring boot 会检测main是否是static kotlin删除了static特性，得使用以下形式来使编译后的class中main为static
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            //此处与java中获取class不同
            //            SpringApplication.run(Application::class.java, *args)
            //.class.java代表按照java中的反射，否则会类型不匹配
            //val app = SpringApplication(Application::class);
            val app = SpringApplication(Application::class.java)
            app.setBanner(BannerImpl())
            app.run(*args)
        }
    }


}