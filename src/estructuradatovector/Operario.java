package estructuradatovector;

import java.util.Scanner;

public class Operario {
	
	private Scanner teclado;
	private int[] sueldos;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese sueldos de operarios: ");
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void imprimirSueldo() {
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Los sueldos ingresados son: " + sueldos[i]);
		}
	}
	
	public static void main(String[] args) {
		Operario op = new Operario();
		op.cargar();
		op.imprimirSueldo();
	}

}
