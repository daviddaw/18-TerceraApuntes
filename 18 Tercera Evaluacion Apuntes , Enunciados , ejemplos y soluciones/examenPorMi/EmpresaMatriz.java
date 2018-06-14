
public class EmpresaMatriz {

	public static void main(String[] args) {
		int[] clientes = new int[7];
		String[] seguros = {"VIDA", "HOGAR", "COCHE","DESEMPLEO", "JUBILACIÓN"};

		int[][] precioSeguro=new int[7][5];
		 for (int i = 0; i < precioSeguro.length; i++) {
			for (int j = 0; j < precioSeguro[i].length; j++) {
				precioSeguro[i][j]=(int) (Math.random()*9);	
				}
		}
		
		 for (int i = 0; i < precioSeguro.length; i++) {
			 System.out.println(" ");
			for (int j = 0; j < precioSeguro[i].length; j++) {
				
				System.out.print(precioSeguro[i][j]+" ");
				}	
		}

		 for (int i = 0; i < precioSeguro.length; i++) {
			 System.out.println(" ");
			 int pos=0;
			 int max=Integer.MIN_VALUE;
			 for (int j = 0; j < precioSeguro[0].length; j++) {
				 if (precioSeguro[i][j]>max) {
					 max=precioSeguro[i][j];
					 pos = j;
				 }
			 }
			 System.out.println("PosicionSEguro"+pos);
			 System.out.println(max);
			 System.out.println("cliente"+(i+1)+" "+seguros[pos]);
		 }
		 
		 
		 
			
			/*for (int j = 0; j < clientes.length; j++) {
				
			}
			System.out.println(seguros[pos]);
*/
			
			
		}
		 
		 

}