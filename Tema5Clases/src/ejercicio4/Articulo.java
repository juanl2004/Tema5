package ejercicio4;

public class Articulo {
	
	/**
	 * Atributo para almacenar el nombre del articulo.
	 */
	private String nombre;
	
	/**
	 * Atributo para almacenar el precio del articulo.
	 */
	private double precio;	
	
	/**
	 * Atributo para almacenar cuantos articulos quedan.
	 */
	private int cuantosQuedan;
	
	/**
	 * Almacenamos como constante el IVA, siempre sera 21%.
	 */
	public static final double IVA = 21;
	

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre
	 * @param precio
	 * @param cuantosQuedan
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if (precio > 0) {
			this.precio = precio;
		}
		
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public static double getIva() {
		return IVA;
	}
	
	public void imprime() {
		System.out.println("¡ARTICULO!!!");
		System.out.println("Nombre del articulo --> " + this.nombre);
		System.out.println("Precio del articulo --> " + this.precio );
		System.out.println("Cuantos articulos quedan --> " + this.cuantosQuedan);
	}
	
	public double getPVP() {
		
		return (this.precio * (this.IVA/100)) + this.precio;
	}
	
	public double getPVPDescuento (double descuento) {
		
		return getPVP() - (getPVP() * descuento/100);
	}
	
	public boolean vender (int ventaR) {
		boolean venta = false;
		
		if (this.cuantosQuedan >= ventaR) {			
			this.cuantosQuedan -= ventaR;
			venta = true;
		}
		
		return venta;
	}
	
	public void almacenar (int nuevaCantidad) {
		if (nuevaCantidad > 0) {
			this.cuantosQuedan += nuevaCantidad;
		}
	}
}
