package ejercicio3bis;

public class Proyecto {
	private String nombreProyecto;
	private Boolean prioridadAlta;
	
	public Proyecto(String nombreProyecto, Boolean prioridadAlta) {
		super();
		this.nombreProyecto = nombreProyecto;
		this.prioridadAlta = prioridadAlta;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public Boolean getPrioridadAlta() {
		return prioridadAlta;
	}

	public void setPrioridadAlta(Boolean prioridadAlta) {
		this.prioridadAlta = prioridadAlta;
	}

	@Override
	public String toString() {
		return "Proyecto [nombreProyecto=" + nombreProyecto + ", prioridadAlta=" + prioridadAlta + "]";
	}
	
	

}
