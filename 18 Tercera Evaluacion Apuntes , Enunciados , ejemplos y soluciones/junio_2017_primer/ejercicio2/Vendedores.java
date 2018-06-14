package ejercicio2;

import java.io.Serializable;

public class Vendedores implements Modificar, Serializable{
	
	private String nombre, departamento, clave;
	private double ventas;

	public Vendedores(String nombre, String departamento){
		this.nombre=nombre;
		this.departamento=departamento;
		if(departamento.length()<=3)
			clave=(departamento+nombre).toUpperCase();
		else
			clave=(departamento.substring(0, 3)+nombre).toUpperCase();
		ventas=0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getClave() {
		return clave;
	}

	public double getVentas() {
		return ventas;
	}

	@Override
	public String toString() {
		return "Vendedores [nombre=" + nombre + ", departamento="
				+ departamento + ", clave=" + clave + ", ventas=" + ventas
				+ "]";
	}

	@Override
	public void modifica(double valor) {
		ventas+=valor;
	}
}
