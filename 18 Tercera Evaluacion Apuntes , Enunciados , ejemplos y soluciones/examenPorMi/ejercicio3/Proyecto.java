package ejercicio3;

public class Proyecto {
protected String nombreProyecto;
protected boolean prioridadAlta;
public Proyecto(String nombreProyecto, boolean priaoridadAlta) {

	this.nombreProyecto = nombreProyecto;
	this.prioridadAlta = priaoridadAlta;
}
public String getNombreProyecto() {
	return nombreProyecto;
}
public void setNombreProyecto(String nombreProyecto) {
	this.nombreProyecto = nombreProyecto;
}
public boolean isPrioridadAlta() {
	return prioridadAlta;
}
public void setPrioridadAlta(boolean prioridadAlta) {
	this.prioridadAlta = prioridadAlta;
}
@Override
public String toString() {
	return "Proyecto [nombreProyecto=" + nombreProyecto + ", prioridadAlta=" + prioridadAlta + "]";
}

}
