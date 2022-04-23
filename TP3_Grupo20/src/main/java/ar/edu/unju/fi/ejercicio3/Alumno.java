package ar.edu.unju.fi.ejercicio3;

import java.util.Arrays;

public class Alumno {
	private String nombre;
	private String apellido;
	private int libretaUniversitaria;
	private double [] notas = new double [5];
	
	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularPromedio() {
		double promedio=0;
		for (int i = 0; i < notas.length; i++) {
			promedio=promedio+notas[i];
		}
		promedio=promedio/notas.length;
		return promedio;
	}
	
	public double obtenerNotaMaxima() {
		double max=notas[0];
		for (int i = 0; i < notas.length; i++) {
			if(max<notas[i]) {
				max=notas[i];
			}
		}
		return max;
	}

	public void setNotas(double nota, int indice) {
		this.notas[indice] = nota;
	}
	
	public void mostrarNotas() {
		System.out.println(Arrays.toString(this.notas));
//		for(double iterado:this.notas) {
//			System.out.println(iterado);
//		}
		
	}

	public Alumno(String nombre, String apellido, int libretaUniversitaria, double[] notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libretaUniversitaria = libretaUniversitaria;
		this.notas = notas;
	}

	public Alumno(String nombre, String apellido, int libretaUniversitaria) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libretaUniversitaria = libretaUniversitaria;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\nLibreta Universitaria: " + libretaUniversitaria;
	}
}
