package agendaBasico;

import java.util.Stack;

public class Tarjetero {
	Stack<Tarjeta> pilaTarjetas;
	

	public Tarjetero() {
		this.pilaTarjetas = new Stack<Tarjeta>();
	}


	public Stack<Tarjeta> getPilaTarjetas() {
		return pilaTarjetas;
	}


	public void setPilaTarjetas(Stack<Tarjeta> pilaTarjetas) {
		this.pilaTarjetas = pilaTarjetas;
	}


	@Override
	public String toString() {
		return "Tarjetero [pilaTarjetas=" + pilaTarjetas + "]";
	}


	public Tarjeta extraerTarjetas() {
		Tarjeta tarjeta = null;
		for (int i = 0; i < pilaTarjetas.size(); i++) {

			tarjeta = pilaTarjetas.pop();
			System.out.println(tarjeta.toString());
			
		}
		return tarjeta;
		
	
		
		
	}

}
