
public class Averia implements Incremento {
	private static int autonumerico;
	private int codigoAveria;	
	private double costeAveria;
	public Averia(int codigoAveria, double costeAveria) {
		this.codigoAveria = autonumerico;
		this.costeAveria =(int)(Math.random()*499+1);
		autonumerico++;
	}
	public int getCodigoAveria() {
		return codigoAveria;
	}
	public void setCodigoAveria(int codigoAveria) {
		this.codigoAveria = codigoAveria;
	}
	public double getCosteAveria() {
		return costeAveria;
	}
	public void setCosteAveria(double costeAveria) {
		this.costeAveria = costeAveria;
	}
	@Override
	public String toString() {
		return "averia [codigoAveria=" + codigoAveria + ", costeAveria=" + costeAveria + "]";
	}
	@Override
	public void aumentar(int cantidad) {
		costeAveria+=cantidad;
		
	}
	
	

}
