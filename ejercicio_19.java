package Ejercicios_Practica;

import java.util.Scanner;

public class formula_If_votante {

	public static void main(String[] args) {
		/* Escriba un programa que lea la edad de una persona e imprima es votante dado que tiene 
		16 o más años de edad*/
		
		Scanner tc= new Scanner(System.in);
		
		int edad_persona;
		
		System.out.println("Ingrese la edad de la Persona");
		edad_persona=tc.nextInt();
		
		if (edad_persona>=16)  {
			
		System.out.println("Segun la edad ingresada es mayor de edad, por tanto es una persona votante");
		}
		
		else  {
			System.out.println("Segun la edad ingresada es menor de edad, por tanto no cumple con el criterio de votante");	

		}
}
}
