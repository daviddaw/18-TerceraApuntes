package Ejercicio2Iterator;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		ArrayAsignatura array1 =new ArrayAsignatura();
		Iterator<Asignatura> it = array1.iterator();
		
		while(it.hasNext()) {
			Asignatura asignatura = (Asignatura) it.next();
			System.out.println(asignatura.toString());
		}
		

	}

}
