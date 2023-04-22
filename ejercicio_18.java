package Ejercicios_Practica;

import java.util.Scanner;

public class Leer_tres_cifras_e_imprimir_orden_invertido {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		int valores;
		int primero;
		int segundo;
		int tercero;

        System.out.print("Ingrese un número de tres cifras: ");
        valores = tc.nextInt();

        // Se obtienen las cifras del número de tres cifras
        primero = valores / 100;
        segundo = (valores % 100) / 10;
        tercero = valores % 10;

        // Se imprime el número en orden invertido
        System.out.println("El número invertido es: " + tercero + segundo + primero);

	}

}
