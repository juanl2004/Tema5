package ejercicio3;

/**
 * La clase punto representa un punto en un plano bidimensional.
 */
public class Punto {

	/**
	 * Atributo para alamacenar el valor de x.
	 */
	private int x;

	/**
	 * Atributo para almacenar el valor de y.
	 */
	private int y;

	/**
	 * Constructor con paramentros.
	 * 
	 * @param x Coordenada x del punto.
	 * @param y Coordenada y del punto.
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Obtiene la coordenada x del punto.
	 * 
	 * @return La coordenada x del punto.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Establece la coordenada x del punto.
	 * 
	 * @param x La nueva coordenada x del punto.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Obtiene la coordenada y del punto.
	 * 
	 * @return La coordenada y del punto.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Establece la coordenada y del punto.
	 * 
	 * @param y La nueva coordenada y del punto.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Método que imprime las coordenadas del punto en formato (x, y).
	 */
	public void imprime() {
		System.out.println("(" + x + ", " + y + ")");
	}

	/**
	 * Metodo para establecer las coordenadas del punto.
	 * 
	 * @param x La nueva coordenada x del punto.
	 * @param y La nueva coordenada y del punto.
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Método que desplaza el punto por las cantidades especificadas en dx y dy.
	 * 
	 * @param dx Desplazamiento en horizontal.
	 * @param dy Desplazamiento en vertical.
	 */
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	/**
	 * Método que calcula la distancia entre el punto actual y otro punto
	 * especificado.
	 * 
	 * @param p El otro punto.
	 * @return La distancia entre los dos puntos.
	 */
	public double distancia(Punto p) {
		// Diferencia horizontal entre las coordenadas x.
		int distanciax = this.x - p.x;
		// Diferencia vertical entre las coordenadas y.
		int distanciay = this.y - p.y;
		// Formula de la distancia.
		return Math.sqrt(distanciax * distanciax + distanciay * distanciay);
	}
}
