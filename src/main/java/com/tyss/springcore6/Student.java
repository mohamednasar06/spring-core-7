package com.tyss.springcore6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;

	public String getName() {
		return name;
	}
     @Value(value="nasar")
	public void setName(String name) {
		this.name = name;
	}
	
	

}
