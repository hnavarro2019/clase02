package com.senati.clase02ejer02;

	import java.util.Scanner;
	public class TestNumero {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				Numero Onum = new Numero();
				Scanner Leer = new Scanner(System.in);
				System.out.print("\n Ingrese el número : ");
				int n = Leer.nextInt();
				int num2=n;
				Onum.Num = n;
				
				System.out.println(" " + Onum.Primo());
				System.out.println(" " + Onum.Perfecto());
				System.out.println(" Factorial " + Onum.Factorial());
				
				//------------------------------------
				Onum.Capicua(num2);
				//------------------
				//-------En letras
				Onum.mostrarLetras();
				//------------------------
				System.out.print("\n Ingrese el número para FIBO : ");
				int n2 = Leer.nextInt();
				for (int cont = 1; cont <= n2; cont++){
		            System.out.printf("Fibonacci de %d es: %d\n",
		            		cont, Onum.fibonacci(cont));
		        }
				
				Onum.mostrarZigno();
				
			}catch (Exception ex) {
		
			
		}	
			
		
	}
}
