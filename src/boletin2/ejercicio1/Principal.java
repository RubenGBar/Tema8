package boletin2.ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	
	public static void main(String[] args) {
		
		int suma = 0;
		int contador = 0;
		String[] elementos;
		String linea;
		
		try {
			
			BufferedReader sc = new BufferedReader(new FileReader("src\\boletin2\\ejercicio1\\NumerosReales.txt"));
			
			linea = sc.readLine();
			
			while((linea) != null) {
				
				elementos = linea.split(" ");
				
				for(int i = 0; i < elementos.length; i++) {
					
					suma += Integer.parseInt(elementos[i]);
					
					contador++;
					
				}
				
				linea = sc.readLine();
				
			}
			
			System.out.println("La media de los números en el documento NumerosReales.txt es: " + suma / contador);
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
