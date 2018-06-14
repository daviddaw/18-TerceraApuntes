package e3_1ExamenCol;

import java.io.Serializable;

public class Cliente implements Comparable<Cliente>,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//encapsulado tipo nombre
	private String nombreCliente;
	private String direccionCliente;
	private double presupuesto;
	
	public Cliente(String nombreCliente, String direccionCliente, double presupuesto) {
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		this.presupuesto = presupuesto;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Cliente [nombreCliente=" + nombreCliente + ", direccionCliente=" + direccionCliente + ", presupuesto="
				+ presupuesto + "]";
	}

	


	@Override
	public int compareTo(Cliente c1) {
		if (this.presupuesto==c1.getPresupuesto()) {
			if (this.nombreCliente.compareTo(c1.nombreCliente)==0) 
				return 0;
			else if(this.nombreCliente.compareTo(c1.nombreCliente)==1)
				return 1;
			else 
				return -1;
						
		}else if ((this.presupuesto>c1.getPresupuesto()))
			return 1;
		else
			return -1;

	}	
}




