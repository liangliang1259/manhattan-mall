package com.manhattan.mall.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.manhattan.mall.*")
public class MallApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(MallApiApplication.class, args);
  }

}
