package com.sanchan.kotlinmvc.config

/**
 * Created by zylia on 2016/2/18 0018.
 */
import org.beetl.json.ext.BeetlJsonHttpMessageConverter
import org.springframework.boot.autoconfigure.web.HttpMessageConverters
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter
import java.util.ArrayList

@Configuration
//org.springframework.beans.factory.parsing.BeanDefinitionParsingException: Configuration problem: @Configuration class 'JsonConverterConfig' may not be final. Remove the final modifier to continue.
open class JsonConverterConfig {
    @Bean
    //@Bean method 'customConverters' must not be private or final; change the method's modifiers to continue
    open fun customConverters(): HttpMessageConverters {
        val converter = BeetlJsonHttpMessageConverter()
        var jsonMediaType = MediaType("text", "html")
        var list = ArrayList<MediaType>()
        list.add(jsonMediaType)
        converter.supportedMediaTypes = list
        return HttpMessageConverters(converter);
    }
}