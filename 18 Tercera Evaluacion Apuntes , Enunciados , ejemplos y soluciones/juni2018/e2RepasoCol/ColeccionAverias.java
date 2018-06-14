package e2RepasoCol;

import java.util.ArrayList;

public class ColeccionAverias {
	ArrayList<Averia> listaAverias;
	
	

	public ColeccionAverias() {

		this.listaAverias = new ArrayList<Averia>();
	}

	public ArrayList<Averia> getListaAverias() {
		return listaAverias;
	}

	public void setListaAverias(ArrayList<Averia> listaAverias) {
		this.listaAverias = listaAverias;
	}

	@Override
	public String toString() {
		return "ColeccionAverias [listaAverias=" + listaAverias + "]";
	}

	public void recorrerAverias() {
		// TODO Auto-generated method stub
		
	}
	
	

}
