package ejercicio3;

public class Cliente {
protected String nombreCliente;
protected String direccionCliente;
protected Double presupuesto;
public Cliente(String nombreCliente, String direccionCliente, Double presupuesto) {
	super();
	this.nombreCliente = nombreCliente;
	this.direccionCliente = direccionCliente;
	this.presupuesto = presupuesto;
}
public String getNombreCliente() {
	return nombreCliente;
}
public void setNombreCliente(String nombreCliente) {
	this.nombreCliente = nombreCliente;
}
public String getDireccionCliente() {
	return direccionCliente;
}
public void setDireccionCliente(String direccionCliente) {
	this.direccionCliente = direccionCliente;
}
public Double getPresupuesto() {
	return presupuesto;
}
public void setPresupuesto(Double presupuesto) {
	this.presupuesto = presupuesto;
}
@Override
public String toString() {
	return "Cliente [nombreCliente=" + nombreCliente + ", direccionCliente=" + direccionCliente + ", presupuesto="
			+ presupuesto + "]";
}


}
