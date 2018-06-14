package ejercicio3;

public class resp extends Personal {	
	protected int productividad;

	

	
	public resp() {
		super();
		this.productividad = (int) (Math.random()+100*500);
	}



	



	@Override
	public int sueldo() {
		
		return (int) (getSueldoBase()+getProductividad());
	}







	public int getProductividad() {
		return productividad;
	}







	public void setProductividad(int productividad) {
		this.productividad = productividad;
	}
	
}
		