package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int arreglo[] = new int[11];
		
		String resp ="s";
		
		System.out.println("- - - EJERCICIO 2 - - -\n");
		while(resp.equals("S") || resp.equals("s")) {
			boolean bandera=true;
			int numero=0;
			do {
				bandera=false;
				try {
					System.out.print("Ingrese un numero: ");
					numero=teclado.nextInt();
				}catch(Exception e) {
					bandera=true;
					teclado.nextLine(); //Esto limpia el buffer y permite el reingreso del numero
				}
				
				if(numero<1||numero>9) {
					bandera=true;
					System.out.println("Debe ingresar un numero en el rango del [1-9]");
				}
				
			}while(bandera==true);
			System.out.println();
			for (int i = 0; i <= 10; i++) {
				arreglo[i]=numero*i;
				System.out.println(numero+" x "+i+" = "+arreglo[i]);
			}

			System.out.print("\nDesea repetir el ejercicio S/N: ");
			resp = teclado.next();
		}

		teclado.close();
	}
}
