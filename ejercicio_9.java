package Ejercicios_Practica;

import java.util.Scanner;

public class Calculo_Cilindro {

	public static void main(String[] args) {
		// Calculo del Cilindro conociendo su radio y su altura//
		
		Scanner tc= new Scanner(System.in);
		
		double volumen;
		double h;
		double pi=3.1416;
		double r;
		
		
		System.out.println("Ingresa el valor de la altura del cilindro");
		h=tc.nextInt();
		
		System.out.println("Ingresa el valor del radio del cilindro");
		r=tc.nextInt();

		//Se ingresa la formula de càlculo del Cilindro π r² h//
		
		volumen=pi*(Math.pow(r,2))*(h);
		
		System.out.println("El volumen del Cilindro es: "+volumen);

	}

}
