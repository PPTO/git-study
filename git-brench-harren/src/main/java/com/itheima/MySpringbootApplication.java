package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class MySpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class);
        test();
        test2();
        test3();
        System.out.println("this edit from online");
        System.out.println("test Tag");
    }

    public static void test(){
        System.out.println("test from brench harren");
    }

    public static void test2(){
        System.out.println("test from reset");
    }

    public static void test3(){
        System.out.println("test from brench");
        System.out.println("test from refix");
    }
}
