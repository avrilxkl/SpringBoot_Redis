package com.example.springboot_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootRedisApplicationTests {

    @Autowired
    private StringRedisTemplate redisTemplate;



    @Test
    void contextLoads() {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("cyx","520");
        System.out.println(ops.get("陈妍希"));
    }

}
