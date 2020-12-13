package com.sun.nacos.provide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matt Sun
 * @version 1.0
 * @date 2020/12/13 11:37
 */


 @RestController
 @RefreshScope
public class Controller {

     @Value("${member.name}")
     private String memberName;

     @Value("${member.age}")
     private String memberAge;

  @GetMapping("/getProvide")
 public String getProvide(){
   return "欢迎访问服务的提供者！" + memberName + memberAge;
  }
}
