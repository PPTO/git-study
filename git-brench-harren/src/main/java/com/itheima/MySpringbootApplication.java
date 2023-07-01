package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class);
        test();
        test2();
    }

    public static void test(){
        System.out.println("test from brench harren");
    }

    public static void test2(){
        System.out.println("test from reset");
    }
}
