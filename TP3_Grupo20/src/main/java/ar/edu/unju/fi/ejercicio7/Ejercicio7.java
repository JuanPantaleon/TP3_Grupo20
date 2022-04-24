package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		char opc='s';
		int num;
		int indice=-1;
		do {
			System.out.print("Ingrese fruta: ");
			array.add(entrada.next());
			System.out.print("Desea ingresar otra fruta? s/n: ");
			opc=entrada.next().charAt(0);
		}while(opc=='s');
		
		for(String lista:array) {
			indice=array.indexOf(lista);
			if(indice%2==0) {
				System.out.println(lista);
			}
		}
		System.out.println("Ingrese un entero positivo: ");
		num=entrada.nextInt();
		if(num>0 && num<=indice+1) {
			for(String lista:array) {
				indice=array.indexOf(lista);
				if(indice+1==num) {
					array.remove(indice);
				}
			}
		}else {
			System.out.println("Valor ingresado incorrecto");
		}
		for(String lista:array) {
			System.out.println(lista);
		}
		entrada.close();
	}

}
