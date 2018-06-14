package agenda;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Tarjetero tarjetero = new Tarjetero();
		Agenda agenda = new Agenda();
		Tarjeta t1 = new Tarjeta("Alvarez");
		Tarjeta t2 = new Tarjeta("Gomez");
		Tarjeta t3 = new Tarjeta("Perez");
		Tarjeta t4 = new Tarjeta("Rodrigez");
		Tarjeta t5 = new Tarjeta("Alamo");
		Tarjeta t6 =new Tarjeta("Alcala");
		Tarjeta t7 = new Tarjeta("Gurrul");
		
		tarjetero.pilaTarjetas.push(t1);
		tarjetero.pilaTarjetas.push(t2);
		tarjetero.pilaTarjetas.push(t3);
		tarjetero.pilaTarjetas.push(t4);
		tarjetero.pilaTarjetas.push(t5);
		tarjetero.pilaTarjetas.push(t6);
		tarjetero.pilaTarjetas.push(t7);
		
		int opcion;
		
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. ver pila." + "\n	2. meter tarjetas." + "\n	3. ." + "\n	4. ." + "\n	5. ."
						+ "\n	6. .");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 6);
			
			switch (opcion) {
			case 1:
				tarjetero.visualizarPila();
				System.out.println("********");
				
				//agenda.
				
				break;
			case 2:
				//objeto.metodo(in);
				int tamanno=tarjetero.pilaTarjetas.size();
				for (int i = 0; i < tamanno; i++) {//no me convence poner un for aqui
					Tarjeta tarjetaAux = tarjetero.sacarTarjetas();
					System.out.println(tarjetaAux);				
					agenda.meterTarjetas(tarjetaAux);
				}

				break;
			case 3:
				agenda.visualizarAgenda();
				break;
			case 4:
				Pagina[] arrayPaginas = agenda.getArrayPaginas();
				
				for (int i = 0; i < arrayPaginas.length; i++) {
					Collections.sort(arrayPaginas[i].getListaTarjetas());
				}
				
				
				agenda.visualizarAgenda();
				break;
			case 5:
				//Metodos
				break;
				
			}
		} while (opcion != 6);
		
		in.close();
	}
	
}
