package com.imooc.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;

@RestController
public class helloController {
	
    @RequestMapping("/hello")
    public Object hello() {
        return "hello world!!!";
    }
    
    @Autowired
	private Resource resource;
    
    @RequestMapping("/getResource")
    public IMoocJSONResult getResource() {
    	
    	Resource bean=new Resource();
    	BeanUtils.copyProperties(resource, bean);
    	
        return IMoocJSONResult.ok(bean);
    }
    
}
