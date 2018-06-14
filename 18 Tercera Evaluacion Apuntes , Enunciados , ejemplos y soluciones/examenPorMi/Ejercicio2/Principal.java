package Ejercicio2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
//import Ejercicio2Bis.Alumno;
public class Principal {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Stack<Alumno> pilaAlumnos=new Stack<Alumno>();
		String cadena;
		Alumno a;
		Alumno a1;////


		for (int i = 0; i < 4; i++) {
				 a = new Alumno("alumno"+(i+1));
				pilaAlumnos.push(a);
				
		}
		System.out.println("Escribe el nombre de fichero");
		cadena=in.next();
		File f = new File(cadena);

	//	System.out.println(pilaAlumnos.toString());
		if (!(f.exists())) {
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			 a1 = new Alumno();
			
			System.out.println("No existe");
			DataOutputStream dos = new DataOutputStream(bos);
			while (!(pilaAlumnos.isEmpty())) {
				 a1=pilaAlumnos.pop();
				 a1.escribirRegistro(dos);
				 System.out.println(a1.toString()+"escritura");
			}
			System.out.println(dos.size());//bienalparecer
			dos.flush();
			dos.close();
	
		}
		
		
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);	
			DataInputStream din = new DataInputStream(bis);
			 a = new Alumno();
			 int c = 0;
			int suma=0,media = 0;
			while (din.available()>0) {
				a.leerRegistro(din);	
				if (a.getNota()>=5) {
					System.out.println(a.toString()+"lectura");
					c++;
					suma=suma+a.getNota();
					media=suma/c;
					
				}
				
				
			}
			System.out.println("La media es de los aprobados es "+media);
			din.close();
		
		
		in.close();
	}
}
