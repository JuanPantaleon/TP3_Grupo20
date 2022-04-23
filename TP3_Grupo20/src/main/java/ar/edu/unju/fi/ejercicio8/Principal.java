package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;

public class Principal {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		double [] notas = new double[5];

		int op=0;
		while(op!=6) {
			System.out.println("- - - EJERCICIO 8 - - -\n");
			System.out.println("1. Nuevo alumno");
			System.out.println("2. Eliminar alumno");
			System.out.println("3. Modificar notas alumnos");
			System.out.println("4. Mostrar todos los alumnos");
			System.out.println("5. Alumnos que superan el promedio de 6");
			System.out.println("6. Salir\n");
			System.out.print("Choose Option: ");
			op=teclado.nextInt();

			switch(op) {
			case 1:
			{
				cargarAlumno(alumnos);
			}
			break;
			case 3:
			{
				modificarAlumno(alumnos);
			}
			break;
			case 2:
				eliminarAlumno(alumnos);
			break;
			case 4:
				System.out.println("\n- - - MOSTRAR - - -\n");

				for (Alumno alumno : alumnos) {
					System.out.println(alumno.toString()+"\n");
				}
			break;
			case 5:
				System.out.println("\n- - - MOSTRAR - - -\n");
				for (Alumno alumno : alumnos) {
					if(alumno.calcularPromedio()>=6) {
						System.out.println(alumno.toString()+"\n");
					}
				}
			break;
			}
		}

		teclado.close();
	}
	
	public static void cargarAlumno(ArrayList<Alumno> alumnos) {
		Scanner teclado = new Scanner(System.in);
		double [] notas = new double[5];
		System.out.println("\n- - - AGREGAR - - -\n");

		System.out.print("Ingrese el nombre: ");
		String nombre=teclado.next();
		System.out.print("Ingrese el Apellido: ");
		String apellido=teclado.next();
		System.out.print("Ingrese Libreta Universitaria: ");
		int lu = teclado.nextInt();

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Ingrese nota ["+i+"]: ");
			notas[i]=teclado.nextDouble();
		}

		Alumno nuevoAlumno = new Alumno(nombre, apellido, lu, notas);	
		alumnos.add(nuevoAlumno);
		System.out.println("\n - Alumno Agregado - \n");
		
	}
	
	public static void modificarAlumno(ArrayList<Alumno> alumnos) {
		Scanner teclado = new Scanner(System.in);
		double [] notas = new double[5];
		System.out.println("\n- - - MODIFICAR - - -\n");

		System.out.print("Ingrese LU de alumno a modificar: ");
		int lu = teclado.nextInt();
		int indice=-1;

		for (Alumno alumno : alumnos) {
			if(alumno.getLibretaUniversitaria()==lu) {
				indice = alumnos.indexOf(alumno);
			}
		}

		if(indice >= 0) {
			Alumno nuevoAlumno = alumnos.get(indice);
			for (int i = 0; i < notas.length; i++) {
				System.out.print("Ingrese nota ["+i+"]: ");
				notas[i]=teclado.nextDouble();
			}
			nuevoAlumno.setNotas(notas);
			alumnos.set(indice, nuevoAlumno);
			System.out.println("\n - Alumno Modificado - \n");
		}
	}
	
	public static void eliminarAlumno(ArrayList<Alumno> alumnos) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n- - - ELIMINAR - - -\n");

		System.out.print("Ingrese LU de alumno a eliminar: ");
		int lu = teclado.nextInt();
		int indice=-1;

		for (Alumno alumno : alumnos) {
			if(alumno.getLibretaUniversitaria()==lu) {
				indice = alumnos.indexOf(alumno);
			}
		}

		if(indice >= 0) {
			alumnos.remove(indice); //Eliminar por Indice 
			System.out.println("\n - Alumno Eliminado - \n");
		}
	}
	

}
