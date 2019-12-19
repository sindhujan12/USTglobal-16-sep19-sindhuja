package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.book.Author;
import com.ustglobal.springcore.book.Book;
import com.ustglobal.springcorre.di.Hello;

public class BookApp {
	 public static void main( String[] args )
	    {
	    	ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
//	    	//Author author= context.getBean(Author.class);
//	    	System.out.println(author.getName());
//	    	System.out.println(author.getPenName());
//	    	
	    	Book book = context.getBean(Book.class);
	    	System.out.println(book.getAuthorName());
	    	System.out.println(book.getbName());
	    	System.out.println(book.getPrice());
	    	

}
}
