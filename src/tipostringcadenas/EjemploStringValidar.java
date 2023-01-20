package tipostringcadenas;

public class EjemploStringValidar {
	public static void main(String[] args) {

		String curso = null;

		boolean esNulo = curso == null;

		System.out.println("esNulo = " + esNulo);

		if (esNulo) {
			curso = "Programacion Java";// "Programacion Java";
		}

		boolean esVacio = curso.length() == 0;

		System.out.println("esVacio = " + esVacio);

		boolean esVacio2 = curso.isEmpty();

		System.out.println("esVacio2 = " + esVacio2);

		boolean esBlank = curso.isBlank();

		System.out.println("esBlank = " + esBlank);

		if (esBlank == false) {// forma mas estricta de validación
			System.out.println(curso.toUpperCase());
			System.out.println("Bienvenido al curso ".concat(curso));
		}
	}

}
