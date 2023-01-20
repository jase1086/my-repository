//package arreglos;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ValidarRut {
//
//	public static void main(String[] args) throws IOException {
//
//		int rut, digito, suma, resto, resultado, factor;
//		String rutString;
//
//		// Para el manejo de entrada estándar
//		InputStreamReader e = new InputStreamReader(System.in);
//		BufferedReader ingreso = new BufferedReader(e);
//	
//
////		do {
////			System.out.println("-------------->VALIDADOR DE RUT <---------------");
////			System.out.println("Ingrese rut sin digito verificador y sin puntos ni guion:");
////
////			
////
////			rutString = ingreso.readLine();
////			rut = Integer.parseInt(rutString);
////
////		} while (rut <= 0); // Iteración
//
//		// Ahora viene la parte de extraer dígito por dígito el rut
//
//		for (factor = 2, suma = 0; rut > 0; factor++) {
//
//			digito = rut % 10;
//			rut /= 10;
//			suma += digito * factor;
//
//			if (factor >= 7)
//				factor = 1; // Para volver al ciclo
//
//		}
//		// Ahora viene el algoritmo del módulo 11
//
//		resto = suma % 11;
//		resultado = 11 - resto;
//
//		// Mostramos por pantalla.
//		// Si el resultado es menor que 10, se imprime el número.
//		// Si es igual a 10, entonces se imprime "K"
//		// Si no, entonces es 0
//
//		System.out.println("El digito verificador es: " + rutString + "" + resultado);
//
//		if (resultado < 10) {
//			System.out.println(resultado);
//		} else if (resultado == 10) {
//			System.out.println("K\n");
//		} else
//			System.out.println("0\n");
//
//	}
//
//}