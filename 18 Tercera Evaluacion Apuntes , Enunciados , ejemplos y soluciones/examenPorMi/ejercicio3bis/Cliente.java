package ejercicio3bis;

public class Cliente {
 //PRI
	private String nombre;
	private String direccion;
	private double presupuestos;
	
	
	public Cliente(String nombre, String direccion, double presupuestos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.presupuestos = presupuestos;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getPresupuestos() {
		return presupuestos;
	}
	public void setPresupuestos(double presupuestos) {
		this.presupuestos = presupuestos;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", presupuestos=" + presupuestos + "]";
	}
	
}
