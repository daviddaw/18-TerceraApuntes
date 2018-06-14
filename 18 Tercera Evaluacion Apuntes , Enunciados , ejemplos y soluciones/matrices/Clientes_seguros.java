
public class Clientes_seguros {

	public static void main(String[] args) {
		// 7 clientes 5 seguros
		int clientes = 7, seguros = 5;
		String[] listaClientes = new String[clientes];
		String[] listaSeguros = { "VIDA", "HOGAR", "COCHE", "DESEMPLEO", "JUBILACIÓN" };
		int[][] matrizPrecio = new int[clientes][seguros];

		crearArray(listaClientes);
		
		int max = Integer.MIN_VALUE;
		int posCli = 0, posSeg = 0;
		for (int i = 0; i < clientes; i++) {
			for (int j = 0; j < seguros; j++) {
				matrizPrecio[i][j] = ((int) (Math.random() * 10));//de 0 a 10
//				matrizPrecio[0][0] = 0;
				System.out.print(matrizPrecio[i][j] + " ");//visualizar
				if (matrizPrecio[i][j] > max) {//recoge el maximo y  la posicion de cliente y seguro
					max = matrizPrecio[i][j];
					posSeg = j;
					posCli = i;
				}
			}
			System.out.println(" ");
		}
		System.out.println("El seguro mas caro cuesta " + max + "$");
		System.out.println(listaClientes[posCli] + " seguro de " + listaSeguros[posSeg]);

	}

	private static void crearArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = "Cliente " + (i + 1);
		}

	}

}
/*
 *

1. Una empresa de seguros tiene 7 clientes  numerados del 0 al 6 y 5 seguros distintos numerados del 0 al 4.
Para saber qué seguros tiene contratados cada cliente se dispone de una matriz, 
donde se almacena el precio de cada seguro para cada cliente (el precio del seguro no es igual para todos porque 
depende de las coberturas contratadas). Si un cliente no tiene contratado un seguro, dicha componente se rellena con 0.
 El nombre de los seguros se almacena en un array con los valores “VIDA”, “HOGAR”, “COCHE”,“DESEMPLEO”, “JUBILACIÓN”.

Se pide:
a. Rellenar y visualizar la matriz (puede ser de forma aleatoria pero hay que asegurarse 
de que aparezcan ciertas componentes a 0).
b. Obtener el cliente con el seguro más caro y el nombre del seguro.
 * 
 * 
 * 
 * 
 * 
 * package ejercicio1;

public class Matriz {

	public static void main(String[] args) {
		String[] clientes= new String [7];
		//Rellenamos el array de clientes
		for (int i = 0; i < clientes.length; i++) {
			clientes[i]="Cliente "+(i+1);
		} 
		//Definimos el array de seguros
		String [] seguros= {"Vida","Hogar","Coche","Desempleo","Jubilacion"};
		
		//Definimos la matriz
		int[][]matriz=new int[7][5];
		int maximo=Integer.MIN_VALUE;		
		
		//Inicializamos la matriz y buscamos el máximo 
		
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]= ((int)(Math.random()*10));
				System.out.print(matriz[i][j]+" ");
				if (maximo<matriz[i][j]) 
					maximo=matriz[i][j];
			}
			System.out.println();

		}

		//Buscamos todos los clientes que tienen ese máximo
		
		System.out.println("Clientes con un seguro contratado de precio máximo: "+maximo);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]==maximo)
					System.out.println(clientes[i]+" seguro "+seguros [j]);
			}
			
		}	

		
 * */
 