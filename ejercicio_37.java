package Ejercicios_Practica;
import java.util.Scanner;
public class adivina {

	public static void main(String[] args) {
		/* ejercicio 37 Escriba un programa que tenga como entrada “n” números enteros y que calcule el 
		número de números pares e impares*/
		       
		       Scanner tc = new Scanner(System.in);
		       
		        System.out.print("Ingrese la cantidad de números a adivinar: ");
		        int n = tc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            System.out.print("Ingrese el número " + i + ": ");
		            int numero = tc.nextInt();

		            if (numero % 2 == 0) {
		                System.out.println("El número " + numero + " es par");
		            } else {
		                System.out.println("El número " + numero + " es impar");
		            }
		        }
	}

}
