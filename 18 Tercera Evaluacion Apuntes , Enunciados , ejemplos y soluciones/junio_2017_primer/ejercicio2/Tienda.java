package ejercicio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Tienda {

	private ArrayList<Articulos> listaArticulos;
	private TreeMap<String, Vendedores> listaVendedores;
	private LinkedList<Ventas> listaVentas;
	private ColaVentas colaVentas;
	
	public Tienda (){
		listaArticulos=new ArrayList<Articulos>();
		listaVendedores=new TreeMap<String, Vendedores>();
		listaVentas=new LinkedList<Ventas>();
		colaVentas=new ColaVentas();
	}

	public ArrayList<Articulos> getListaArticulos() {
		return listaArticulos;
	}

	public TreeMap<String, Vendedores> getListaVendedores() {
		return listaVendedores;
	}

	public LinkedList<Ventas> getListaVentas() {
		return listaVentas;
	}

	public ColaVentas getColaVentas() {
		return colaVentas;
	}
	
	public void altaArticulo(Scanner sc){
		int opcion;
		double precio, duracion;
		String denominacion, autor, nomEditorial, cantante;
		boolean existe=false;
		Libros libro;
		Discos disco;
		
		do{
			System.out.println("Elige una opción:"+
					"\n	1.Crear Libro"+
					"\n	2.Crear Disco");
			opcion=sc.nextInt();
		}while(opcion<1 || opcion>2);
		switch (opcion) {
		case 1:
			System.out.println("Introduce la denominación del libro:");
			denominacion=sc.next();
			for(Articulos articulo : listaArticulos)
				if(articulo.getDenominacion().equalsIgnoreCase(denominacion))
					existe=true;
			if(!existe){
				do{
					System.out.println("Introduce el precio del libro:");
					precio=sc.nextInt();
				}while(precio<=0);
				System.out.println("Introduce el autor del libro:");
				autor=sc.next();
				System.out.println("Introduce el nombre de la editorial del libro:");
				nomEditorial=sc.next();
				libro=new Libros(denominacion, precio, autor, nomEditorial);
				listaArticulos.add(libro);
				System.out.println("Se ha dado de alta un libro.");
			}
			else
				System.out.println("Ya existe un artículo con esa denominación.");
			break;
		case 2:
			System.out.println("Introduce la denominación del disco:");
			denominacion=sc.next();
			for(Articulos articulo : listaArticulos)
				if(articulo.getDenominacion().equalsIgnoreCase(denominacion))
					existe=true;
			if(!existe){
				do{
					System.out.println("Introduce el precio del disco:");
					precio=sc.nextInt();
				}while(precio<=0);
				System.out.println("Introduce el cantante del disco:");
				cantante=sc.next();
				do{
					System.out.println("Introduce la duración del disco:");
					duracion=sc.nextDouble();
				}while(duracion<=0);
				disco=new Discos(denominacion, precio, cantante, duracion);
				listaArticulos.add(disco);
				System.out.println("Se ha dado de alta un disco.");
			}
			else
				System.out.println("Ya existe un artículo con esa denominación.");
			break;
		}
	}

	public void altaVendedor(Scanner sc){
		Vendedores vendedor;
		String nombre, departamento;
		
		System.out.println("Introduce el nombre del vendedor:");
		nombre=sc.next();
		System.out.println("Introduce el nombre del departamento:");
		departamento=sc.next();
		vendedor=new Vendedores(nombre, departamento);
		if(listaVendedores.containsKey(vendedor.getClave()))
			System.out.println("Ya existe ese vendedor.");
		else{
			listaVendedores.put(vendedor.getClave(), vendedor);
			System.out.println("Se ha dado de alta un vendedor.");
		}
	}

	public void altaVentas(Scanner sc){
		String codVendedor;
		int codArticulo, unidadesVendidas;
		Ventas venta;
		
		System.out.println("Introduce el código de vendedor:");
		codVendedor=sc.next();
		System.out.println("Introduce el código de artículo:");
		codArticulo=sc.nextInt();
		System.out.println("Introduce las unidades vendidas:");
		unidadesVendidas=sc.nextInt();
		venta=new Ventas(codVendedor, codArticulo, unidadesVendidas);
		listaVentas.add(venta);
		System.out.println("Se ha dado de alta una venta.");
	}

	public void actualizacionVentas(){
		boolean encontrado=false;

		if(listaVentas.isEmpty())
			System.out.println("La lista de ventas está vacía.");
		else
			if(listaVendedores.isEmpty())
				System.out.println("No hay ningún vendedor.");
			else
				if(listaArticulos.isEmpty())
					System.out.println("No hay ningún artículo.");
				else{
					for(Ventas venta : listaVentas){
						if(listaVendedores.containsKey(venta.getCodVendedor()))
							for(Articulos articulo : listaArticulos){
								if(articulo.getCodigo()==venta.getCodArticulo()){
									encontrado=true;
									if(venta.getUnidadesVendidas()<=articulo.getUnidades()){
										articulo.modifica(venta.getUnidadesVendidas());
										listaVendedores.get(venta.getCodVendedor()).modifica(venta.getUnidadesVendidas()*articulo.getPrecio());
									}else{
										System.out.println("No hay suficientes unidades disponibles, venta añadida a la cola de ventas.");
										colaVentas.getColaVentas().offer(venta);
									}	
								}
							}
						else
							System.out.println("No existe el vendedor.");

						if(!encontrado)
							System.out.println("No existe el artículo.");
					}
					listaVentas.clear();
				}
	}

	public void grabarColaVentas(){
		File fichero = new File("Reponer.dat");
		DataOutputStream dos;

		if(colaVentas.getColaVentas().isEmpty())
			System.out.println("La cola de ventas está vacía.");
		else{
			try{
				if(fichero.exists())
					dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fichero, true)));
				else
					dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)));
				while(!colaVentas.getColaVentas().isEmpty())
					colaVentas.getColaVentas().poll().grabarVentaFichero(dos);
				dos.flush();
				dos.close();
			}catch(Exception e){
				System.out.println("Error al grabar las ventas en el fichero.");
			}
		}
	}

	public void leerFichero(){
		File fichero = new File("Reponer.dat");
		DataInputStream dis;
		Ventas venta= new Ventas();

		try{
			dis=new DataInputStream(new BufferedInputStream(new FileInputStream(fichero)));
			while(dis.available()>0){
				venta.leerVentaFichero(dis);
				System.out.println(venta.toString());
			}
			dis.close();
		}catch(Exception e){
			System.out.println("Error al leer el fichero.");
		}
	}
	
	public void ordenarCodigo(){
		if(listaArticulos.isEmpty())
			System.out.println("No se puede ordenar porque la lista de artículos está vacía.");
		else{
			Collections.sort(listaArticulos);
			System.out.println("Lista de artículos ordenada por código.");
		}
	}
	
	public void ordenarUnidades(){
		if(listaArticulos.isEmpty())
			System.out.println("No se puede ordenar porque la lista de artículos está vacía.");
		else{
			Collections.sort(listaArticulos, new OrdenarUnidades());
			System.out.println("Lista de artículos ordenada por número de unidades.");
		}
	}

	public void listarCeros(){
		if(listaArticulos.isEmpty())
			System.out.println("La lista de artículos está vacía.");
		else
			for(Articulos articulo : listaArticulos)
				if(articulo instanceof Discos && articulo.getUnidades()==0)
					System.out.println(articulo.toString());
	}

	public void serializarListaArticulos(){
		try{
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Articulos.dat"));
			out.writeObject(listaArticulos);
			out.close();
			System.out.println("Lista articulos serializada.");
		}catch (Exception e) {
			System.err.println("Error al serializar la lista de artículos.");
		}
	}
	
	public void deserializarListaArticulos(){
		try{
			File fichEmpleados=new File("Articulos.dat");
			if(fichEmpleados.exists()){
				ObjectInputStream in=new ObjectInputStream(new FileInputStream("Articulos.dat"));
				listaArticulos=(ArrayList<Articulos>)in.readObject();
				System.out.println("Lista de articulos deserializada.");
				in.close();
			}
		}catch (Exception e) {
			System.err.println("Error al deserializar la lista de artículos.");
		}
	}
	
	public void serializarListaVendedores(){
		try{
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Vendedores.dat"));
			out.writeObject(listaVendedores);
			out.close();
			System.out.println("Lista vendedores serializada.");
		}catch (Exception e) {
			System.err.println("Error al serializar la lista de vendedores.");
		}
	}

	public void deserializarListaVendedores(){
		try{
			File fichEmpleados=new File("Vendedores.dat");
			if(fichEmpleados.exists()){
				ObjectInputStream in=new ObjectInputStream(new FileInputStream("Vendedores.dat"));
				listaVendedores=(TreeMap<String, Vendedores>)in.readObject();
				System.out.println("Lista de vendedores deserializada.");
				in.close();
			}
		}catch (Exception e) {
			System.err.println("Error al deserializar la lista de Vendedores.");
		}
	}

	//métodos listar para visualizar las colecciones
	
	public void listarArticulos(){
		if(listaArticulos.isEmpty())
			System.out.println("La lista de artículos está vacía.");
		else
			for(Articulos articulo : listaArticulos)
				System.out.println(articulo.toString());
	}

	public void listarVendedores(){
		if(listaVendedores.isEmpty())
			System.out.println("La lista de vendedores está vacía.");
		else
			for(String codigo : listaVendedores.keySet())
				System.out.println(listaVendedores.get(codigo).toString());
	}

	public void listarVentas(){
		if(listaVentas.isEmpty())
			System.out.println("La lista de ventas está vacía.");
		else
			for(Ventas venta : listaVentas)
				System.out.println(venta.toString());
	}
}
