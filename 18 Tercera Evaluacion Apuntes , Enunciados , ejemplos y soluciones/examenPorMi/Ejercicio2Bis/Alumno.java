package Ejercicio2Bis;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Alumno {
private String nombre;
private int nota;


public Alumno(String nombre) {
	this.nombre = nombre;
	this.nota= ((int)(Math.random()*10+1));
}

public Alumno() {
	// TODO Auto-generated constructor stub
}

/*public Alumno(String nombre) {
	
	this.nombre = nombre;
	nota=9;
}*/
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getNota() {
	return nota;
}
public void setNota(int nota) {
	this.nota = nota;
}

public void escribirRegistro(DataOutputStream dos) throws IOException {
	dos.writeUTF(nombre);
	dos.writeInt(nota);
}
public void leerRegistro(DataInputStream dis) throws IOException {
	nombre=dis.readUTF();
	nota=dis.readInt();
	System.out.println("leido");
}

@Override
public String toString() {
	return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
}
	
}
