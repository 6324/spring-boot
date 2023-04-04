package com.chenyi;


import cn.hutool.core.date.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController2 {
	@GetMapping("/hello2")
	public String index() {
		System.out.println("1111");
		return "hello " + DateUtil.now();
	}

}
