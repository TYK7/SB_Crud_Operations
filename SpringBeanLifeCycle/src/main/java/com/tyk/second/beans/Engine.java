package com.tyk.second.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;
@Component
public class Engine {
	public Engine() {
		System.out.println("Engine :: Constructor");
	}
	@jakarta.annotation.PostConstruct
	public void init()
	{
		System.out.println("Engine Started");
	}
    @PreDestroy
	public void destroy()
	{
		System.out.println("Engine Stopped");
	}
}
