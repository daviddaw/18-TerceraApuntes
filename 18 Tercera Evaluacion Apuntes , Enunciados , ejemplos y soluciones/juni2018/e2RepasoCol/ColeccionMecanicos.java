package e2RepasoCol;

import java.util.Vector;

public class ColeccionMecanicos {
	Vector<Mecanico> listaMecanicos;

	public ColeccionMecanicos() {
		super();
		this.listaMecanicos = new Vector<Mecanico>();
	}

	public Vector<Mecanico> getListaMecanicos() {
		return listaMecanicos;
	}

	public void setListaMecanicos(Vector<Mecanico> listaMecanicos) {
		this.listaMecanicos = listaMecanicos;
	}

	@Override
	public String toString() {
		return "ColeccionMecanicos [listaMecanicos=" + listaMecanicos + "]";
	}

	public Mecanico buscarMecanicoLibre() {
		boolean encontrado = false;
		Mecanico mecanicoAux = null;
		
		for (int i = 0; i < listaMecanicos.size() && !encontrado; i++) {
			if (listaMecanicos.get(i).isLibre()) {
				mecanicoAux=listaMecanicos.get(i);
				encontrado=true;
			}
			
		}
		return mecanicoAux;
		
	}

	public void recorrerMecanicos() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
