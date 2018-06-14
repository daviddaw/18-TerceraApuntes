import java.util.Scanner;

/*
	Ejercicio 1 
	Se desea guardar las puntuaciones de las pruebas individuales de las olimpiadas de invierno de 10 atletas que se denominarán Atleta1, Atleta2, etc. 
	Cada atleta tiene que realizar las pruebas siguientes: curling, snowboard, esquí alpino, esquí de fondo, esquí acrobático y salto de esquí. 
	Se deben guardar las puntuaciones obtenidas por cada atleta en cada prueba. Se pide: 
	Guarda los nombres de los atletas y los nombres de las pruebas en dos arrays y las puntuaciones en una matriz. 
	//Los nombres de los atletas y las puntuaciones se rellenan de forma automática. Las puntuaciones serán aleatorias  entre 0 y 10.
	//Introduce el nombre de una prueba y calcula el nombre del atleta que ha ganado la medalla de oro en dicha prueba. Se supondrá que solo hay uno. 
	Calcula cuántos atletas han obtenido una calificación mayor o igual a 9 en, al menos, 3 pruebas.
 */
public class Esquiadores_pruebas {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		//atleta son 10 pero puede variar
		int atleta=10,prueba;
		String[] listaAtleta = new String[atleta];
		//Pruebas
		String[] listaPruebas= {"curling", "snowboard", "esquí alpino", "esquí de fondo", "esquí acrobático", "salto de esquí"};
		prueba=listaPruebas.length;
		//Matriz
		int[][] puntuaciones = new int[atleta][prueba];

		crearArrayString(listaAtleta); visualizar(listaAtleta); visualizar(listaPruebas);

		crearMatrizInt(puntuaciones,atleta,prueba);
		visualizarMatrizInt(puntuaciones,atleta,prueba);

		//a)
		System.out.println("Introduce una prueba de las siguientes: ");
		visualizar(listaPruebas);
		String pruebaAux=in.nextLine();//con este nombre calculo la posicion de la columna leeremos "salto de esquí"  y buscaremos en array dara pos=5
		boolean encontrado=false;
		int posPru = -1;
		int posAtl = -1;

		for (int i = 0; i < prueba && !encontrado; i++) {
			if (listaPruebas[i].equalsIgnoreCase(pruebaAux)) {
				encontrado=true;
				posPru=i;
			}
		}
		int max=Integer.MIN_VALUE;
		//buscar en matriz
		int cont = 0,contFilas=0;
		for (int i = 0; i < atleta; i++) {
			cont=0;
			for (int j = 0; j < prueba; j++) {
				if (puntuaciones[i][posPru]>max) {
					posAtl=i;				
					max= puntuaciones[i][j];
				}

				if (puntuaciones[i][j]>=9) {
					cont++;
					if (cont>=3) {
						contFilas++;if (cont==3) {
							System.out.println("van 3 veces fila"+i);
						}


					}


				}
			}
		}
		System.out.println("En la prueba de "+ listaPruebas[posPru]+" el atleta "+listaAtleta[posAtl]+" consiguio la maxima puntuacion de "+max);
		System.out.println("En la columna "+posPru+" fila "+posAtl+" tenemos el maximo "+max);
		//System.out.println(cont);
		System.out.println("Hay "+contFilas+" atletas que cumplen los requisitos");

		//b) Calcula cuántos atletas han obtenido una calificación mayor o igual a 9 en, al menos, 3 pruebas.




	}



	private static void visualizarMatrizInt(int[][] puntuaciones, int atleta, int prueba) {
		for (int i = 0; i < atleta; i++) {
			for (int j = 0; j < prueba; j++) {
				System.out.print(puntuaciones[i][j]+" ");
			}
			System.out.println(" ");
		}
	}





	private static void crearMatrizInt(int[][] puntuaciones, int atleta, int prueba) {
		for (int i = 0; i < atleta; i++) {
			for (int j = 0; j < prueba; j++) {
				puntuaciones[i][j]=(int)(Math.random()*11);
			}
			//forzamos
			puntuaciones[0][0]=9;
			puntuaciones[0][3]=9;
			puntuaciones[0][5]=9;
			puntuaciones[2][0]=9;
			puntuaciones[2][3]=9;
			puntuaciones[2][5]=9;
			puntuaciones[9][0]=9;
			puntuaciones[9][3]=9;
			puntuaciones[9][5]=9;	

		}
	}



	private static void crearArrayString(String[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]="atleta"+(i+1);
		}

	}

	private static void visualizar(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
	}


}
