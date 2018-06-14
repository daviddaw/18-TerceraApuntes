package ejercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ventas {

	private String codVendedor;
	private int codArticulo, unidadesVendidas;
	
	public Ventas(){}
	
	public Ventas(String codVendedor, int codArticulo, int unidadesVendidas){
		this.codVendedor=codVendedor;
		this.codArticulo=codArticulo;
		this.unidadesVendidas=unidadesVendidas;
	}

	public String getCodVendedor() {
		return codVendedor;
	}

	public int getCodArticulo() {
		return codArticulo;
	}

	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}

	@Override
	public String toString() {
		return "Venta [codVendedor=" + codVendedor + ", codArticulo="
				+ codArticulo + ", unidadesVendidas=" + unidadesVendidas + "]";
	}
	
	public void grabarVentaFichero(DataOutputStream fichero) throws IOException{
		fichero.writeUTF(codVendedor);
		fichero.writeInt(codArticulo);
		fichero.writeInt(unidadesVendidas);
	}

	public void leerVentaFichero(DataInputStream fichero) throws IOException{
		codVendedor=fichero.readUTF();
		codArticulo=fichero.readInt();
		unidadesVendidas=fichero.readInt();
	}
	
}
