package ejercicio3bis;

import java.util.ArrayList;

public class Programadores extends Personal{
	double sueldo;
	
	public Programadores(String nombre,Cliente cliente,String registroPersonal ,ArrayList<Proyecto> asignados) {
		super(nombre, cliente);
		this.sueldo = Math.random()*3000+1000;
	}
	
	public Programadores(String nombre,Cliente cliente) {
		super(nombre, cliente);
		this.sueldo = Math.random()*3000+1000;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public double calcularSueldo() {
		this.sueldo=getSueldoBase();
		return sueldo;
	}

	@Override
	public String toString() {
		return "Programadores [sueldo=" + sueldo + ", numPersonal=" + numPersonal + ", nombre=" + nombre + ", cliente="
				+ cliente + ", registroPersonal=" + registroPersonal + ", sueldoBase=" + sueldoBase
				+ ", proyectosAsignados=" + proyectosAsignados + "]";
	}

	@Override
	public String generarRegistro() {
		String nombreCliente=getCliente().getNombre();
		
		registroPersonal="PROG"+numPersonal+nombreCliente.substring(0,4);
		System.out.println(registroPersonal);
		setRegistroPersonal(registroPersonal);
		return registroPersonal;
		
	}



}
