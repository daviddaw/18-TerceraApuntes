package e3_1ExamenCol;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Personal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int autonumerico;
	protected int numPersonal;
	protected String nombre;
	protected Cliente cliente;
	protected String registroPersonal;
	protected double sueldoBase;
	protected ArrayList<Proyecto> proyectosAsignados;
	
	
	public Personal( String nombre, Cliente cliente) {
		autonumerico++;
		this.numPersonal = autonumerico;
		this.nombre = nombre;
		this.cliente = cliente;
		//this.registroPersonal = generarRegistroPersonal();
		this.sueldoBase = 2000;
		this.proyectosAsignados = new ArrayList<Proyecto>();
	}

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

	//public abstract String generarRegistroPersonal();

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

	//public abstract double calcularSueldo();
	


	@Override
	public String toString() {
		return "Personal [numPersonal=" + numPersonal + ", nombre=" + nombre + ", cliente=" + cliente
				+ ", registroPersonal=" + registroPersonal + ", sueldoBase=" + sueldoBase + ", proyectosAsignados="
				+ proyectosAsignados + "]";
	}



	public boolean buscarProyectoPrioridadAlta() {
		boolean prioridadAlta = false;
		for (int i = 0; i < proyectosAsignados.size() && prioridadAlta==false; i++) {
			
			if (proyectosAsignados.get(i).isPrioridadAlta() ) {
				prioridadAlta=true;
			}			
								
		}
		return prioridadAlta;
		
	}

	public void recorrerProyectosProgramadores() {
		for (int i = 0; i < proyectosAsignados.size(); i++) {
			System.out.println(proyectosAsignados.get(i).getNombreProyecto());

				
								
		}
	}
	
	

	private void writeObject(ObjectOutputStream out){
		try {
			out.defaultWriteObject();
			out.writeInt(autonumerico);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void readObject(ObjectInputStream in){
		try {
			in.defaultReadObject();
			autonumerico=in.readInt();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
	
	

