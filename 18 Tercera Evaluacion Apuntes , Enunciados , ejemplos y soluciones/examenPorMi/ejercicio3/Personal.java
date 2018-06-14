package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Personal {
	
	static Scanner in =new Scanner(System.in);

	static int cont;
	protected int numPesonal;
	protected String nombre;
	protected Cliente cliente;
	protected double sueldoBase;
	protected ArrayList<Proyecto> proyectosAsignados;
	
	
	public Personal() {
	
	cont++;
		this.numPesonal = cont;
		this.nombre = in.nextLine();
		this.cliente = null;
		this.sueldoBase = Math.random()+1000*5000;
		this.proyectosAsignados = new ArrayList<Proyecto>();
		
		
		
	}

	public int getNumPesonal() {
		return numPesonal;
	}

	public void setNumPesonal(int numPesonal) {
		this.numPesonal = numPesonal;
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

	public ArrayList<Proyecto> getProyectosAsignados() {
		return proyectosAsignados;
	}

	public void setProyectosAsignados(ArrayList<Proyecto> proyectosAsignados) {
		this.proyectosAsignados = proyectosAsignados;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	private Cliente rellenarCliente() {
		
		String nombreCliente,direccionCliente;
		double presupuesto;
		System.out.println("nombre ddel cliente");
		nombreCliente=in.next();
		System.out.println("Direccion Cliente");
		direccionCliente=in.next();
		System.out.println("presupuesto");
		presupuesto=in.nextDouble();
		
		return new Cliente(nombreCliente, direccionCliente, presupuesto);
	}
	

public abstract int sueldo();




	
	
}
