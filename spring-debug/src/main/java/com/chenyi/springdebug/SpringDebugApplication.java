package com.chenyi.springdebug;

import cn.hutool.system.SystemUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.hutool.core.date.DateUtil;
//import cn.hutool.core.util.StrUtil;

@SpringBootApplication
public class SpringDebugApplication {

	public static void main(String[] args) {
		System.out.println(DateUtil.now());
		System.out.println(SystemUtil.getJavaInfo());
		System.out.println(SystemUtil.getJavaRuntimeInfo());
		System.out.println(SystemUtil.getJavaSpecInfo());

		 SpringApplication.run(SpringDebugApplication.class, args);
	}

}
