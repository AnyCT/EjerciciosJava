package Ejercicios_Practica;

import java.util.Scanner;

public class if_prestamo_interes {

	public static void main(String[] args) {
		/*Escribir un programa para calcular el interés de una capital conforme a la siguiente 
        condición. Si el capital prestado es mayor que 10,000 dólares entonces la tasa es del 7% en 
        caso contrario del 6%, debe imprimir el capital y su interés*/
		
         Scanner tc= new Scanner(System.in);
		
		double k;
		double i1=0.07;
		double i2=0.06;
		double formula1;
		double interes_c;
		double formula2;
		
		System.out.println("Ingrese el monto del Capital Solicitado");
		k=tc.nextInt();
		
		if (k>=10000)  {
			
	    //calcular
			
			interes_c=k*i1;
		
			System.out.println("El calculo del Interes es :"+interes_c);
			
			formula1=(k*i1)+k;
			
		System.out.println("Segun el valor ingresado siendo mayor-igual a 10k, aplica para el calculo del interes del 7% y su resultado es:"+formula1);
		}
		
		else  {
			
			formula2=k*i2;
			
			System.out.println("Segun el valor ingresado siendo menor que 10k, aplica para el calculo del interes del 6% y su resultado es:"+formula2);

	}

}
}
