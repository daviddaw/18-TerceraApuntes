package e3Solucion;

public class Programador extends Personal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double sueldo;
	
	
	// Constructor
	public Programador(String nombre, Cliente cliente, double sueldoBase) {
		super(nombre, cliente, sueldoBase);	
		
		this.registroPersonal="PROG"+numPersonal+cliente.getNombreCliente().substring(0, 4);				
	}

	

	// Getter & Setters
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	// toString
	@Override
	public String toString() {
		return super.toString() + ", Programador [sueldo=" + sueldo + "]";
	}
	
	
	
}
