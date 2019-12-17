package com.senati.clase02ejer02;
import java.util.Scanner;
public class Numero {
	public int Num;

	public Numero() {
		
	}

	public Numero(int num) {
	
		Num = num;
	}
	
	public String Primo() {
		String men;
		int a=0;
		for(double i=1;i<=Num;i++) {
			if (Num % i  == 0) {
				a++;
			}
		}
		if (a==2) {
			men="Número es primo";
		}else {
			men="Número no es primo";
		}		
		return men;
	}
	
	public String Perfecto() {
		String men;
		double a=0;
		for (double i=1;i<Num;i++) {
			if (Num % i == 0) {
				a = a + i;
			}
		}
		if (a==Num) {
			men="Número es perfecto";
		}
		else {
			men="Número no es perfecto";
		}
		return men;
	}
	

	public double Factorial() {
		double fac=1;
		while (Num != 0) {
			fac = fac * Num;
			Num--;
		}
		return fac;
	}
	int aux, inverso = 0, cifra;
	int N=Num;
	
	public void Capicua(int numero)
	{
		//System.out.print("" + numero);
	
		    int aux =numero;
	        while (aux!=0){
	            cifra = aux % 10;
	            inverso = inverso * 10 + cifra;
	            aux = aux / 10;
	        }
	 
	        if(numero == inverso){
	            System.out.println("Es capicua");
	        }else{
	            System.out.println("No es capicua");
	        }
	}
	//-------------------
	public long fibonacci(long numero) {
        if ((numero == 0) || (numero == 1))
            return numero;
        else
            return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
	
	public void mostrarZigno()
	{
	//--------------
	 Scanner da=new Scanner(System.in);
	 
	    int reset;
	    do {
	    System.out.println("::QUE SIGNO ZODIACAL ERES?::");
	    System.out.println("EN QUE MES ES TU CUMPLEAÑOS? \n1.-Enero\n2.-Febrero\n3.-Marzo\n4.-Abril\n5.-Mayo\n6.-Junio"
	            + "\n7.-Julio\n8.-Agosto\n9.-Septiembre\n10.-Octubre\n11.-Noviembre\n12.-Diciembre");
	    System.out.println();
	    System.out.println("EN QUE MES ES?");
	    int mes=da.nextInt();
	    System.out.println("EN QUE DÍA ES?");
	    System.out.println();
	    int dia=da.nextInt();
	    if(dia>=22 && dia<=31 && mes==12 || dia>=1 && dia<=20 && mes==1){
	        System.out.println("Tu signo zodiacal es CAPRICORNIO");
	    }else if (dia>=21 && dia<=31 && mes==1 || dia>=1 && dia<=19 && mes==2){
	        System.out.println("Tu signo zodiacal es ACUARIO");
	    }else if (dia>=20 && dia<=29 && mes==2 || dia>=1 && dia<=20 && mes==3){
	        System.out.println("Tu signo zodiacal es PISCIS");
	    }else if (dia>=21 && dia<=31 && mes==3 || dia>=1 && dia<=19 && mes==4){
	        System.out.println("Tu signo zodiacal es ARIES");
	    }else if (dia>=20 && dia<=30 && mes==4 || dia>=1 && dia<=20 && mes==5){
	        System.out.println("Tu signo zodiacal es TAURO");
	    }else if (dia>=21 && dia<=31 && mes==5 || dia>=1 && dia<=21 && mes==6){
	        System.out.println("Tu signo zodiacal es GÉMINIS");
	    }else if (dia>=22 && dia<=30 && mes==6 || dia>=1 && dia<=21 && mes==7){
	        System.out.println("Tu signo zodiacal es CANCER");
	    }else if (dia>=22 && dia<=31 && mes==7 || dia>=1 && dia<=21 && mes==8){
	        System.out.println("Tu signo zodiacal es LEO");
	    }else if (dia>=22 && dia<=31 && mes==8 || dia>=1 && dia<=22 && mes==9){
	        System.out.println("Tu signo zodiacal es VIRGO");
	    }else if (dia>=23 && dia<=30 && mes==9 || dia>=1 && dia<=22 && mes==10){
	        System.out.println("Tu signo zodiacal es LIBRA");
	    }else if (dia>=23 && dia<=31 && mes==10 || dia>=1 && dia<=21 && mes==11){
	        System.out.println("Tu signo zodiacal es ESCORPIO");
	    }else if (dia>=22 && dia<=30 && mes==11 || dia>=1 && dia<=21 && mes==12){
	        System.out.println("Tu signo zodiacal es SAGITARIO");
	    }
	    else{
	        System.out.println("FECHA INVÁLIDA");
	    }
	    System.out.println("Quieres reiniciar el programa? [Si-1/No-2]");
	    reset=da.nextInt();
	    }while (reset==1);
	    }
	
	//----------En letras
	 public void mostrarLetras()
	 {
		 Scanner leer = new Scanner(System.in);
			int num, dec, uni;
			String[] unidades = {"cero" , "uno" ,"dos" , "tres" , "cuatro" , "cinco" , "seis" , "siete" , "ocho" , "nueve" };
			String[] decenas = { "diez" , "veinte" , "treinta" , "cuarenta" , "cincuenta" , "sesenta" , "setenta"
					, "ochenta" , "noventa" };
			System.out.println("Ingresa un numero del 1 al 99 : ");
			num = leer.nextInt();
			dec = num / 10;
			uni = num % 10;
			//System.out.println((num/10)+"and"+num%10);
			System.out.println("El numero " + num + " es " + decenas[dec-1] + " y " + unidades[uni]);
	 
			if (num >= 11 && num <= 15) {
				switch (num) {
				case 11:
					System.out.println("once");
					break;
				case 12:
					System.out.println("doce");
					break;
				case 13:
					System.out.println("trece");
					break;
				case 14:
					System.out.println("catorce");
					break;
				}
				if (uni == 0) {
					switch (num) {
					case 10:
						System.out.println("diez");
						break;
					case 20:
						System.out.println("veinte");
						break;
					case 30:
						System.out.println("treinta");
						break;
					case 40:
						System.out.println("cuarenta");
						break;
					case 50:
						System.out.println("cincuenta");
						break;
					case 60:
						System.out.println("sesenta");
						break;
					case 70:
						System.out.println("setenta");
						break;
					case 80:
						System.out.println("ochenta");
						break;
					case 90:
						System.out.println("noventa");
						break;
					}
				}
	 
			}
		}
 
}
