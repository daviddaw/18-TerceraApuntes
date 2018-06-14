

public class Motocicleta extends Vehiculo {
	private int cilindrada;
	
	public Motocicleta(String matricula) {
		super(matricula);
		System.out.println("Inserta la cilindrada");
		this.cilindrada=in.nextInt();
	}
	
	public Motocicleta(String matricula,int cilindrada) {
		super(matricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	
	public int costeReparacionMoto() {
		int coste=0;
		//el hijo puede ver los metodos publicos del padre??
		coste=(int) (costeReparacion()*(0.1));
		
		return coste;
		
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", getMatricula()=" + getMatricula() + ", getEstado()="
				+ getEstado() + ", getListaAverias()=" + getListaAverias() + ", costeReparacion()=" + costeReparacion()
				+ "]";
	}

	


	
	

}
