package Ejercicios_Practica;

import java.util.Scanner;

public class Ejercicio_14_formula_solucion_lineal {

	public static void main(String[] args) {
		/*Determinar la solución lineal que tiene la forma ax + b =0 donde a y b son números reales
		donde haremos un despeje de x=0-b/a  */
		
		Scanner tc= new Scanner(System.in);
		
		double a;
		double b;
		double x;
		
		System.out.println("Ingrese el valor de a");
		a=tc.nextInt();
		
		System.out.println("Ingrese el valor de b");
		b=tc.nextInt();
		
		x=0-b/(a);
		
		System.out.println("la solución lineal que tiene la forma ax + b =0 donde a y b es : "+x);
		
		
		
	}

}
