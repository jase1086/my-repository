package declaracionmetodo;

import java.util.Scanner;

public class TablaMultiplicar {

	private int dato;
	private Scanner teclado;
	
	public void cargarValor() {
	
		teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese valor: ");
			dato = teclado.nextInt();
			if (dato!= -1) {
				calcular(dato);
			}
		} while (dato!= -1);
	}

	private void calcular(int valor) {
		int contador = 0;
		for (int i = valor; i <= valor*10; i=i+valor) {
			contador = contador + 1;
			System.out.println(valor+"x"+contador+":"+i);
		}
		
	}
	public static void main(String[] args) {
		TablaMultiplicar tabla = new TablaMultiplicar();
		
		tabla.cargarValor();
		
	}
}
