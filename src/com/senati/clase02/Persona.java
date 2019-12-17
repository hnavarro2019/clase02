package com.senati.clase02;

public class Persona {

	String dni;
	String nombre;
	String apellido;
	char sexo;
	int edad;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona()
	{
		this.dni = "";
		this.nombre ="";
		this.apellido = "";
		this.sexo = ' ';
		this.edad = 0;
	}
	public Persona(Persona p) {
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.apellido = p.apellido;
		this.sexo = p.sexo;
		this.edad = p.edad;
	}

	public Persona(String dni, String nombre, String apellido, char sexo,int edad) 
	{
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	

	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad="
				+ edad + "]";
	}
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
