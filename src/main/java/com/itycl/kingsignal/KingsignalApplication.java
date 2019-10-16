package com.itycl.kingsignal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itycl.kingsignal.mapper")
public class KingsignalApplication {
    public static void main(String[] args) {
        SpringApplication.run(KingsignalApplication.class, args);
    }

}
