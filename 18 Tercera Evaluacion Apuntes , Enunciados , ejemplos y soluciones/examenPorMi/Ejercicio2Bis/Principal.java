package Ejercicio2Bis;
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
import Ejercicio2Bis.Alumno;
public class Principal {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Stack<Alumno> pilaAlumnos=new Stack<Alumno>();
		String cadena;
		Alumno a;
		Alumno a1;

		for (int i = 0; i < 4; i++) {
			// a1 = new Alumno("alumno"+(i+1));
			 a =new Alumno("alumno"+(i+1));
			pilaAlumnos.push(a);		
	}
		System.out.println("Escribe el nombre de fichero");
		cadena=in.next();
		File f = new File(cadena);

		//	System.out.println(pilaAlumnos.toString());
		if (!(f.exists())) {
			FileOutputStream fos = new FileOutputStream(f);
			//BufferedOutputStream bos = new BufferedOutputStream(fos);
			a1 = new Alumno();
			
			System.out.println("No existe");
			 DataOutputStream dos = new DataOutputStream(fos);
			 while (!(pilaAlumnos.isEmpty())) {
					 a1=pilaAlumnos.pop();
					 a1.escribirRegistro(dos);
					 System.out.println(a1.toString()+"e");
				}
				System.out.println(dos.size());
				
				dos.flush();
				dos.close();
			 //
		}
		

	
		///////Input
			FileInputStream fin = new FileInputStream(f);
			//BufferedInputStream bis = new BufferedInputStream(fis);	
			DataInputStream din = new DataInputStream(fin);
			 a = new Alumno();
			
			while (din.available()>0) {
				a.leerRegistro(din);	
				System.out.println(a.toString()+"l");
			}
			din.close();
		
		
		in.close();
	}
}
//	System.out.println(pilaAlumnos.toString());
/*		if (!(f.exists())) {
		FileOutputStream fos = new FileOutputStream(f);
		//BufferedOutputStream bos = new BufferedOutputStream(fos);
		Alumno a1 = new Alumno();
		System.out.println("No existe");
		DataOutputStream dos = new DataOutputStream(fos);
		while (!(pilaAlumnos.isEmpty())) {
			 a1=pilaAlumnos.pop();
			 a1.escribirRegistro(dos);
		}
		System.out.println(dos.size());
		dos.flush();
		dos.close();
	System.out.println(a1.getNota());
	}*/
	//Output
/*	FileOutputStream fos=new FileOutputStream(f);
 a =new Alumno("alumno1");
	DataOutputStream dos=new DataOutputStream(fos);
	a.escribirRegistro(dos);
	dos.flush();
	dos.close();
	System.out.println(a.toString()+"e");*/