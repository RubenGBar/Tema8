package boletin1.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	
	public static int readInt(Scanner sc) {
		int numero = 0;
		
		try {
			
			numero = sc.nextInt();
			
		} catch (InputMismatchException e) {
			
			numero = 0;
			System.err.println("El valor introducido no es de tipo entero");
			
		}
		
		return numero;
	}
	
	public static double readDouble(Scanner sc) {
		double numero = 0;
		
		try {
			
			numero = sc.nextDouble();
			
		} catch (InputMismatchException e) {
			
			numero = 0;
			System.err.println("El valor introducido no es de tipo decimal");
			
		}
		
		return numero;
	}
	
}
