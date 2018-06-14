import java.util.ArrayList;

public class ColeccionAverias {
	ArrayList<Averia> listaAverias;
	

	public ColeccionAverias() {
		this.listaAverias = new ArrayList<Averia>();
	}


	public void recorrerAverias() {
		for (int i = 0; i < listaAverias.size(); i++) {
			System.out.println(listaAverias.get(i));
		}

		
		
		
	}


	public Averia buscarAveriaPorcodigo(int codigoAveria) {
		boolean encontrado = false;
		Averia averia = null;
		for (int i = 0; i < listaAverias.size() && !encontrado; i++) {
			if (listaAverias.get(i).getCodigoAveria()==codigoAveria) {
				encontrado=true;
				averia=listaAverias.get(i);
			}
		}
		return averia;
	}

}
