package Ejercicios_Practica;

import java.util.Scanner;

public class Ejercicio_24_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner tc= new Scanner(System.in);
		
		double A;
		double Y;
		double formula;
		
		System.out.println("Ingrese el valor de A  sea positivo o negativo");
		A=tc.nextInt();
		
		if (A<=0)  {
			
	    //calcular
			
			Y=A+5;
			
		System.out.println("Segun el valor ingresado es un valor Negativo :" +A+ " aplica para el calculo Y=A+5 siendo su resultado "+Y);
		}
		
		else {
			
			formula=Math.pow(2,A);
			
			System.out.println("Segun el valor ingresado es un valor Positivo :" +A+ " aplica para el calculo Y=2^A siendo su resultado "+formula);
			
		}
		

		}
	

	}
