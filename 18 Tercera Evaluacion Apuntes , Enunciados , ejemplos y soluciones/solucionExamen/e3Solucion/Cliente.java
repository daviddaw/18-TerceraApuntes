package e3Solucion;

import java.io.*;

public class Cliente implements Comparable<Cliente>, Serializable{

	private static final long serialVersionUID = 1L;

	private String nombreCliente;	
	private String dirCliente;	
	private double presupuesto;
	
	
	// Constructor
	public Cliente(String nombreCliente, String dirCliente, double presupuesto) {
		this.nombreCliente = nombreCliente;
		this.dirCliente = dirCliente;
		this.presupuesto = presupuesto;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Cliente [nombreCliente=" + nombreCliente + ", dirCliente=" + dirCliente + ", presupuesto=" + presupuesto
				+ "]";
	}
	
	public int compareTo (Cliente cliente) {
	 double pres=this.presupuesto-cliente.presupuesto;
	 if (pres!=0)
		 return (int)pres;
	 else
		 return this.nombreCliente.compareToIgnoreCase(cliente.nombreCliente);
		
	}
	
	
	
	
}
