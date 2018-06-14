package agendaBasico;

import java.lang.reflect.Array;

public class Agenda {
	private Pagina[] arrayPaginas;

	public Agenda() {
		this.arrayPaginas = new Pagina[27];
		
		for (int i = 65; i <= 90; i++) {
			char inicial = (char)i;
			
			

			arrayPaginas[i-65]=new Pagina(inicial);
		

		}
		
		
	
	//	System.out.println(arrayPaginas[0].getCaracter());
		
		
		for (int  i = 65; i <= 90; i++) {
			System.out.println(arrayPaginas[i-65].getCaracter());
		}
	}


	

}
