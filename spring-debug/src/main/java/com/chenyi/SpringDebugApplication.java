package com.chenyi;

import cn.hutool.core.date.DateUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDebugApplication {

	@GetMapping("/666")
	public String hello(){
		return DateUtil.now();
	}
	public static void main(String[] args) {
//		System.out.println(DateUtil.now());
//		System.out.println(SystemUtil.getJavaInfo());
//		System.out.println(SystemUtil.getJavaRuntimeInfo());
//		System.out.println(SystemUtil.getJavaSpecInfo());
		SpringApplication.run(SpringDebugApplication.class, args);
	}

}
