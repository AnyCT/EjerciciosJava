package Ejercicios_Practica;
import java.util.Scanner;
public class Valor_Fuerza {

	public static void main(String[] args) {
		// Calculo para convertir Kilos a Libras//
		
				Scanner tc= new Scanner (System.in);
				
				double fuerza;
				double masa;
				double aceleracion;
				
				System.out.println("Ingresa el valor de Masa");
				masa= tc.nextInt();
				
				System.out.println("Ingresa el valor de Aceleracion");
				aceleracion= tc.nextInt();
				
				//Realizamos la Operacion de Conversion//
				
				fuerza=masa*aceleracion;

				System.out.println("El valor de Fuerza es el resultado de la multiplicacion de la formula f=m*a :"+fuerza);

	}

}
