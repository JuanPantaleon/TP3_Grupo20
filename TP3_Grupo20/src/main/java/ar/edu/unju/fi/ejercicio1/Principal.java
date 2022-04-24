package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo1[] = new int [5];
		int arreglo2[] = new int [5];
		Scanner entrada = new Scanner(System.in);
		System.out.println("PRIMER ARREGLO");
		for(int i=0;i<=arreglo1.length-1;i++) {
			System.out.print("Ingrese valor : ");
			arreglo1[i]=entrada.nextInt();
		}
		System.out.println("SEGUNDO ARREGLO");
		for(int i=0;i<=arreglo2.length-1;i++) {
			System.out.print("Ingrese valor: ");
			arreglo2[i]=entrada.nextInt();
		}
		division(arreglo1,arreglo2);
		entrada.close();
	}
	
	public static void division(int[] arreglo1,int[] arreglo2) {
		float result=0;
		for(int i=0;i<=arreglo1.length-1;i++) {
			try {
				result=arreglo1[i]/arreglo2[i];
			}catch (ArithmeticException ae) {
				System.out.println("No se puede realizar la division, causa: "+ae.getMessage());
			}finally {
				System.out.println("Fin de la division: "+result);
			}
				
		}
		
	}

}
