package e2RepasoCol;

public class Averia {
	static int autonumerico;
	private int codigoAveria;
	private double coste;
	
	public Averia() {
		super();
		this.codigoAveria = autonumerico;
		this.coste =(int)(Math.random()*500*1);
		autonumerico++;
	}
	
	
	

}
