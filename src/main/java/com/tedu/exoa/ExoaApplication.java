package com.tedu.exoa;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tedu.exoa.mapper")
@SpringBootApplication
public class ExoaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExoaApplication.class, args);
    }

}
