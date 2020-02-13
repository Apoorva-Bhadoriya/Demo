package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("cow")
public class Cow implements Desi {
	
	@Override
	public String silk() {
		// TODO Auto-generated method stub
		return " hello from cowww";

}
}
