package com.senati.clase02ejer01;

public class AppArticulo {
	public static void main(String[] args) {
	Articulo a=new Articulo ("A0001","TV","LG",2000);
	Articulo a1=new Articulo ("A0002","TABLET","SAMSUMG",500);
	Articulo a2 = new Articulo(a);
	Articulo a3 = new Articulo();
	
	
	System.out.println(" " + a.toString());
	System.out.println(" " + a1.toString());
	System.out.println(" " + a2.toString());
	System.out.println(" " + a3.toString());
  }
}