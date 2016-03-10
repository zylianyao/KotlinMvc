import com.fasterxml.jackson.databind.ObjectMapper
import com.mashape.unirest.http.Unirest
import java.util.*

/**
 * Created by zylia on 2016/2/18 0018.
 */
fun main(args: Array<String>) {
    Unirest.setObjectMapper(object : com.mashape.unirest.http.ObjectMapper {
        var jacksonObjectMapper = ObjectMapper();

        override fun <T> readValue(value: String, valueType: Class<T>): T {
            return jacksonObjectMapper.readValue(value, valueType);
        }

        override fun writeValue(value: Any): String {
            return jacksonObjectMapper.writeValueAsString(value);
        }
    });
    var token = Unirest.get("https://api.weixin.qq.com/cgi-bin/token")
            .queryString(mapOf<String, String>("grant_type" to "client_credential",
                    "appid" to WeiXin.appID,
                    "secret" to WeiXin.appsecret))
            .asObject(Token::class.java).body
    println("*******************************************************")
    println(token.access_token)
    println(token.expires_in)
    println("*******************************************************")
    Unirest.shutdown();
}