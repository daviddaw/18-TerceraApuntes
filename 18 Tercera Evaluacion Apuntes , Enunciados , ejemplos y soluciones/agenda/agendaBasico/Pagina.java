package agendaBasico;

public class Pagina {
	private char caracter;

	public Pagina(char caracter) {
		this.caracter = caracter;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	@Override
	public String toString() {
		return "Pagina [caracter=" + caracter + "]";
	}
	
	

}
