package com.senati.clase02;

public class AppPersona {

	public static void main(String[] args) {
		Persona p=new Persona ("25782211","Jorge","Luque",'M',20);
		Persona p1=new Persona ("25782211","Freddy","Morgan",'M',20);
		Persona p2 = new Persona(p);
		Persona p3 = new Persona();
		
		
		System.out.println(" " + p.toString());
		System.out.println(" " + p1.toString());
		System.out.println(" " + p2.toString());
		System.out.println(" " + p3.toString());

		
		

	}

}
