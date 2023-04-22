package Ejercicios_Practica;
import java.util.Scanner;

public class Convertir_Kilos_a_Lbr {

	public static void main(String[] args) {
		
		// Calculo para convertir Kilos a Libras//
		
		Scanner tc= new Scanner (System.in);
		
		double kg;
		double lb=2.20462;
		double formula;
		
		System.out.println("Ingresa el valor para convertir kg a lb");
		kg= tc.nextInt();
		
		//Realizamos la Operacion de Conversion//
		
		formula=kg*lb;

		System.out.println("El valor de "+kg+" kg convertido en libras es "+formula);
	}

}
