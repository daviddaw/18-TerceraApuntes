package conArrayList_Vector;

public abstract class Empleado {
    static int autonumerico;
	private String nombre;
	private int edad;
	private double sueldo;
	private String codigo;
	
	public Empleado() {
		autonumerico++;
		this.nombre = "Empleado"+autonumerico;
		this.edad =(int)(Math.random()*50+20);
		this.sueldo =1000; //Math.random()*1000+1000;
		this.codigo = generadorCodigo();
		//this.codigo = "z"+autonumerico;
	}
	
	
	abstract String generadorCodigo();


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", codigo=" + codigo + "]";
	}







}
