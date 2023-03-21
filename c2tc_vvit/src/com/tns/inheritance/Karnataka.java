package com.tns.inheritance;
class India {
	protected String lang="Hindi";
	void displayNationalIndia() {
		System.out.println("National lang of India is " +lang);
	}
	
	
}
class Kerala extends India{
	public String lang="Malyalam";
	void displayLocalKerala() {
		System.out.println("Local lang of Kerala is " +lang);
	}
}
public class Karnataka extends Kerala {
	public String lang="kannada";
	void displayLocalKarnataka() {
		System.out.println("Local lang of Karnataka is " +lang);
}
}