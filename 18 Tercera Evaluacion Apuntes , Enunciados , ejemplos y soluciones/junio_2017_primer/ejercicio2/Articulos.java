package ejercicio2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Articulos implements Modificar, Comparable<Articulos>, Serializable{
	
	private static int codArt;
	private int codigo, unidades;
	private String denominacion;
	private double precio;
	
	public Articulos(String denominacion, double precio){
		codArt++;
		codigo=codArt;
		this.denominacion=denominacion;
		this.precio=precio;
		unidades=10;
	}

	public static int getCodArt() {
		return codArt;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public double getPrecio() {
		return precio;
	}

	public int getUnidades() {
		return unidades;
	}

	@Override
	public String toString() {
		return "Articulos [codigo=" + codigo + ", unidades=" + unidades
				+ ", denominacion=" + denominacion + ", precio=" + precio + "]";
	}

	@Override
	public void modifica(double valor) {
		unidades-=(int)valor;
	}

	@Override
	public int compareTo(Articulos a1) {
		return this.codigo-a1.getCodigo();
	}
	
	private void writeObject(ObjectOutputStream out)throws IOException{
		out.defaultWriteObject();
		out.writeInt(codArt);
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		in.defaultReadObject();
		codArt=in.readInt();
	}

}
