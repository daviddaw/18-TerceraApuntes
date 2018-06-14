
public class Mecanico implements Incremento {
	private static int autonumerico;
	private int codMecanico;
	private String nombre;
	private double sueldo;
	private boolean libre;
	private Vehiculo vehiculoReparacion;
	
	public Mecanico(int codMecanico, String nombre, boolean libre, Vehiculo vehiculoReparacion) {
		autonumerico++;
		this.codMecanico = autonumerico;//T
		this.nombre = nombre;//T
		this.libre = libre;
		if (libre) {
			this.vehiculoReparacion = null;
		}else {
			this.vehiculoReparacion=vehiculoReparacion;
		}
		
	}
	public int getCodMecanico() {
		return codMecanico;
	}
	public void setCodMecanico(int codMecanico) {
		this.codMecanico = codMecanico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isLibre() {
		return libre;
	}
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	public Vehiculo getVehiculoReparacion() {
		return vehiculoReparacion;
	}
	public void setVehiculoReparacion(Vehiculo vehiculoReparacion) {
		this.vehiculoReparacion = vehiculoReparacion;
	}
	@Override
	public String toString() {
		return "Mecanicos [codMecanico=" + codMecanico + ", nombre=" + nombre + ", libre=" + libre
				+ ", vehiculoReparacion=" + vehiculoReparacion + "]";
	}
	@Override
	public void aumentar(int cantidad) {
		setSueldo(getSueldo() + cantidad);
		
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

	
}
