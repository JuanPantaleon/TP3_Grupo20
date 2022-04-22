package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("- - - EJERCICIO 6 - - -\n");
		int arreglo[] = new int [10];

		for (int i = 0; i<10 ; i++) {
			boolean bandera=true;
			do {
				bandera=false;
				try {
					System.out.print("Ingrese un numero ["+i+"]: ");
					arreglo[i]=teclado.nextInt();
				} catch (Exception e) {
					bandera=true;
					teclado.nextLine();
				}
			}while(bandera);
		}
		
		System.out.println();
		
		for (int i = arreglo.length-1; i>=0; i--) {
			System.out.println("Arreglo ["+i+"]: "+arreglo[i]);
		}

		teclado.close();
	}
}
