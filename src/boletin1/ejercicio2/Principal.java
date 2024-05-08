package boletin1.ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Hora h = new Hora(12, 33, 50);
		
		try {
			h.setHora(-2);
		} catch (NegativeHourException e) {
			System.err.println(e);
		}
		
		try {
			h.setMinutos(-4);
		} catch (NegativeMinuteException e) {
			System.err.println(e);
		}
		
		try {
			h.setSegundo(-8);
		} catch (NegativeSecondException e) {
			System.err.println(e);
		}
	}
}
