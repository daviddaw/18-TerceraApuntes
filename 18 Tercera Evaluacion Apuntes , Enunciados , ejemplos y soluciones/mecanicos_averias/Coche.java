

public class Coche extends Vehiculo {
	
	private int numeroPlazas;

	public Coche(String matricula) {
		super(matricula);
		System.out.println("Inserta el numero de plazas");
		numeroPlazas=in.nextInt();
	}
	
	public Coche(String matricula,int numeroPlazas) {
		super(matricula);
		this.numeroPlazas = numeroPlazas;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		return "Coche [numeroPlazas=" + numeroPlazas + ", getMatricula()=" + getMatricula() + ", getEstado()="
				+ getEstado() + ", getListaAverias()=" + getListaAverias() + ", costeReparacion()=" + costeReparacion()
				+ "]";//falla
	}

	
	
	

}
