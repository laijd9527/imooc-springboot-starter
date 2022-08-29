package com.imooc.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

@RestController// = @Controller + @ResponseBody
//@Controller
@RequestMapping("/user")

public class userController {
	
    @RequestMapping("/getUser")
    //@ResponseBody
    public User getUser() {
    	
    	
    	User u=new User();
    	u.setName("imooc");
    	u.setAge(18);
    	u.setBirthday(new Date());
    	u.setPassword("imooc");
    	u.setDesc("hello world!!!");    	
    	
        return u;
    }
    
   
    @RequestMapping("/getUserJsonResult")
    //@ResponseBody
    public IMoocJSONResult getUserJsonResult() {
    	
    	
    	User u=new User();
    	u.setName("imooc");
    	u.setAge(18);
    	u.setBirthday(new Date());
    	u.setPassword("imooc");
    	//u.setDesc(null);   	
    	
        return IMoocJSONResult.ok(u);
    }
}
