package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Tienda tienda=new Tienda();
		Scanner sc=new Scanner(System.in);
		int opcion;

		tienda.deserializarListaArticulos();
		tienda.deserializarListaVendedores();

		do{
			do{
				System.out.println("Elige una opción:"+
						"\n	1. Alta de artículo."+
						"\n	2. Alta de vendedor."+
						"\n	3. Alta de ventas."+
						"\n	4. Actualización de ventas."+
						"\n	5. Grabar la colaVentas en un fichero."+
						"\n	6. Leer el fichero."+
						"\n	7. Ordenar artículos por código."+
						"\n	8. Ordenar artículos por número de unidades."+
						"\n	9. Listar discos con unidades a 0."+
						"\n	10. Listar artículos."+
						"\n	11. Listar vendedores."+
						"\n	12. Listar ventas."+
						"\n	13. Fin de programa.");
				opcion=sc.nextInt();
			}while(opcion<1 || opcion>14);
			switch (opcion) {
			case 1:
				tienda.altaArticulo(sc);
				break;
			case 2:
				tienda.altaVendedor(sc);
				break;
			case 3:
				tienda.altaVentas(sc);
				break;
			case 4:
				tienda.actualizacionVentas();
				break;
			case 5:
				tienda.grabarColaVentas();
				break;
			case 6:
				tienda.leerFichero();
				break;
			case 7:
				tienda.ordenarCodigo();
				break;
			case 8:
				tienda.ordenarUnidades();
				break;
			case 9:
				tienda.listarCeros();
				break;
			case 10:
				tienda.listarArticulos();
				break;
			case 11:
				tienda.listarVendedores();
				break;
			case 12:
				tienda.listarVentas();
				break;
			default:
				break;
			}
		}while(opcion!=13);
		
		
		
		tienda.serializarListaArticulos();
		tienda.serializarListaVendedores();
		
		sc.close();
	}

}
