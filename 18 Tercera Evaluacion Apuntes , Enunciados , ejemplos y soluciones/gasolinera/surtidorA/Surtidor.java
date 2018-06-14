package surtidorA;
import java.util.LinkedList;
import java.util.Queue;

public class Surtidor {

	private Queue<Coche> colaCoches;
	private boolean surtidorLibre;
	private Coche cocheRepostando;
	
	
	public Surtidor() {

		this.colaCoches = new LinkedList<Coche>();
		this.surtidorLibre = true;
		cocheRepostando = null;
	}

	

	public Queue<Coche> getColaCoches() {
		return colaCoches;
	}


	public void setColaCoches(Queue<Coche> colaCoches) {
		this.colaCoches = colaCoches;
	}


	public boolean isSurtidorLibre() {
		return surtidorLibre;
	}


	public void setSurtidorLibre(boolean surtidorLibre) {
		this.surtidorLibre = surtidorLibre;
	}


	public Coche getCocheRepostando() {
		return cocheRepostando;
	}


	public void setCocheRepostando(Coche cocheRepostando) {
		this.cocheRepostando = cocheRepostando;//
	}


	@Override
	public String toString() {
		return "Surtidor [   CocheRepostando=" + cocheRepostando  + ", surtidorLibre=" + surtidorLibre + ", colaCoches="
				+ colaCoches + "   ]";
	}


	public void insertarCocheEnCola(Coche e) {
		colaCoches.add(e);	
	}

	public Coche cogerPrimerCoche() {
		cocheRepostando= colaCoches.peek();
		colaCoches.poll();
		return cocheRepostando;
	}


}
