package arreglos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PruebaList {

	public static void main(String[] args) throws IOException{
		
		List<String> lista = new ArrayList<>();
		
		lista.add("16329576");
		

		validarRut(lista);
	}
	
	public static void validarRut(List<String> rut) {
		
		for (String string : rut) {
			
		
		int vrut = 0;
		int factor;
		int suma;
		for (factor = 2, suma = 0; vrut > 0; factor++) {

			int digito = vrut % 10;
			vrut /= 10;
			suma += digito * factor;

			if (factor >= 7)
				factor = 1; // Para volver al ciclo

		}
		// Ahora viene el algoritmo del módulo 11

		int resto = suma % 11;
		int resultado = 11 - resto;

		// Mostramos por pantalla.
		// Si el resultado es menor que 10, se imprime el número.
		// Si es igual a 10, entonces se imprime "K"
		// Si no, entonces es 0

		System.out.println("El digito verificador es: " + resultado);

		if (resultado < 10) {
			System.out.println(resultado);
		} else if (resultado == 10) {
			System.out.println("K\n");
		} else
			System.out.println("0\n");
	}
}
}
