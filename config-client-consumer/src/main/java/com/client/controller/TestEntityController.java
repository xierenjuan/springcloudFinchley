package com.client.controller;

import com.client.config.TestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestEntityController {


    @Resource
    private TestEntity testEntity;

    @RequestMapping("get")
    public Object get(){

        return testEntity.getName();
    }
}
