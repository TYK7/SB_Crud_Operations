package com.tyk.second.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean {
	public Motor() {
		System.out.println("Motor:: Constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() will be executed");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy metod will called");
		
	}

}
