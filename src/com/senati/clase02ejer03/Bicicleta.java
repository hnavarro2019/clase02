package com.senati.clase02ejer03;

public class Bicicleta {
	  int velocidadActual;
	  int velocidadMaxima;
	  int engranajeActual;
	  String nroAro;
	  String marca;
	  String modelo;

	  void cambiarLlantas(){
	    System.out.println("Cambiando llantas");
	  }

	  void frenar() { 
	    System.out.println("Frenando");
	  }

	  void cambiarVelocidad(int engranajeActual){
	    this.engranajeActual = engranajeActual;
	    System.out.println("Cambiando velocidad a " + engranajeActual); 
	  } 

}
