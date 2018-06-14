package e2RepasoCol;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo {
	
	static Scanner in = new Scanner(System.in);
	private String matricula;
	private String estado;
	private ArrayList<Averia> averiasVehiculo;
	public Vehiculo() {
		super();
		System.out.println("Introduce matricula");
		this.matricula = in.next();
		this.estado = "En espera";
		this.averiasVehiculo = null;
	}
	
	
	public Vehiculo(String matricula,String estado) {
		super();
		this.matricula = matricula;
	    this.estado = estado;
		this.averiasVehiculo = averiasVehiculo;
	}


	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public ArrayList<Averia> getAveriasVehiculo() {
		return averiasVehiculo;
	}
	public void setAveriasVehiculo(ArrayList<Averia> averiasVehiculo) {
		this.averiasVehiculo = averiasVehiculo;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", estado=" + estado + ", averiasVehiculo=" + averiasVehiculo + "]";
	}

	public int costeReparacion() {
		return 0;
		//alculará el coste total de la reparación según las averías del vehículo.
	}
	
}
