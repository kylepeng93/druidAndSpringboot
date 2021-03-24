package com.github.kylepeng93;

import com.sun.tools.javac.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 启动器类
 * https://kylepeng93.github.io
 *
 * @author pengkai
 * @date 2021-03-24 下午10:24
 */
@SpringBootApplication
@MapperScan("com.github.kylepeng93.mapper")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
