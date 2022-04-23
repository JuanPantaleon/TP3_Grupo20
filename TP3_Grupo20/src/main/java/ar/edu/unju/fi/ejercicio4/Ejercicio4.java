package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int [] numeros = new int [8];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Ingresa un numero para la posicion " + i + " del arreglo: ");
			numeros[i]= sc.nextInt();
		}
		for (int i : numeros) {
			if(i%2==0) {
				System.out.println("El numero " + i + " es par ");
			}else
				System.out.println("El numero " + i + " es impar ");
		}
	}
}
