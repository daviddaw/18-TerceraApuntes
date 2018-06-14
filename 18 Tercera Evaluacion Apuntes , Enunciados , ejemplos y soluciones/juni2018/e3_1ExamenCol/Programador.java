package e3_1ExamenCol;


public class Programador extends Personal  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double sueldo;



	public Programador(String nombre, Cliente cliente) {

		super(nombre, cliente);
		this.sueldo = sueldoBase;
		this.registroPersonal="PROG"+numPersonal+getCliente().getNombreCliente().substring(0, 4);
	}



	public double getSueldo() {
		return sueldo;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	/*@Override
	public double calcularSueldo() {
		return sueldo=sueldoBase;		
	}*/

	//@Override
	/*public String generarRegistroPersonal() {
		return registroPersonal="PROG"+numPersonal+getCliente().getNombreCliente().substring(0, 4);
		
	}*/



	
	

}
