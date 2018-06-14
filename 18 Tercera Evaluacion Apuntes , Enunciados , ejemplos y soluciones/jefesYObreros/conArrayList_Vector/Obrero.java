package conArrayList_Vector;

public class Obrero extends Empleado {
    static int autonumerico2;
	Jefe jefe = null;
	

	public Obrero(Jefe jefe) {
		super();
		this.jefe = jefe;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Obrero [jefe=" + jefe.getNombre() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getSueldo()="
				+ getSueldo() + ", getCodigo()=" + getCodigo() + "]";//puse get nombre para que no se llame recursivamente
	}

	@Override
	public String generadorCodigo() {
		autonumerico2++;
		
		return "O"+autonumerico2;
	} 
	
	

}
