package Ejercicios_Practica;

import java.util.Scanner;

public class Evaluar_la_funcion_matematica {

	public static void main(String[] args) {
		//Calcular la funcion y=5x^4+2x^3+3x^2+7 siendo "x" un valor cualquiera//
		
		Scanner tc=new Scanner(System.in);
		
		double numero;
		double f;
		double primer_calculo;
		double segundo_calculo;
		double tercer_calculo;
		int cuarto_calculo=7;
		
		System.out.println("Ingresa el valor");
		numero=tc.nextInt();
	
		//primer grupo//
		
		primer_calculo=5*Math.pow(numero,4);		
		System.out.println("01) El resultado de la funciòn siendo el valor 5x^4 es :"+primer_calculo);
				
		//segundo grupo//
		segundo_calculo=2*Math.pow(numero,3);						
		System.out.println("02) El resultado de la funciòn siendo el valor 2x^3 es :"+segundo_calculo);
		
		//tercer grupo//
		tercer_calculo=3*Math.pow(numero,2);							
		System.out.println("03) El resultado de la funciòn siendo el valor 3x^2 es :"+tercer_calculo);
		
		//cuarto grupo//
				cuarto_calculo=cuarto_calculo;							
				System.out.println("04) El resultado de la funciòn siendo el valor 7 es :"+cuarto_calculo);
				
		//Calculo de datos//
				
		f = primer_calculo+segundo_calculo+tercer_calculo+cuarto_calculo;		
						
		System.out.println(" El resultado del calculo de la funcion  siendo el valor de y=5x^4+2x^3+3x^2+7 es: "+f);
		
	}
}
