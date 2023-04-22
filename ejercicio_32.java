package Ejercicios_Practica;

import java.util.Scanner;

public class Ejercicio_32 {

	public static void main(String[] args) {
		/* Las calificaciones de los alumnos en un instituto son consideradas de la siguiente forma:
		a) A es 90 o más.
	    b) B es al menos 80 pero menos de 90.
	    c) C es al menos 70 pero menos de 80.
	    d) D es al menos 65 pero menos de 70.
	    e) E es menos de 65.
	    Escriba un programa que considere la entrada de nota en número e imprima su 
	    codificación en letra*/
		
        Scanner tc = new Scanner(System.in);
        System.out.print("Ingrese la nota del alumno: ");
        int nota = tc.nextInt();

        char codificacion;
        
        if (nota >= 90) {
            codificacion = 'A';
        } else if (nota >= 80) {
            codificacion = 'B';
        } else if (nota >= 70) {
            codificacion = 'C';
        } else if (nota >= 65) {
            codificacion = 'D';
        } else {
            codificacion = 'E';
        }

        System.out.println("La nota " + nota + " equivale a la codificación " + codificacion);
    }

	}


