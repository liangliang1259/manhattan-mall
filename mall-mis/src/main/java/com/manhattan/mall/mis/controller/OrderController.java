package com.manhattan.mall.mis.controller;

import com.manhattan.mall.common.rest.RestResult;
import com.manhattan.mall.common.rest.RestResultBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: Leon Sun
 * @Date: 2020/9/2
 */
@RequestMapping
@RestController
public class OrderController {
  @GetMapping("/orders/{id}")
  public RestResult create(@PathVariable("id")Long id){
    return RestResultBuilder.builder().success().data("Hello,world!").build();
  }

}
