package agenda;

public class Agenda {
	private Pagina[] arrayPaginas;

	public Agenda() {

		this.arrayPaginas = new Pagina[26];
		for (int i = 0; i < arrayPaginas.length; i++) {
			arrayPaginas[i]=new Pagina();
		}
		for (int i = 0; i < arrayPaginas.length; i++) {
			char letraPagina = (char)(i+65);
			System.out.print(letraPagina+" ");
			
			arrayPaginas[i].setCaracter(letraPagina);
		
		}
		System.out.println(" ");
	}

	public void meterTarjetas(Tarjeta tarjetaAux) {
		
		for (int i = 0; i < arrayPaginas.length; i++) {
			if (tarjetaAux.getApellido().charAt(0)==arrayPaginas[i].getCaracter()) {
				arrayPaginas[i].getListaTarjetas().add(tarjetaAux);
			}
		}
		

		

		
	}
	
	public Pagina[] getArrayPaginas() {
		return arrayPaginas;
	}

	public void setArrayPaginas(Pagina[] arrayPaginas) {
		this.arrayPaginas = arrayPaginas;
	}

	public void visualizarAgenda() {
/*		for (int i = 0; i < arrayPaginas.length; i++) {
			System.out.println(arrayPaginas[i]);
		}*/
		
		for (Pagina pagina : arrayPaginas) {//es obligatorio poner implementen la clase?
			System.out.println(pagina);
		}

		
	}




	
	

}
