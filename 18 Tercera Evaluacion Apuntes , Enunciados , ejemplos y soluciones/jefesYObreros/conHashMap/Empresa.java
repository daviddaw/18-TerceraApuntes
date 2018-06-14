package conHashMap;
import java.util.Scanner;
import java.util.Vector;
//Preguntar por el casting a jefe que hice pero a obrero no le hice nada
//Preguntar por la visibilidad del campo codigo y autonumerico
//Preguntar por la llamada recursiva de los toString
//Preguntar donde se inicia el array de los jefes al principio a null

public class Empresa {
	static Scanner in =new Scanner(System.in);
	Vector<Empleado> listaEmpleados;
	
	

	public Empresa() {
		super();
		this.listaEmpleados = new Vector<Empleado>();
	}
	
/***************************************************************************************************************/
	public void annadirEmpleado() {
		String tipoE;
		Empleado e;
		Jefe jAux = null;
		System.out.println("Inserta un jefe o un obrero J/O");

		do {
			System.out.println(" J/O ");
			tipoE=in.next();
			if (!tipoE.equalsIgnoreCase("J")  &&  !tipoE.equalsIgnoreCase("O")) {
				System.out.println("No has introducido J/O  \n vuelve a intentarlo");
			}

		} while (  !tipoE.equalsIgnoreCase("J")  &&  !tipoE.equalsIgnoreCase("O"));

		if (tipoE.equalsIgnoreCase("J")) {
			Jefe j = new Jefe();

			listaEmpleados.addElement(j);
		}

		if (tipoE.equalsIgnoreCase("O")) {
			String codigo;
			System.out.println("Inserta el codigo del jefe");
			codigo=in.next();

			e=validarCodigoEmpleado(codigo);//Pide codigo ycomprueba que este enla lista

			if (e==null) {
				System.out.println("no existe el codigo ");
			}else {
				System.out.println("Encontrado "+e.toString());
				System.out.println("Comprobando que el codigo corresponde a un jefe...");
				if (e instanceof Jefe) {
					System.out.println("correcto es un jefe");
					jAux=(Jefe)e;//es necesario?, no lo entiendo.
				
				System.out.println("***");
				System.out.println("dando de alta obrero");				
				Obrero o = new Obrero(jAux);//Me salto un error y le añadi un casting Arriba en el instanceOf
				listaEmpleados.addElement(o);

				System.out.println("Insertando en el array del jefe");
				jAux.insertarEnArray(o);
				}
			}

		}

	}
	
	private Empleado validarCodigoEmpleado(String codigo) {
		Empleado e;

		System.out.println("buscando si existe el codigo del empleado..");
		e=buscarStringLista(codigo);
		return e;	

	}

	/***************************************************************************************************************/

	//metodos de ayuda
	private Empleado buscarStringLista(String codigo) {
		boolean encontrado=false;
		Empleado e = null;
		for (int i = 0; i < listaEmpleados.size()&& !encontrado; i++) {
			//listaEmpleados.get(i).equalsIgnoreCase(codigoJefe)) al poner esto me dice que cree un equals en empleado
			if(listaEmpleados.get(i).getCodigo().equalsIgnoreCase(codigo)) {
				encontrado=true;
				e=listaEmpleados.get(i);


			}

		}
		return e;
	}

	//metodos de ayuda
	public void listarTodo() {
		Obrero oAux = null;
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i) instanceof Obrero) {
				oAux=(Obrero)listaEmpleados.get(i);
				if (oAux.getJefe()==null) {
					System.out.println("El empleado no tiene jefe");
					System.out.println("Codigo "+oAux.getCodigo()+" Edad "+oAux.getEdad()+" Nombre"+oAux.getNombre()+" Sueldo "+oAux.getSueldo());
					
					
				}else {
					System.out.println(listaEmpleados.get(i).toString());
				}
				
			}else {
				System.out.println(listaEmpleados.get(i).toString());
			}
			
		}

	}
	/***************************************************************************************************************/
	public void subirSueldo() {

		System.out.println("Introduce el porcentaje de subida");
		int porcentaje;
		do {
			porcentaje=in.nextInt();
			if (porcentaje<0 || porcentaje>100) {
				System.out.println("introduce un numero de 0 a 100");
			}
		} while (porcentaje<0 || porcentaje>100);
		double nuevoSueldo;
		for (int i = 0; i < listaEmpleados.size(); i++) {

			System.out.println("antes de la subida"+listaEmpleados.get(i).toString());

			nuevoSueldo = listaEmpleados.get(i).getSueldo()+listaEmpleados.get(i).getSueldo()*((double)porcentaje/100);


			if (listaEmpleados.get(i) instanceof Jefe) {
				nuevoSueldo=nuevoSueldo+120.0;
				System.out.println(nuevoSueldo+" suma");
			}
			listaEmpleados.get(i).setSueldo(nuevoSueldo);
			System.out.println("despues de la subida"+listaEmpleados.get(i).toString());
		}


	}
	/***************************************************************************************************************/

	public void obrerosDeJefe() {
		Jefe jAux;
		String codigo;
		System.out.println("Inserta el codigo del jefe");
		codigo=in.next();
		Empleado e = validarCodigoEmpleado(codigo);
		
		if (e==null) {
			System.out.println("no existe el codigo ");
		}else {
			if (e instanceof Jefe) {
				System.out.println("Codigo de jefe");
				jAux = (Jefe)e;//es necesario?, no lo entiendo.
			System.out.println("mostrando el nombre de los obreros del jefe");
			jAux.recorrerListaJefeMostrarNombreDeEmpleados();		
			}else {
				System.out.println("Codigo de empleado");
			}
		}

		



	}
	/***************************************************************************************************************/

	public void jefeDeUnObrero() {
		String codigo;
		System.out.println("Inserta el codigo del obrero");
		codigo=in.next();
		Empleado e = validarCodigoEmpleado(codigo);
		
		Obrero oAux;
		if (e==null) {
			System.out.println("no existe el codigo ");
		}else {
			
			if (e instanceof Obrero) {
				oAux=(Obrero)e;//lo mismo
				System.out.println(oAux.getJefe().getNombre());
			}
		}
	}
	/***************************************************************************************************************/
	public void borrarEmpleado() {
		String codigo;
		System.out.println("Inserta el codigo del empleado");
		codigo=in.next();
		Empleado e = validarCodigoEmpleado(codigo);
		if (e==null) {
			System.out.println("no existe el codigo ");
			System.out.println("No se borrara el empleado");
		}else {
			
			if (e instanceof Obrero) {
				System.out.println("Codigo de obrero");
				Obrero oAux = (Obrero)e;//lo mismo
				//Si es un obrero y tiene jefe, se borrará del arrayList de obreros de su jefe correspondiente.
				if (oAux.getJefe()!=null) {
					oAux.getJefe().borrarDeListaDeJefe(oAux);
				}
				

			}
			if (e instanceof Jefe) { 
				System.out.println("Codigo de jefe");
				Jefe jAux = (Jefe)e;//Por que es necesario?, no lo entiendo.
				//Si es un jefe, a todos sus obreros se les pondrá null en el campo Jefe.
				jAux.quitarJefeDelEmpleado();	
			}
			listaEmpleados.remove(e);
		}
		
	}
	/***************************************************************************************************************/

}
