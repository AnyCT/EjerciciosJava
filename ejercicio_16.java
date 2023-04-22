package Ejercicios_Practica;

import java.util.Scanner;

public class Solucion_Metodo_Cramer {

	public static void main(String[] args) {
		/* Determinar las soluciones de N sistema de ecuaciones lineales con dos incógnitas 
           aplicando el método de Cramer.
           ax + by = c
           dx + ey = f
           Donde a,b,c,d,e,f son números reales*/
		
	Scanner tc= new Scanner(System.in);
	
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double matriz1;
		double matriz2;
		double matriz3;
		double x;
		double y;
		
		System.out.println("Ingresa el valor de a:");
		a=tc.nextInt();
		
		System.out.println("Ingresa el valor de b:");
		b=tc.nextInt();
		
		System.out.println("Ingresa el valor de c:");
		c=tc.nextInt();
		
		System.out.println("Ingresa el valor de d:");
		d=tc.nextInt();
		
		System.out.println("Ingresa el valor de e:");
		e=tc.nextInt();
		
		System.out.println("Ingresa el valor de f:");
		f=tc.nextInt();
		
		
		//operacion 1 dato//
		
		matriz1=(a*d)-(b*c);
		
		System.out.println("La solucion de la primer matriz es: "+matriz1);
		
		//operacion 2 dato//
		
		matriz2=(c*f)-(d*e);
				
		System.out.println("La solucion de la segunda matriz es: "+matriz2);
		
		//operacion 3 dato//
		
		matriz3=(a*f)-(b*e);
						
		System.out.println("La solucion de la tercer matriz es: "+matriz3);
				
	   //Solucion//
		
		x=matriz2/matriz1;
		y=matriz3/matriz1;
		
		System.out.println("La solucion a la ecuacion ax + by = c y dx + ey = f es : "+x+","+y);
		
		
		
		
	}

}
