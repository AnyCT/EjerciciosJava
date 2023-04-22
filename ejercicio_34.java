package Ejercicios_Practica;

import java.util.Scanner;

public class Ejercicio_34 {

	public static void main(String[] args) {
		/* Ejercicio 34. Escriba un programa que lea “n” números enteros y que los imprima */
		
		Scanner tc =new Scanner(System.in);
		
		int n;
		
          System.out.println("Ingresa un numero cualquiera");
           n=tc.nextInt();
		
		
		   for(int b=1; b<=n;  b++)
		
		   System.out.println("b:"+ b);
		     
		   System.out.println(" Estimado Lector, ha impreso hasta el numero :"+n);


	}

}
