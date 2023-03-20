package com.tnsif.vvit;


import java.util.Scanner;

import com.tnsiff1.Customer;

public class Constructor {

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("Enter customer id");
		id=sc.nextInt();
		System.out.println("Enter customer name");
		name=sc.nextLine();
		System.out.println("Enter customer city");
		city=sc.nextLine();
		System.out.println("-------------");
		Customer ob=new Customer();
		ob.setCustomerId(id);
		ob.setCustomerName(name);
		ob.setCustomerCity(city);
	}

}
