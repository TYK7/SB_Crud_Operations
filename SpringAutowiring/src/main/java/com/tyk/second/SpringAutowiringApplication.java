package com.tyk.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tyk.second.service.ReportService;

@SpringBootApplication
public class SpringAutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringAutowiringApplication.class, args);
		ReportService rs=context.getBean(ReportService.class);
		rs.generateData();
		
	}

}
