package Ejercicios_Practica;

import java.util.Scanner;

public class Determinar_el_valor_del_determinante_de_segundo_orden {

	public static void main(String[] args) {
		// Se hace el calculo de matriz sea a*d-b*c
		
		Scanner tc= new Scanner(System.in);
		
		
		double a;
		double b;
		double c;
		double d;
		double matriz1;
		double matriz2;
		double determinante;
		
		System.out.println("Ingresa el valor de a");
		a=tc.nextInt();
		
		System.out.println("Ingresa el valor de b");
		b=tc.nextInt();
		
		System.out.println("Ingresa el valor de c");
		c=tc.nextInt();
		
		System.out.println("Ingresa el valor de d");
		d=tc.nextInt();
		
		System.out.println("Se hace la multiplicaciòn del diagonal principal a*d y se resta del diagonal secundario b*c");
		
		//operacion//
		
		matriz1=a*d;
		matriz2=b*c;
		determinante=matriz1-matriz2;
		
		System.out.println("El valor determinante de segundo orden es: "+determinante);
		
		
	}

}
