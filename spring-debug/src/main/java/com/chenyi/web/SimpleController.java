package com.chenyi.web;


import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SimpleController {
	@GetMapping("/hello")
	public String index() {
		System.out.println("1111");
		return "hello " + DateUtil.now();
	}

}
