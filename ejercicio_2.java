package Ejercicios_Practica;

import java.util.Scanner;

public class Perimetro_Circunferencia {

	public static void main (String[] args) {
		//Determinar el Perímetro de una circunferencia y el área de un círculo//
			//formula p=2*pi*r
			
			Scanner tc= new Scanner(System.in);
			
			double perimetro,radio;
			double x=2;
			double pi=3.1415;
			double area;
			
		
			
		    System.out.println("Ingrese el valor del radio de la circunferencia");
			radio=tc.nextInt();
			
			//Operacion

			 area=pi*Math.pow(radio, x);
			 
			 perimetro=x*pi*radio;
			 
			 
			 System.out.println("El valor del Perimetro de una circunferencia es: "+perimetro+" y el area de la circunferencia con radio r es "+area);
		
		
		 
		
	
}
}
