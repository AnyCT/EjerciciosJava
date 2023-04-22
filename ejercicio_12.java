package Ejercicios_Practica;
import java.util.Scanner;

public class Promedio_Notas {

	public static void main(String[] args) {
     Scanner tc = new Scanner(System.in);
     
     int n;
     double suma=0;
        
        System.out.print("Ingrese la cantidad de notas a promediar: ");
        n = tc.nextInt();
        
       
        for (int i= 1; i <= n; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = tc.nextDouble();
            
            suma+= nota;
        }
        
        double promedio = suma / n;
        
        System.out.println("El promedio de las " + n + " notas es: " + promedio);
        
        tc.close();
    }


	
}
