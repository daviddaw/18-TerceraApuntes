package surtidorA;

public class Coche {
	private static int autonumerico; //private? 
	private String matricula;
	private String modelo;
	private String marca;
	public Coche() {
		autonumerico++;
		this.matricula = 1110+autonumerico+"AAA";
		this.modelo = "modelo"+autonumerico;
		this.marca = "marca"+autonumerico;
		
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + "]";
	}
	
	
		

}
