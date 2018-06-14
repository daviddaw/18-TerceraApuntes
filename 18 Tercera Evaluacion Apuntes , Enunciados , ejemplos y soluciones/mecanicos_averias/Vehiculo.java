import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo  {
	static Scanner in = new Scanner(System.in);
	private String matricula;
	private String estado;
	private ArrayList<Averia> listaAverias;
	
	public Vehiculo(String matricula) {
		
		this.matricula = matricula;
		this.estado = "En espera";
		this.listaAverias = new ArrayList<Averia>();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<Averia> getListaAverias() {
		return listaAverias;
	}

	public void setListaAverias(ArrayList<Averia> listaAverias) {
		this.listaAverias = listaAverias;
	}
	
	public int costeReparacion() {
		int coste = 0;
		if (listaAverias==null) {
			System.out.println("algo ha salido mal estearray debia existir");
		}else {
			
			for (int i = 0; i < listaAverias.size(); i++) {
				coste+=listaAverias.get(i).getCosteAveria();
			}
		}

				
		return coste;
		//segunlasaverias coste
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", estado=" + estado + ", listaAverias=" + listaAverias
				+ ", costeReparacion()=" + costeReparacion() + "]";
	}

	public Vehiculo buscarVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((listaAverias == null) ? 0 : listaAverias.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (listaAverias == null) {
			if (other.listaAverias != null)
				return false;
		} else if (!listaAverias.equals(other.listaAverias))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	
	



	
	
	
	
}
