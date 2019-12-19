package com.ustglobal.springcorre.di;

import org.springframework.stereotype.Component;

@Component
public class Cat  implements Animal{
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}



