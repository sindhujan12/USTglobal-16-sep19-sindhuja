package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcorre.di.Hello;
import com.ustglobal.springcorre.di.Pet;

public class XmlComponent {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscomponent.xml");
    	
		Hello hello = context.getBean(Hello.class);
    	hello.setMsg("I Love Food");
    	System.out.println(hello.getMsg());
    	
    	Pet pet = context.getBean(Pet.class);
    	pet.setName("Scoobo");
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
	}

}
