package ejclases;

public class CuentaCorriente {
	String dni;
	String nombre;
	double saldo;

	public CuentaCorriente(String dni, double saldo) {
		super();
		if (nombre != null && !nombre.equals(" "))
		this.dni = dni;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();
		if (nombre != null && !nombre.equals(" "))
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public static boolean sacarDinero() {
		
	}
	
}

