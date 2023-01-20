package estructuradatovector;

import java.util.Scanner;

/*Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos. 
Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño. 
Sumar componente a componente.*/

public class Problema2 {

	private Scanner teclado;
	private int[] elemento1;
	private int[] elemento2;
	private int[] sumaVector;
	
	public void inicializador() {
		teclado = new Scanner(System.in);
		elemento1 = new int[4];
		elemento2 = new int[4];
		
		System.out.println("ingrese 4 elementos del primer vector: ");
		for (int i = 0; i < elemento1.length; i++) {
			System.out.println("Ingrese elemento: ");
			elemento1[i] = teclado.nextInt();
		}
		System.out.println("ingrese 4 elementos del segundo vector: ");
		for (int i = 0; i < elemento2.length; i++) {
			System.out.println("Ingrese elemento: ");
			elemento2[i] = teclado.nextInt();
		}
	}
	
	public void sumaVector() {
		int vector1 = 0;
		int vector2 = 0;
		sumaVector = new int[4];
		for (int i = 0; i < elemento1.length; i++) {
			vector1 = vector1 + elemento1[i];
		}
		for (int i = 0; i < elemento2.length; i++) {
			vector2 = vector2 + elemento2[i];
		}
		
		for (int i = 0; i < sumaVector.length; i++) {
			sumaVector[i] = vector1 + vector2;
			System.out.println("La suma de ambos vector es: " + sumaVector[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		Problema2 vector = new Problema2();
		vector.inicializador();
		vector.sumaVector();
	}
}
