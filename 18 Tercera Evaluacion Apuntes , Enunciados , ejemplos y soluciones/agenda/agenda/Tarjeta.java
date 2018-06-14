package agenda;

public class Tarjeta implements Comparable<Tarjeta>{
	private String apellido;
	private String nombreEmpresa;
	
	public Tarjeta(String apellido) {
		this.apellido = apellido;
		this.nombreEmpresa = "Empresa"+(int)(Math.random()*10);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String toString() {
		return "Tarjeta [apellido=" + apellido + ", nombreEmpresa=" + nombreEmpresa + "]";
	}

	@Override
	public int compareTo(Tarjeta o) {
		
		return this.apellido.compareTo(o.apellido);
	}
	
	

}
