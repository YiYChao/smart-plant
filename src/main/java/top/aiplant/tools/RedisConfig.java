package top.aiplant.tools;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
 
import java.text.SimpleDateFormat;
 
/**
 * @ClassName: RedisConfig  
 * @Description: Redis序列化配置类 
 * @author: YiYChao
 * @date 2019年12月9日 上午9:49:17
 *
 */
//@Configuration
//@EnableCaching
public class RedisConfig {
    @Bean(name = "redisTemplate")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        ObjectMapper mapper = new ObjectMapper(new MessagePackFactory());
        /**设置存储到redis中的日期格式*/
        mapper.setDateFormat(new SimpleDateFormat("yyyyMMddHHmmss"));
        Jackson2JsonRedisSerializer Jackson2Serializer = new Jackson2JsonRedisSerializer(Object.class);
        Jackson2Serializer.setObjectMapper(mapper);
        RedisSerializer redisSerializer = Jackson2Serializer;
        redisTemplate.setValueSerializer(redisSerializer);
        redisTemplate.setHashValueSerializer(redisSerializer);
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }
}