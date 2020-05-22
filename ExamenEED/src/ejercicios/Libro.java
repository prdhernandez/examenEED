package ejercicios;

/**
 * Esta clase representa un libro
 * 
 * @version 1.0
 * @author Paula Rodriguez
 */

public class Libro {
	String titulo;
	String ISBN;
	String autor;
	String editorial;

	public Libro(String titulo, String ISBN, String autor, String editorial)

	{
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autor = autor;
		this.editorial = editorial;
	}

	/**
	 * Metodo que sirve para comprobar si su isbn de 10 numeros es correcto
	 * 
	 * @return boolean verdaero/falso
	 */
	public boolean checkISBN10() {
		boolean result = false;
		int calculo = 0;
		int dc = 0;
		if (this.ISBN.length() == 10) {
			for (int i = 0; i < 9; i++) {
				int pos = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(i)));
				calculo += pos * (i + 1);
			}

			if (this.ISBN.charAt(9) == 'X')
				dc = 10;
			else
				dc = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(9)));

			if (calculo % 11 == dc)
				result = true;
		}

		return result;
	}

	/**
	 * Metodo que sirve para comprobar si su isbn de 13 numeros es correcto
	 * 
	 * @return boolean verdaero/falso
	 */
	public boolean checkISBN13() {
		boolean result = false;
		int pares = 0;
		int impares = 0;

		if (this.ISBN.length() == 13) {
			for (int i = 0; i < 13; i++) {
				int pos = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(i)));
				if ((i + 1) % 2 == 0)
					pares += pos;
				else
					impares += pos;

			}

			if ((impares + 3 * pares) % 10 == 0)
				result = true;
		}

		return result;
	}
}
