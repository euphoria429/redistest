package com.hcx.redistest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedistestApplicationTests {

    @Autowired
    RedisTemplate<String,String> redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("myKey","myValue");
        System.out.println(redisTemplate.opsForValue().get("myKey"));

    }

}
