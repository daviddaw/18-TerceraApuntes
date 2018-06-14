package e3_1ExamenCol;

import java.io.Serializable;


public class Proyecto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreProyecto;
	private boolean prioridadAlta;
	
	public Proyecto(String nombreProyecto, boolean prioridadAlta) {
		super();
		this.nombreProyecto = nombreProyecto;
		this.prioridadAlta = prioridadAlta;
	}

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

	@Override
	public String toString() {
		return "Proyecto [nombreProyecto=" + nombreProyecto + ", prioridadAlta=" + prioridadAlta + "]";
	}
	
	

}
