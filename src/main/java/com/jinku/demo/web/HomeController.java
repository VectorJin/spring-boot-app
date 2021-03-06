package com.jinku.demo.web;

import com.jinku.demo.bean.vo.WelcomeVo;
import com.jinku.demo.config.AppConfig;
import com.jinku.demo.config.OtherConfig;
import com.jinku.demo.dao.UserMapper;
import com.jinku.demo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    OtherConfig otherConfig;
    @Autowired
    AppConfig appConfig;
    @Autowired
    UserMapper userMapper;

    @PostMapping("/**")
    WelcomeVo home() {
        WelcomeVo welcomeVo = new WelcomeVo();
        welcomeVo.setWelcome("hello world;" + otherConfig.getWelcome() + ";" + appConfig.getRedisIp());
        return welcomeVo;
    }

    @PostMapping("/userInfo")
    UserInfo userInfo(String phone) {
        return userMapper.findByPhone(phone);
    }
}
