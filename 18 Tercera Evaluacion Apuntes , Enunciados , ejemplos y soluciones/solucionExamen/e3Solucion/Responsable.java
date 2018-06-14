package e3Solucion;

public class Responsable extends Personal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int productividad;
	
	private double sueldo;
	
	
	// Constructor
	public Responsable(String nombre, Cliente cliente, double sueldoBase, int productividad) {
		super(nombre, cliente, sueldoBase);
		this.productividad = productividad;
		this.sueldo += productividad; 
		this.registroPersonal="RESP"+numPersonal+cliente.getNombreCliente().substring(0, 4);	
	}


	// Getters & Setters
	public int getProductividad() {
		return productividad;
	}

	public void setProductividad(int productividad) {
		this.productividad = productividad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

		
	// toString
	@Override
	public String toString() {
		return super.toString() + ", Responsable [productividad=" + productividad + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
}
