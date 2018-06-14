package ejercicio3bis;

import java.util.ArrayList;

public class Responsables extends Personal {
	double sueldo;
int productividad;

/*public Responsables(String nombre,Cliente cliente,String registroPersonal,double sueldo,ArrayList<Proyecto> proyecto) {
	super(nombre, cliente, registroPersonal, sueldo, null);//porque
	this.productividad = (int)Math.random()*3000+1000;
}*/

public Responsables(String nombre, Cliente cliente) {
	super(nombre, cliente);
	this.sueldo = Math.random()*3000+1000;
}

public int getProductividad() {
	return productividad;
}

public void setProductividad(int productividad) {
	this.productividad = productividad;
}



@Override
public String toString() {
	return "Responsables [sueldo=" + sueldo + ", productividad=" + productividad + ", numPersonal=" + numPersonal
			+ ", nombre=" + nombre + ", cliente=" + cliente + ", registroPersonal=" + registroPersonal + ", sueldoBase="
			+ sueldoBase + ", proyectosAsignados=" + proyectosAsignados + "]";
}

@Override
public double calcularSueldo() {
	this.sueldo=getSueldoBase()+productividad;
	return sueldo;
}

@Override
public String generarRegistro() {
	String nombreCliente=getCliente().getNombre();
	registroPersonal="RESP"+numPersonal+nombreCliente.substring(0,4);
	System.out.println(registroPersonal);
	setRegistroPersonal(registroPersonal);
	return registroPersonal;

}

}
