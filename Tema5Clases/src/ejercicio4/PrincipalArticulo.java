package ejercicio4;

import java.util.Scanner;

public class PrincipalArticulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nombre;
		double precio;
		int cuantosQuedan;
		
		System.out.println("Introduce el nombre del articulo --> ");
		nombre = sc.nextLine();
		
		System.out.println("Introduce el precio del articulo --> ");
		precio = sc.nextDouble();
		
		System.out.println("Introduce la cantidad de articulos --> ");
		cuantosQuedan = sc.nextInt();
		
		Articulo articulo1 = new Articulo(nombre, precio, cuantosQuedan);

		System.out.println("Informacion del Articulo 1 --> ");
		articulo1.imprime();
		
		System.out.println("Calculando el precio con IVA y descuento --> ");
		articulo1.getPVP();
		articulo1.getPVPDescuento(precio);
	}

}
