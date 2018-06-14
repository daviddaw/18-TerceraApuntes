package conHashSet_TreeSet;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((jefe == null) ? 0 : jefe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obrero other = (Obrero) obj;
		if (jefe == null) {
			if (other.jefe != null)
				return false;
		} else if (!jefe.equals(other.jefe))
			return false;
		return true;
	} 
	
	

}
