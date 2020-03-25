package com.jinku.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Value("${redis.ip}")
    private String redisIp;

    public String getRedisIp() {
        return redisIp;
    }

    public void setRedisIp(String redisIp) {
        this.redisIp = redisIp;
    }
}
