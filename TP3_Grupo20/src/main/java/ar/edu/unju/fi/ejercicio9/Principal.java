package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList <Producto> productos = new ArrayList<Producto>();
		int op=0;
		
		
		while(op!=5) {
			System.out.println("- - - EJERCICIO 9 - - -\n");
			System.out.println("1. Nuevo producto");
			System.out.println("2. Mostrar todos los productos");
			System.out.println("3. Incrementar precio a todos los productos");
			System.out.println("4. Monto total de todos los productos");
			System.out.println("5. Salir");
			System.out.print("\nChoose Option: ");
			op=teclado.nextInt();
			System.out.println();
			switch(op) {
				case 1:
				{
					System.out.println("- - - AGREGAR PRODUCTO - - -\n");
					int codigo;double precio;String descripcion,marca;
					System.out.print("Codigo: ");
					codigo=teclado.nextInt();
					System.out.print("Precio: $");
					precio=teclado.nextDouble();
					System.out.print("Descripcion: ");
					descripcion=teclado.next();
					System.out.print("Marca: ");
					marca=teclado.next();
					Producto nuevoProducto = new Producto(codigo, descripcion, precio, marca);
					productos.add(nuevoProducto);
					System.out.println("\n - PRODUCTO AGREGADO -");
				}
				break;
				case 2:
				{
					System.out.println("- - - MOSTRAR - - -\n");
					for (Producto producto : productos) {
						System.out.println(producto.toString());
					}
				}
				break;
				case 3:
				{
					System.out.println("- - - INCREMENTAR - - -\n");
					double precio;
					for (Producto producto : productos) {
						precio=producto.getPrecio();
						producto.setPrecio(precio+100.25);
					}
					System.out.println("\n - PRODUCTOS INCREMENTADOS -");
				}
				break;
				case 4:
				{
					System.out.println("- - - MONTO TOTAL - - -\n");
					double precio=0;
					for (Producto producto : productos) {
						precio=precio+producto.getPrecio();
					}
					System.out.println("El monto total de todos los productos es: $"+precio);
				}
				break;
			}
			
			System.out.println();
		}
		
		
		teclado.close();
	}
}
