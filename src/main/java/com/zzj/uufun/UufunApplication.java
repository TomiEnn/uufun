package com.zzj.uufun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * java应用的入口，核心类
 * @ClassName:  UufunApplication   
 * @author: Tomi_Jay
 * @date:   2018年10月11日 下午9:00:27   
 *
 *@SpringBootApplication 是Spring Boot 的核心注解，它是一个组合注解，
 *该注解组合了：@Configuration、@EnableAutoConfiguration、@ComponentScan； 
 *若不是用 @SpringBootApplication 注解也可以使用这三个注解代替。
 */
@SpringBootApplication
public class UufunApplication {

	public static void main(String[] args) {
		SpringApplication.run(UufunApplication.class, args);
	}
}
