package Ejercicios_Practica;
import java.util.Scanner;

public class Calcular_yardas_pies_pungadas_a_centímetros {

	public static void main(String[] args) {
		// Calcular_yardas_pies_pungadas a centímetros//
		
		Scanner tc= new Scanner(System.in);

		int numero;
        Double yarda=91.44;
		Double pie=30.48;
		Double pulgada=2.54;
		Double formula_calculo_yarda;
		Double formula_calculo_pie;
		Double formula_calculo_pulgada;
		
		
		System.out.println("Ingresa un valor a convertir");
		numero=tc.nextInt();
		
		//Primera Formula
		
		formula_calculo_yarda=numero*yarda;
		
		System.out.println("La conversion de "+numero+ " yardas a centimetro es :" +formula_calculo_yarda);
		 
		//Segunda Formula
		formula_calculo_pie=numero*pie;
				
		System.out.println("La conversion de "+numero+ " pie a centimetro es :" +formula_calculo_pie);
		
		//Tercera Formula
		
		formula_calculo_pulgada=numero*pulgada;
				
		System.out.println("La conversion de "+numero+ " pulgadas a centimetro es :" +formula_calculo_pulgada);
		

	}

}
