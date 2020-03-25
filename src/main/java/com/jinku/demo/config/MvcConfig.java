package com.jinku.demo.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MvcConfig {

    @Bean
    public HttpMessageConverters customConverters() {
        return new HttpMessageConverters(new FastJsonHttpMessageConverter());
    }

}
