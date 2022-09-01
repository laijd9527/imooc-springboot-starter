package com.imooc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.User;

@Controller
@RequestMapping("th")
public class ThymeleafController {
	
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name","thymeleaf-imooc");
		return "thymeleaf/index";
	}
	
	@RequestMapping("center")
	public String center() {
		
		return "thymeleaf/center/center";
	}
	
	@RequestMapping("test")
	public String test(ModelMap map) {
		
		User u=new User();
		u.setName("Lai");
		u.setAge(17);
		u.setPassword("123");
		u.setBirthday(new Date());
		u.setDesc("<font color='red'><b>hello world!!!,你好世界！！！</b></font>");
		
		map.addAttribute("user",u);
		
		User u1=new User();
		u1.setName("Jin");
		u1.setAge(18);
		u1.setPassword("456");
		u1.setBirthday(new Date());
		
		User u2=new User();
		u2.setName("Di");
		u2.setAge(19);
		u2.setPassword("789");
		u2.setBirthday(new Date());
		
		List<User>userList=new ArrayList<>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		
		map.addAttribute("userList",userList);
				
		return "thymeleaf/test";		
	}
	
	@PostMapping("postform")
	public String postform(User u) {
		
		System.out.println("姓名："+u.getName());
		System.out.println("年龄："+u.getAge());
		
		return "redirect:/th/test";
	}
	
}
