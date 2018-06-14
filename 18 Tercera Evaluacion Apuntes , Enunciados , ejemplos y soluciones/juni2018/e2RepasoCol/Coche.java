package e2RepasoCol;

import java.util.Scanner;

public class Coche extends Vehiculo {
	
	static Scanner in = new Scanner(System.in);
	private int numeroPlazas;

	
	public Coche() {
		super();
		do {
			System.out.println("Introduce el numero de plazas");
			this.numeroPlazas = in.nextInt();
		} while (numeroPlazas<0 ||numeroPlazas>5);
		
	}
	
	
	

	public Coche(String matricula,String estado,int numeroPlazas) {
		super(matricula, estado);		
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
				+ getEstado() + ", getAveriasVehiculo()=" + getAveriasVehiculo() + ", costeReparacion()="
				+ costeReparacion() + "]";
	}


	
	

}
