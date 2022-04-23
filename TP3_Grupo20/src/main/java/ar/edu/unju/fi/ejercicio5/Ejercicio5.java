package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String frase=sc.nextLine();
		char[] arreglochar= new char [frase.length()];
		for(int i=frase.length()-1, j=0; i>=0; i--,j++){
			arreglochar[j]=frase.charAt(i);
		}
		for (int i = 0; i < arreglochar.length; i++) {
			System.out.print(arreglochar[i]);
		}
	}

}
