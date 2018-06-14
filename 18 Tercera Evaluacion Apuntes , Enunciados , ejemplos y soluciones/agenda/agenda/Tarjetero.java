package agenda;

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

	public void visualizarPila() {//
		for (int i = 0; i < pilaTarjetas.size(); i++) {
			System.out.println(pilaTarjetas.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

	public Tarjeta sacarTarjetas() {//en caso de querer recorrer la pila sera mejor muentras no este vacia isEmpty o foreach size==o
		return pilaTarjetas.pop();
	}
	
	
	
	

	
}
