package ejercicio3bis;

import java.util.ArrayList;

public abstract class Personal {
	static int  autonumerico;
	int numPersonal;
	String nombre;
	Cliente cliente;
	String registroPersonal;
	double sueldoBase;
	ArrayList<Proyecto> proyectosAsignados;
	
	
	
	
	public Personal(String nombre,Cliente cliente) {//mis datos
		autonumerico++;
		this.numPersonal = autonumerico;//no
		this.nombre = nombre;///si
		this.cliente = cliente;///si
		this.registroPersonal = generarRegistro();//
		this.sueldoBase = 3000.0;//no
		this.proyectosAsignados = new ArrayList<Proyecto>();//si
	}
	

	public abstract String generarRegistro();
	public abstract double calcularSueldo();
	
	
	
/*	public Personal( Cliente cliente, double sueldoBase,
			ArrayList<Proyecto> proyectosAsignados) {	
		this.numPersonal = autonumerico;
		this.nombre = nombre;
		this.cliente = cliente;
		this.registroPersonal = registroPersonal;
		this.sueldoBase = sueldoBase;
		this.proyectosAsignados = proyectosAsignados;
	}
*/




	public int getNumPersonal() {
		return numPersonal;
	}
	public void setNumPersonal(int numPersonal) {
		this.numPersonal = numPersonal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getRegistroPersonal() {
		return registroPersonal;
		
	}
	public void setRegistroPersonal(String registroPersonal) {
		this.registroPersonal = registroPersonal;
	
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public ArrayList<Proyecto> getProyectosAsignados() {
		return proyectosAsignados;
	}
	public void setProyectosAsignados(ArrayList<Proyecto> proyectosAsignados) {
		this.proyectosAsignados = proyectosAsignados;
	}

	
	@Override
	public String toString() {
		return "Personal [numPersonal=" + numPersonal + ", nombre=" + nombre + ", cliente=" + cliente
				+ ", registroPersonal=" + registroPersonal + ", sueldoBase=" + sueldoBase + ", proyectosAsignados="
				+ proyectosAsignados + "]";
	}

	

	
}
