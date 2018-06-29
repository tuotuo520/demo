package com.greyson.gycptest;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GycpTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GycpTestApplication.class, args);
	}
	@GetMapping("/demo")
	public String demo() {
		return "Hello World!!";
	}
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
		// 目的是
        return args -> {
            System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
            String[] beanNames = applicationContext.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            Arrays.stream(beanNames).forEach(System.out::println);
        };
	}
}
