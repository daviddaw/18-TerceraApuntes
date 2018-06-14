package e2RepasoCol;

import java.util.Scanner;

public class Mecanico {
	static Scanner in = new Scanner(System.in);
	static int autonumerico;
	private int codMecanico;
	private String nombre;
	private double sueldo;
	private boolean libre;
	private Vehiculo vehiculoReparacion;
/*	public Mecanicos(int codigoMecanico, String nombre, double sueldo, boolean libre, /*Vehiculo vehiculoReparacion) {
	super();
	autonumerico++;
	this.codMecanico = autonumerico;
	this.nombre = nombre;
	this.sueldo = sueldo;
	this.libre = libre;
	this.vehiculoReparacion = null;
}*/

	public Mecanico(boolean libre) {
		super();
		autonumerico++;
		this.codMecanico = autonumerico;
		System.out.println("Nombre del mecanico");
		this.nombre = in.next();
		System.out.println("Sueldo del mecanico");
		this.sueldo = in.nextDouble();
		this.libre = libre;
		this.vehiculoReparacion = null;
	}


	
	public Mecanico() {
		super();
		autonumerico++;
		this.codMecanico = autonumerico;
		System.out.println("Nombre del mecanico");
		this.nombre = in.next();
		System.out.println("Sueldo del mecanico");
		this.sueldo = in.nextDouble();
		this.libre = true;
		this.vehiculoReparacion = null;
	}
	
	
	
	
	
	public Mecanico( String nombre, double sueldo/*, Vehiculo vehiculoReparacion*/) {
		super();
		autonumerico++;
		this.codMecanico = autonumerico;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.libre = true;
		this.vehiculoReparacion = null;
	}



	public int getCodMecanico() {
		this.vehiculoReparacion = vehiculoReparacion;
		return codMecanico;}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public boolean isLibre() {
		return libre;
	}
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	public Vehiculo getVehiculoReparacion() {
		return vehiculoReparacion;
	}
	public void setVehiculoReparacion(Vehiculo vehiculoReparacion) {
		this.vehiculoReparacion = vehiculoReparacion;
		

	}
		
	
	
	@Override
	public String toString() {
		return "Mecanicos [codMecanico=" + codMecanico + ", nombre=" + nombre + ", sueldo=" + sueldo + ", libre="
				+ libre + ", vehiculoReparacion=" + vehiculoReparacion + "]";
	}
	
	

}
