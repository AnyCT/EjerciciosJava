package Ejercicios_Practica;
import java.util.Scanner;
public class Raiz_Cuadrada {
	public static void main(String[] args) {
		//calcular la raiz cuadrada//
		
		Scanner tc= new Scanner(System.in);
		
		double numero,raiz;
		
		System.out.println("Ingrese el numero");
		numero=tc.nextInt();
		
		//operacion con numeros
		
		raiz=Math.sqrt(numero);
		
		System.out.print("La raiz cuadrada del numero " +numero+ " es: "+raiz);

		}

}
