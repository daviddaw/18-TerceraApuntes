package e3Solucion;

import java.io.*;
import java.util.*;

public class Personal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	static private int contador = 0;
	protected int numPersonal; 	
	protected String nombre;	
	protected Cliente cliente;	
	protected String registroPersonal;	
	protected double sueldo;	
	protected ArrayList<Proyecto> proyectosAsignados;
	protected Proyecto[] arrayProyectos; //para los que tienen que hacer la 2ª evaluación
	//para trabajar con arrayProyectos, convendría saber cuántos proyectos tiene asignado realmente el Personal
	protected int numeroProyAsig;
	//añadimos un campo para saber si ya tiene un proyecto de prioridad alta
	
	protected boolean proyPriorAlta;
	
	
	// Constructor
	public Personal(String nombre, Cliente cliente, double sueldoBase) {
		contador++;
		this.numPersonal = contador;
		this.nombre = nombre;
		this.cliente = cliente;	
		this.sueldo=sueldoBase;
		this.proyectosAsignados = new ArrayList<Proyecto>();
		this.proyPriorAlta=false;
		this.arrayProyectos=new Proyecto[5];
		this.numeroProyAsig=0; //con esto llevamos el control de si se ha llenado o no el array
		
	}

	public int getNumPersonal() {
		return numPersonal;
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

	public double getSueldoBase() {
		return sueldo;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldo = sueldoBase;
	}
	

	public ArrayList<Proyecto> getProyectosAsignados() {
		return proyectosAsignados;
	}

	public void setProyectosAsignados(ArrayList<Proyecto> proyectosAsignados) {
		this.proyectosAsignados = proyectosAsignados;
	}

	
	// toString
	@Override
	public String toString() {
		return "Personal [numPersonal=" + numPersonal + ", nombre=" + nombre + ", cliente=" + cliente.getNombreCliente()
				+ ", registroPersonal=" + registroPersonal + ", sueldoBase=" + sueldo + ", proyectosAsignados="
				+ proyectosAsignados.toString() + "]"; // Igual hay que cambiar el tostring del arraylist
	}

	// PARA SERIALIZAR:
	private void writeObject(ObjectOutputStream out){
		try {
			out.defaultWriteObject();
			out.writeInt(contador);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void readObject(ObjectInputStream in){
		try {
			in.defaultReadObject();
			contador=in.readInt();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
