package com.tnsif.vvit;

public class executor {
	
	public static void main(String args[]) {
		//TODO Auto-generated method stub
		First ob=new First();//creation of object
		ob.backward();
		ob.forward();
		ob.stop();
		ob.color="white";
		System.out.println("The registration number of white car is " +ob.reg);
		System.out.println("The amount of this car is " +ob.amount);
		}
}
