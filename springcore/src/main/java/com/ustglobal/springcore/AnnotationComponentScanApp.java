package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ComponentScanConfig;
import com.ustglobal.springcore.config.ConfigurationClass;
import com.ustglobal.springcorre.di.Hello;
import com.ustglobal.springcorre.di.Pet;

public class AnnotationComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		Hello hello = context.getBean(Hello.class);
    	hello.setMsg("I Love Food");
    	System.out.println(hello.getMsg());
    	
    	Pet pet = context.getBean(Pet.class);
    	pet.setName("Scoobo");
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
		
		
	}

}
