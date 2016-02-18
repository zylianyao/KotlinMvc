/**
 * Created by zylia on 2016/2/16 0016.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
open class Example {

    @RequestMapping("/")
    fun home(): String = "Hello World! xxx"

    //由于Spring boot 会检测main是否是static kotlin删除了static特性，得使用以下形式来使编译后的class中main为static
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            //此处与java中获取class不同
            SpringApplication.run(arrayOf(Example::class.java), args)
        }
    }


}