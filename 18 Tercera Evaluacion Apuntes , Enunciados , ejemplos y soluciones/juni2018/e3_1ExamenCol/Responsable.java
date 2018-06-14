package e3_1ExamenCol;


public class Responsable extends Personal  {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double sueldo;
	private int productividad;
	


	public Responsable(String nombre, Cliente cliente) {
		super(nombre, cliente);//extends
		this.productividad =(int) (Math.random()*1000+200);
		this.sueldo = sueldoBase+productividad;
		this.registroPersonal="RESP"+numPersonal+getCliente().getNombreCliente().substring(0, 4);
	}



	public double getSueldo() {
		return sueldo;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public int getProductividad() {
		return productividad;
	}



	public void setProductividad(int productividad) {
		this.productividad = productividad;
	}



	@Override
	public String toString() {
		return super.toString()+" Responsable [sueldo=" + sueldo + ", productividad=" + productividad + "]";
	}


	
	
	
	
	
	
/*
	@Override
	public  double calcularSueldo() {
		return sueldo=sueldoBase+productividad;
		
	}



	@Override
	public String generarRegistroPersonal() {
		registroPersonal="RESP"+numPersonal+getCliente().getNombreCliente().substring(0, 4);
		return registroPersonal;
	}
	*/
	
	

}
