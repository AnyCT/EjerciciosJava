package Ejercicios_Practica;

import java.util.Scanner;

public class ejercicio_23_calificacion_alumno {

	public static void main(String[] args) {
		/*  Escribir un programa que lea la calificación de un alumno e imprima el mensaje de 
		aprobado si su calificación es mayor o igual a 60, en caso contrario imprima reprobado*/
		
      Scanner tc= new Scanner(System.in);
		
        int calificacion_alumno;
		int formula1;
		int formula2;
		
		System.out.println("Ingrese la calificacion del alumno");
		calificacion_alumno=tc.nextInt();
		
		if (calificacion_alumno>=60)  {
			
	    //calcular
			
			
		System.out.println("Valor de la Calificacion ," +calificacion_alumno+ " el alumno <<X>> està aprobado,FELICIDADES!!! ");
		}
		
		else  {
			
			System.out.println("Valor de la Calificacion , " +calificacion_alumno+" el alumno <<X>> està reprobado");	

		}
	

	}


	}

