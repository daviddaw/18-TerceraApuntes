package conArrayList_Vector_Comparable_comparator;

import java.util.Comparator;

public class OrdenarPrimeroSueldo_despuesCodigoComparableComparator implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		if ((o1.getSueldo()==o2.getSueldo())) {//(a sueldos iguales, por código de empleado)
			
			return o1.getCodigo().compareToIgnoreCase(o2.getCodigo());//he usado compareTo
		}
	
		else if ((o1.getSueldo()>o2.getSueldo())) {
			return 1;
		}
		
		else /*((o1.getSueldo()<o2.getSueldo()))*/ {
			return -1;
		}
		

		
		
	
		
	}

}
