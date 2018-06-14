
public class Tiendas_Productos {

	public static void main(String[] args) {
		int tiendas=10;
		String[] listaTiendas= new String[tiendas];
		//8 productos
		String[] listaProductos = {"FALDA","MINIFALDA","CAMISETA","SUDADERA","PANTALON CORTO","COMPLEMENTOS"};
		int productos= listaProductos.length;
		int[] precioProductos =new  int[productos] ;
			
		int [][] cadenaRopa = new int[tiendas][productos];

		CrearArray(listaTiendas);
		generarPrecios(precioProductos);
		visualizarArray(listaTiendas);

		visualizarArray(listaProductos,precioProductos);

		
		
		for (int i = 0; i < tiendas ;i++) {
			for (int j = 0; j < productos; j++) {
				cadenaRopa[i][j]=(int)(Math.random()*50+1);
				cadenaRopa[3][0]=1;
				cadenaRopa[3][1]=1;
				cadenaRopa[3][2]=1;
				cadenaRopa[3][3]=1;
				cadenaRopa[3][4]=1;
				cadenaRopa[3][5]=1;
				
			}
		}
		//visualizar
		for (int i = 0; i < tiendas ;i++) {
			for (int j = 0; j < productos; j++) {
				System.out.print(cadenaRopa[i][j]+"    ");

			}
			System.out.println(" ");
		}
		//ejer
		System.out.println("*****************************");
		System.out.println("Introduce un articulo");
		String productoParam="CAMISETA";

		int posPro = 0;
		for (int i = 0; i < listaProductos.length; i++) {
			if (listaProductos[i].equalsIgnoreCase(productoParam)) {
				posPro=i;
			}
		}		

		System.out.println(posPro);
		System.out.println("***********UNIDADES en cada tienda de un producto(teclado)");
		for (int i = 0; i < tiendas; i++) {
			for (int j = 0; j < productos ;j++) {
				
			}
			System.out.println("tienda"+(i+1)+" "+cadenaRopa[i][posPro]);
			System.out.println("");
		}
		
		//System.out.println("el producto es  "+listaProductos[posPro]);
		System.out.println("***********visualizar Importe de todos los productos de cada tienda");
		int suma;
		for (int i = 0; i < tiendas; i++) {
			 suma = 0;
			for (int j = 0; j < productos; j++) {
				suma=suma+cadenaRopa[i][j]*(precioProductos[j]);
	
				
			}
			System.out.println("El importe de la tienda"+(i+1)+" es  "+suma);
		}
		
		
	}

	private static void visualizarArray(String[] listaProductos, int[] precioProductos) {
		for (int i = 0; i < precioProductos.length; i++) {
			System.out.println("Producto "+listaProductos[i]+"       Precio "+precioProductos[i]+" ");
		}
		System.out.println(" ");
	}

	private static void generarPrecios(int[] precioProductos) {
		for (int i = 0; i < precioProductos.length; i++) {
			precioProductos[i]=(int)(Math.random()*100+1);
		}
		
	}

	private static void visualizarArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}

	private static void CrearArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]="Tienda"+(i+1);
		}
		
	}

}
