package ejercicio3;

public class PrincipalPunto {

	public static void main(String[] args) {
		
		// Creamos dos objetos.
		Punto punto1 = new Punto(3, 4);
		Punto punto2 = new Punto(8, 10);

		// Mostramos la información de los puntos creados.
		System.out.println("Información del primer punto:");
		punto1.imprime();
		System.out.println("Información del segundo punto:");
		punto2.imprime();
		System.out.println();

		// Modificamos las coordenadas del primer punto.
		punto1.setX(3);
		punto1.setY(5);

		// Mostramos la nueva información del primer punto.
		System.out.println("Nueva información del primer punto:");
		punto1.imprime();
		System.out.println();

		// Desplazamos el segundo punto.
		punto2.desplaza(-1, 3);

		// Mostramos la nueva información del segundo punto.
		System.out.println("Nueva información del segundo punto:");
		punto2.imprime();
		System.out.println();

		// Calculamos la distancia entre los dos puntos.
		double distancia = punto1.distancia(punto2);
		System.out.println("La distancia entre los dos puntos es: " + distancia);

	}

}
