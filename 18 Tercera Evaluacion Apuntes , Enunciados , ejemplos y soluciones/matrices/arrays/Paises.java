package arrays;

public class Paises {

    public static void main(String[] args) {
        String[] listaPaises= {"Espa�a", "Francia", "Reino Unido", "Italia", "Alemania","Dinamarca"};
        
        int max =Integer.MIN_VALUE,posPai = -1;
        for (int i = 0; i < listaPaises.length; i++) {
            int puntuaciones =(int)(Math.random()*9+1);
            System.out.print(puntuaciones+" ");
            if (puntuaciones>max) {
                max=puntuaciones;
                 posPai = i;
                // listaPaises[posPai]=listaPaises[i];
            } else if (puntuaciones == max) {
                 listaPaises[posPai]+=" "+listaPaises[i]; 
            }
            //listaPaises[i]
        } 
        System.out.println(" max "+max);
        System.out.println("El ganador es "+listaPaises[posPai]);
    }

}



/*package arrays;

public class Paises {

	public static void main(String[] args) {
		String[] listaPaises= {"Espa�a", "Francia", "Reino Unido", "Italia", "Alemania","Dinamarca"};
		int max =Integer.MIN_VALUE,posPai = -1;
		for (int i = 0; i < listaPaises.length; i++) {
			int puntuaciones = (int)(Math.random()*9+1);
			System.out.print(puntuaciones+" ");
			if (puntuaciones>=max) {
				max=puntuaciones;
				 posPai = i;
				 listaPaises[posPai]+=" "+listaPaises[i];
			}
			//listaPaises[i]
		} 
		System.out.println(" "+max);
		System.out.println("El ganador es "+listaPaises[posPai]);
	}

}*/
/*

1.- En un campeonato participan los siguientes pa�ses: �Espa�a�, �Francia� �Reino Unido�, �Italia�, �Alemania� y �Dinamarca�.
Cada pa�s obtiene una puntuaci�n (entera entre 1 y 10 que se genera de forma aleatoria). 
Se pide calcular los pa�ses que han obtenido el primer y segundo premio. 
(Puede haber varios pa�ses con la misma puntuaci�n). Se pide resolver el problema usando  arrays.
Ejemplo: suponiendo que el orden de los pa�ses es el anterior y que las puntuaciones son  
respectivamente 8, 9, 5, 6, 7, 3 la salida ser�a:
Ganador del primer premio: Francia
Segundo premio: Espa�a


*/