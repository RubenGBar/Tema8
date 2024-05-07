package boletin1.ejercicio1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner leerEntero = new Scanner(System.in);
		Scanner leerDecimal = new Scanner(System.in);
		int entero = 0;
		double decimal = 0;
		
		System.out.println("Introduzca un número entero");
		entero = Utils.readInt(leerEntero);
		
		System.out.println("Introduzca un número decimal");
		decimal = Utils.readDouble(leerDecimal);
		
		System.out.println("Valor entero: " + entero + "\nValor decimal: " + decimal);
		
	}
}
