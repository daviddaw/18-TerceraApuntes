package e2RepasoCol;

public class Motocicleta extends Vehiculo{
	private int cilindrada;
	
	public Motocicleta() {
		super();
		do {
			System.out.println("Que cilindrada tiene?");
			this.cilindrada = in.nextInt();
		} while (cilindrada<25 ||cilindrada>2000);
		
	}
	


	public Motocicleta(int cilindrada,String matricula,String estado) {
		super(matricula, estado);
		this.cilindrada = cilindrada;
	}



	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}



	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", getMatricula()=" + getMatricula() + ", getEstado()="
				+ getEstado() + ", getAveriasVehiculo()=" + getAveriasVehiculo() + ", costeReparacion()="
				+ costeReparacion() + "]";
	}






		



}
