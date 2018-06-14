package ejercicio2;

import java.util.Comparator;

public class OrdenarUnidades implements Comparator<Articulos>{

	@Override
	public int compare(Articulos a1, Articulos a2) {
		if(a1.getUnidades()==a2.getUnidades())
			return a1.getCodigo()-a2.getCodigo(); 
		else
			return a1.getUnidades()-a2.getUnidades();
	}

}
