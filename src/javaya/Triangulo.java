package javaya;

import java.util.Scanner;

public class Triangulo {

	private Scanner teclado;
	private int lado1;
	private int lado2;
	private int lado3;
	
	public void inicializar() 
	{
		teclado = new Scanner(System.in);
		lado1 = 0;
		lado2 = 0;
		lado3 = 0;
		System.out.println("Ingrese lado 1 de un triangulo: ");
		lado1 = teclado.nextInt();
		System.out.println("Ingrese lado 2 de un triangulo: ");
		lado2 = teclado.nextInt();
		System.out.println("Ingrese lado 3 de un triangulo: ");
		lado3 = teclado.nextInt();
	}
	
	public void imprimir() 
	{
		if (lado1 > lado2 && lado1 > lado3) {
			System.out.println("El lado mayor es: " + lado1);
		}else if(lado2 > lado1 && lado2 > lado3) {
			System.out.println("El lado mayor es: " + lado2);
		}else{
			System.out.println("El lado mayor es: " + lado3);
		}
			
	}
	
	public void trianguloEquilatero() {
		
		
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Triangulo equilatero");
		}else {
			System.out.println("triangulo no equilatero");
		}
	}
	
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		
		triangulo.inicializar();
		triangulo.imprimir();
		triangulo.trianguloEquilatero();
	}
}
