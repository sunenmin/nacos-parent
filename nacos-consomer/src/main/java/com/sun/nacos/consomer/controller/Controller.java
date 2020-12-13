package com.sun.nacos.consomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Matt Sun
 * @version 1.0
 * @date 2020/12/13 12:41
 */

@RestController
public class Controller {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getConsumer")
    public String getConsumer(){
        return "欢迎访问消费者！" +
                restTemplate.getForObject("http://nacos-provide/getProvide" , String.class);
    }
}
