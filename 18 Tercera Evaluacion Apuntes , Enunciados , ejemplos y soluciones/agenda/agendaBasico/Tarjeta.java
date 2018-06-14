package agendaBasico;

public class Tarjeta {
	static int autonumerico;
	private String nombreApellidos;
	private String nombreEmpresa;
	public Tarjeta() {
		autonumerico++;
	
		this.nombreApellidos = " apellido"+(int)(Math.random()*20)+" nombre"+(int)(Math.random()*20);
		this.nombreEmpresa = "Empresa"+(int)(Math.random()*10);
	}
	public String getNombreApellidos() {
		return nombreApellidos;
	}
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	@Override
	public String toString() {
		return "Tarjeta [nombreApellidos=" + nombreApellidos + ", nombreEmpresa=" + nombreEmpresa + "]";
	}
	
	

}
