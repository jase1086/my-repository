package estructuradatovector;

import java.util.Scanner;

public class Problema1 {

	private int[] numeros;
	private Scanner teclado;
	
	public void iniciar() {
		teclado = new Scanner(System.in);
		numeros = new int[8];
		
		System.out.println("Ingrese 8 elementos en este programa: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese elemento: ");
			numeros[i] = teclado.nextInt();
		}
		calcularElemento();
	}

	private void calcularElemento() {
		int acumulado = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			acumulado = acumulado + numeros[i];
		}
		System.out.println("Valor acumulado es: " + acumulado);
		
		acumuladoMayor(acumulado);
	}
	
	private void acumuladoMayor(int acumulado) {
		if (acumulado > 36) {
			System.out.println("El acumulado es mayor a 36");
		} else {

		}
		cantidadMayor();
		
	}

	private void cantidadMayor() {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 50) {
				System.out.println("Cantidad es mayor a 50 es: " + numeros[i]);
			} else {

			}
		}
		
	}

	public static void main(String[] args) {
		Problema1 problema = new Problema1();
		problema.iniciar();
	}
}
