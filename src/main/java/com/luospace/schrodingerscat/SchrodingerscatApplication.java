package com.luospace.schrodingerscat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.luospace.schrodingerscat.dao")
@SpringBootApplication
public class SchrodingerscatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchrodingerscatApplication.class, args);
    }

}
