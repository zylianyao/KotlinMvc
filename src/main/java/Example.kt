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

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(arrayOf(Example::class.java), args)
        }
    }


}