package declaracionmetodo;

import java.util.Scanner;

public class Test {

	private Scanner teclado;
	private int val1;
	private int val2;
	private int val3;
	
	
	public void inicializar() 
	{
		teclado = new Scanner(System.in);
		System.out.println("ingreso primer valor: ");
		val1 = teclado.nextInt();
		System.out.println("ingreso segundo valor: ");
		val2 = teclado.nextInt();
		System.out.println("ingreso tercer valor: ");
		val3 = teclado.nextInt();
		imprimirMayorMenor(val1,val2,val3);
	}

	private int imprimirMayorMenor(int v1, int v2, int v3) {
		int ret;
		if (v1 > v2 && v1 > v3) {
			System.out.println("El primer valor es el mayor: " + v1);
			ret = v1;
		}else if(v2 > v1 && v2 > v3){
			System.out.println("El segundo valor es el mayor: " + v2);
			ret = v2;
		}else {
			System.out.println("El tercer valor es el mayor: " + v3);
			ret = v3;
		}
		
		if (v1 < v2 && v1 < v3) {
			System.out.println("El primer valor es el menor: " + v1);
			ret = v1;
		}else if(v2 < v1 && v2 < v3){
			System.out.println("El segundo valor es el menor: " + v2);
			ret = v2;
		}else {
			System.out.println("El tercer valor es el menor: " + v3);
			ret = v3;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.inicializar();
		
	}

	
}
