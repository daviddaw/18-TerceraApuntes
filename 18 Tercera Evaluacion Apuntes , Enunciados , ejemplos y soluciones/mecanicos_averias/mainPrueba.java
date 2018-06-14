
public class mainPrueba {

	public static void main(String[] args) {
		ColeccionVehEspera colePrueba = new ColeccionVehEspera();
		ColeccionVehReparacion colRepPrue=new ColeccionVehReparacion();
		// TODO Auto-generated method stub
		
/*		Vehiculo v1 = new Vehiculo("matricula1");
		Vehiculo v2 = new Vehiculo("matricula2");
		Vehiculo v3 = new Vehiculo("matricula3");
		Vehiculo v4 = new Vehiculo("matricula4");
		Vehiculo v5 = new Vehiculo("matricula5");
		*/
		Coche c1 = new Coche("CO-001",5);
		Coche c2 = new Coche("CO-002",5);
		Coche c3 = new Coche("CO-003",5);
		Motocicleta m1 =new Motocicleta("MO-001", 100);
		Motocicleta m2 =new Motocicleta("MO-001", 100);
		Motocicleta m3 =new Motocicleta("MO-001", 100);



     	

        colePrueba.insertarCola2(c1);
        colePrueba.insertarCola(c2);
        colePrueba.insertarCola2(c3);
        colePrueba.insertarCola(m1);
        colePrueba.recorrerEspera();
       
        
        System.out.println("element"+colePrueba.colaEspera.element());
             	//Vehiculo vEnc =colePrueba.buscar(v5);
             	Vehiculo vEnc =colePrueba.buscar(m1);
             	if (vEnc==null) {
					System.out.println("El vehiculo no estaba en la lista");
				}else {
					System.out.println(vEnc.toString()+" encontrado");
				}
     	

       System.out.println( colePrueba.longitud());

        colePrueba.colaEspera.remove(c1);
        colePrueba.colaEspera.remove(c2);
        
        colRepPrue.listaReparacion.add(c1);
        colRepPrue.listaReparacion.add(c2);
        colRepPrue.listaReparacion.add(c3);
        colRepPrue.listaReparacion.add(m1);
        colRepPrue.listaReparacion.add(m2);
        System.out.println("for");
        colRepPrue.recorrerReparacion();
		System.out.println("Iterator");
	colRepPrue.iterator();

	}

}
