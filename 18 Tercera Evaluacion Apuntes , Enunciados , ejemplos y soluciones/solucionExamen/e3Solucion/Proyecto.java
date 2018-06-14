package e3Solucion;

import java.io.*;

public class Proyecto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombreProyecto;
	
	private boolean prioridadAlta;
	
	// Constructor
	public Proyecto(String nombreProyecto, boolean prioridadAlta) {
		this.nombreProyecto = nombreProyecto;
		this.prioridadAlta = prioridadAlta;
	}

	
	// Getters & Setters
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public boolean isPrioridadAlta() {
		return prioridadAlta;
	}

	public void setPrioridadAlta(boolean prioridadAlta) {
		this.prioridadAlta = prioridadAlta;
	}

	
	// toString
	@Override
	public String toString() {
		return "Proyecto [nombreProyecto=" + nombreProyecto + ", prioridadAlta=" + prioridadAlta + "]";
	}
	

	
}
