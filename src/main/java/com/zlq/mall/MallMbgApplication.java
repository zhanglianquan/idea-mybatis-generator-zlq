package com.zlq.mall;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan({"com.zlq.mall.mapper"})
@EnableTransactionManagement
public class  MallMbgApplication{
    public static void main(String[] args) {
        SpringApplication.run(MallMbgApplication.class, args);
    }
}