package boletin1.ejercicio2;

public class Hora {
	
	private int hora = 0;
	private int minuto = 0;
	private int segundo = 0;
	
	public Hora(int hora, int minuto, int segundo) {
		super();
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} 
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		} 
	}

	public boolean setMinutos(int minutos) throws NegativeMinuteException{
		boolean valido = false;

		if (minutos >= 0 && minutos <= 59) {
			this.minuto = minutos;
			valido = true;
		} else {
			valido = false;
			throw new NegativeMinuteException();
		}

		return valido;
	}

	public boolean setHora(int hora) throws NegativeHourException{
		boolean valido = false;

		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			valido = true;
		} else {
			valido = false;
			throw new NegativeHourException();
		}

		return valido;
	}
	
	public boolean setSegundo (int segundo) throws NegativeSecondException{
		boolean valido = false;
		
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
			valido = true;
		} else {
			valido = false;
			throw new NegativeSecondException();
		}
		
		return valido;
	}
	
	public void inc() {

		if (segundo == 59) {
			this.segundo = 0;

			if (minuto == 59) {
				this.minuto = 0;

				if (hora == 23) {
					this.hora = 0;
				}

			} else {
				this.minuto++;
			}

		} else {
			this.segundo++;
		}

	}

	@Override
	public String toString() {
		String cadena = "";

		if (hora < 10) {
			cadena += "0";
		}
		
		cadena += this.hora + ":";
		
		if (minuto < 10) {
			cadena += "0";
		}
		
		cadena += this.minuto;
		
		cadena += ":";
		
		if (segundo < 10) {
			cadena += "0";
		}
		
		cadena += this.segundo;

		return cadena;
	}
}
