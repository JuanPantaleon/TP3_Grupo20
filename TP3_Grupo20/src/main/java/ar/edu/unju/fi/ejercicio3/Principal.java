package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("- - - EJERCICIO 3 - - -\n");
		
		System.out.print("Ingrese el nombre: ");
		String nombre=teclado.next();
		System.out.print("Ingrese el Apellido: ");
		String apellido=teclado.next();
		System.out.print("Ingrese Libreta Universitaria: ");
		int lu = teclado.nextInt();
		
		Alumno alumno = new Alumno(nombre,apellido,lu);
		
		double nota;
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingrese nota ["+i+"]: ");
			nota=teclado.nextDouble();
			alumno.setNotas(nota, i);
		}
		
		System.out.println();
		System.out.println(alumno.toString());
		System.out.println("El promedio es: "+alumno.calcularPromedio());
		System.out.println("La nota más alta es: "+alumno.obtenerNotaMaxima());
		
		teclado.close();
	}
}
