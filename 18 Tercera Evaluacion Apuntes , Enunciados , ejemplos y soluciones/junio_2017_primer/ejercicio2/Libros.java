package ejercicio2;

public class Libros extends Articulos{

	private String autor, nomEditorial;
	
	public Libros(String denominacion, double precio, String autor, String nomEditorial) {
		super(denominacion, precio);
		this.autor=autor;
		this.nomEditorial=nomEditorial;
	}

	public String getAutor() {
		return autor;
	}

	public String getNomEditorial() {
		return nomEditorial;
	}

	@Override
	public String toString() {
		return super.toString()+" Libros [autor=" + autor + ", nomEditorial=" + nomEditorial
				+ "]";
	}

}
