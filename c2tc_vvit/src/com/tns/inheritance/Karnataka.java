package com.tns.inheritance;
class India {
	protected String lang="Hindi";
	void displayNational() {
		System.out.println("National lang"+lang);
	}
	
	
}
public class Karnataka extends India {
	public String lang="kannada";
	void displayLocal() {
		System.out.println("Local lang"+lang);
}
}