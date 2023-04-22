package Ejercicios_Practica;

import java.util.Scanner;

public class Determinar_el_valor_de_y_tercer_ejercicio {

	public static void main(String[] args) {
		/*Determine el valor de Y= X*C-2 donde C es una constante con valor C=2.5
		a)Sabiendo que X=2
		b)Considerando a X un valor cualquiera*/
		
		Scanner tc= new Scanner(System.in);
		
		double y;
		double x;
		double c=2.5;
		double constante=2;
		
		System.out.println("Ingresa el valor de x");
		x=tc.nextInt();
    	   
			
       y=x*c-constante;
       System.out.println("El calculo de la formula Y= X*C-2 donde x="+x+" es " +y);
	}

}
