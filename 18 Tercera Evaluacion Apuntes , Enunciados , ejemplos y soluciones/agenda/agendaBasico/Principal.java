package agendaBasico;

import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Tarjetero tarjetero = new Tarjetero();

int opcion;
do {
	do {
		System.out.println("Elige una opción:" + "\n	1. Crear tarjetero" + "\n	2. Crear agenda" + "\n	3. Crear tarjetero" + "\n	4. Ordenar cada pagina dela agenda por nombre y mostrar." + "\n	3. Atras.");
		opcion = in.nextInt();
	} while (opcion < 1 || opcion > 3);
	
	switch (opcion) {
	case 1:
		
		for (int i = 0; i < 10; i++) {
			Tarjeta tarjeta = new Tarjeta();
			System.out.println(tarjeta.toString());			
		}

		break;
	case 2:
		  Agenda agenda = new Agenda();
		  Tarjeta tarjetaExtraida = tarjetero.extraerTarjetas();
		  System.out.println(tarjetaExtraida);
		break;
		
	default:
		break;
	}
	
} while (opcion != 3);//




	}

}
