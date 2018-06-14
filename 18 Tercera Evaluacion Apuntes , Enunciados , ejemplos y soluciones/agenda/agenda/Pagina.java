package agenda;

import java.util.LinkedList;

public class Pagina  {
	private LinkedList<Tarjeta> listaTarjetas;
	private char caracter;

	public Pagina() {

		this.listaTarjetas = new LinkedList<Tarjeta>();
	}

	public LinkedList<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(LinkedList<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}

	@Override
	public String toString() {
		return "Pagina [listaTarjetas=" + listaTarjetas + ", letra " + caracter + "]";
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}


	
	
	
}
