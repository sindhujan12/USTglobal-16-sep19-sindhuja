package com.ustglobal.phoneapp.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.phoneapp.dao.MobileDAO;
import com.ustglobal.phoneapp.dto.MobileBean;
import com.ustglobal.phoneapp.util.MobileManager;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to Show all contacts");
		System.out.println("Press 2 to Search for contact");
		System.out.println("Press 3 to Operate on contact");

		System.out.println("enter your choice");
		int ch = sc.nextInt();
		
		switch (ch) {

		case 1:
			MobileDAO md= MobileManager.getInstance();
			List<MobileBean> mb=md.allDetails();
			for(MobileBean res :mb) { 
				System.out.println("name---->"+res.getName());
			}
			break;

		case 2:
			MobileDAO md1= MobileManager.getInstance();
			
			String s =sc.next();

			MobileBean mb1=md1.searchContact(s);
			if(mb1!=null) {

				System.out.println("Name     :"+mb1.getName());
				System.out.println("Salary   :"+mb1.getNumber());
				System.out.println("group   :"+mb1.getGrup());

			}else {
				System.out.println("not doumf");
			}
			
			System.out.println("press 1 to call");
			System.out.println("Press 2 get message");
			System.out.println("Press 3 to back to the main menu");
			System.out.println("enter choice");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(mb1!=null) {

					System.out.println("Name     :"+mb1.getName());
					System.out.println("Salary   :"+mb1.getNumber());
					System.out.println("group   :"+mb1.getGrup());

				}

				System.out.println("end call");
				
				break;
			case 2 :
				String s1 =sc.nextLine();
				System.out.println("message sent ");
				
				break;
			case 3:
				break;
			default:
				break;
			}

			break;	
		case 3:
			System.out.println("press 1 to add contacts");
			System.out.println("Press 2 to delete contact");
			System.out.println("Press 3 to edit contact");
			System.out.println("enter your choice");        
			int i = sc.nextInt();
			switch (i) {
			case 1:
				MobileDAO md2= MobileManager.getInstance();
				System.out.println("enter details");
				
				MobileBean m = new MobileBean();
				m.setName(sc.next());
				m.setNumber(sc.nextLong());
				m.setGrup(sc.next());
				int count = md2.insertContact(m);
				System.out.println("data inserted");
				break;
			case 2:
				MobileDAO md3= MobileManager.getInstance();
				System.out.println("enter name to delete");
				
				MobileBean m1 = new MobileBean();
				m1.setName(sc.next());
				int c =md3.deleteContact(m1);
				System.out.println(c +"data deleted");
				break;
			case 3:
				MobileDAO md4= MobileManager.getInstance();
				System.out.println("enter details");
				
				MobileBean m2= new MobileBean();
				m2.setName(sc.next());
				m2.setNumber(sc.nextInt());
				m2.setGrup(sc.next());
				 int c1 = md4.updateContact(m2);
				 System.out.println(c1+"updated");
				
		
			}//end of innser switch

			break;
		default:
			break;
		}//end of switch case


	}	//end of main method


}//end of class
