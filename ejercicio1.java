package Ejercicios_Practica;

import java.util.Scanner;

public class Area_Rectangulo {

	public static void main(String[] args) {
		// Determinar el área de un rectángulo que tiene por base “B” y por altura “H”, imprima la base, la altura y su área// 
		
		Scanner tc= new Scanner(System.in);
		
		int A,b,h;
				
				System.out.println("Ingrese el valor de la Base  del rectàngulo");
				b=tc.nextInt();
				
				System.out.println("Ingrese el valor de la Altura del rectàngulo");
			    h=tc.nextInt();
			   
			   //Operacion de Càlculo de Area
			    
			    A=b*h;
			    		
			    System.out.println("El Valor del Area del Rectàngulo es  :  "+A);

	
