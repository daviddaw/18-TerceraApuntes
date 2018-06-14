import java.util.Vector;

public class ColeccionMecanicos {
	Vector<Mecanico> listaMecanicos;

	public ColeccionMecanicos() {		
		this.listaMecanicos = new Vector<Mecanico>();//hago el new aqui? o sin contructor
	}
	
	
	



	public Mecanico mecanicoLibre() {
		Mecanico mecanicoLibre = null;
		boolean encontrado = false;
		for (int i = 0; i < listaMecanicos.size() && !encontrado; i++) {
			if (listaMecanicos.get(i).isLibre()) {
				encontrado =true;
				mecanicoLibre=listaMecanicos.get(i);				
			}
		}
		return mecanicoLibre;
		
	}






	public void recorrerMecanicos() {
		for (int i = 0; i < listaMecanicos.size(); i++) {
			System.out.println(listaMecanicos.get(i));
		}
		
	}






	public Mecanico buscarMecanicoCodigoInt(int codMec) {
		boolean encontrado = false;
		Mecanico mec = null;
		for (int i = 0; i < listaMecanicos.size() && !encontrado; i++) {
			if (listaMecanicos.get(i).getCodMecanico()==codMec) {
				encontrado=true;
				mec =listaMecanicos.get(i);
			}
			System.out.println();
		}


		return mec;
	}

}
