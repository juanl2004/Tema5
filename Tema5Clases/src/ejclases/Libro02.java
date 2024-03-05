package ejclases;

public class Libro02 {

	private String titulo = "";
	private String autor = "";
	private int ejemplaresL;
	private int ejemplaresP;

	public Libro02() {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplaresL = ejemplaresL;
		this.ejemplaresP = ejemplaresP;
	}

	public Libro02(String titulo, String autor, int ejemplaresL, int ejemplaresP) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplaresL = ejemplaresL;
		this.ejemplaresP = ejemplaresP;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplaresL() {
		return ejemplaresL;
	}

	public void setEjemplaresL(int ejemplaresL) {
		this.ejemplaresL = ejemplaresL;
	}

	public int getEjemplaresP() {
		return ejemplaresP;
	}

	public void setEjemplaresP(int ejemplaresP) {
		this.ejemplaresP = ejemplaresP;
	}

	public boolean prestamo() {

		if (this.ejemplaresL > this.ejemplaresP) {
			this.ejemplaresP += 1;
			return true;
		} else {
			
		}

	}

}
