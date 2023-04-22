import java.util.Scanner;

public class Sistematico_Any {


	public static void main(String[] args) {
		// adivinar n numeros sin son pares e impares

    Scanner tc = new Scanner(System.in);
    
    int n;
   	
		 System.out.println("Ingrese el numero para verificar si es Par o Impar");
		    n = tc.nextInt();		    
		
		    if (n % 2 == 0) {
	            System.out.println("Sí es par");
	        } else {
	            System.out.println("No es par");
	
	}

	}

}	
