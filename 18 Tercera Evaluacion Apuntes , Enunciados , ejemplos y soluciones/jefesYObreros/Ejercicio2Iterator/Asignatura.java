package Ejercicio2Iterator;

import java.util.Iterator;

public class Asignatura {
	static int autonumerico;
	private int codigo;
	private int horas;
	private String asignatura;
	
	
	public Asignatura() {
		autonumerico++;
		this.codigo = autonumerico;
		this.horas =(int)Math.random()*9+1;
		this.asignatura = "asignatura"+autonumerico;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}


	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", horas=" + horas + ", asignatura=" + asignatura + "]";
	}
	
	
}
