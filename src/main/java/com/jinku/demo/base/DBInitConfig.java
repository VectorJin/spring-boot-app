package com.jinku.demo.base;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class DBInitConfig {

    @PostConstruct
    public void init() {
        new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .setName("testDB;MODE=MySQL;" +
                        "INIT=create schema if not exists schema1;DB_CLOSE_DELAY=-1;")
                .addScript("classpath:init.sql")
                .build();
    }
}
