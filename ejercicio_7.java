package Ejercicios_Practica;

import java.util.Scanner;

public class Convertir_Fahrenheit_Grados_Celsius {

	public static void main(String[] args) {
		// Esta operacion consiste en convertir Grados ºF a ºC
		
	 Scanner tc= new Scanner(System.in);
	 
	 int F;
	 double C;
	 double formula;
	 double constante1=32;
	 double constante2=5;
	 double constante3=9;
	 
	 
	 System.out.println("Ingresa el valor F");
	 F= tc.nextInt();
	 
	 //formula de calculo (0 °F − 32) × 5/9 = -17.78 °C//
	 
	 formula= ((F-constante1)*constante2)/constante3;
	 
	 System.out.println("El valor de conversion de "+F+ " F a C es "+formula);
			 
	 
	

	}

}
