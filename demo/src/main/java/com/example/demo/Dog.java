package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("dog")
public  class Dog implements Desi{
	
	public String silk() {
		// TODO Auto-generated method stub
		return " hello from doggooo";
	}
	

}
