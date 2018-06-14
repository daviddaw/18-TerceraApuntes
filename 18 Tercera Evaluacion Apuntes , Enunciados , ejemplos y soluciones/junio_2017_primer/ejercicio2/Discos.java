package ejercicio2;

public class Discos extends Articulos {

	private String cantante;
	private double duracion;
	
	public Discos(String denominacion, double precio, String cantante, double duracion) {
		super(denominacion, precio);
		this.cantante=cantante;
		this.duracion=duracion;
	}

	public String getCantante() {
		return cantante;
	}

	public double getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return super.toString()+" Discos [cantante=" + cantante + ", duracion=" + duracion + "]";
	}


}
