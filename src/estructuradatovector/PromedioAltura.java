package estructuradatovector;

import java.util.Scanner;

public class PromedioAltura {

	private float[] altura;
	private Scanner ingreso;
	private float promedio;
	
	public void cargarDatos() {
		altura = new float[5];
		ingreso = new Scanner(System.in);
		for (int i = 0; i < altura.length; i++) {
			System.out.println("Ingrese altura de una persona: ");
			altura[i] = ingreso.nextFloat();
		}
	}
	
	public void calcularPromedio() {
		float suma = 0;
		for (int i = 0; i < altura.length; i++) {
			suma = suma + altura[i];
			
		}
		promedio = suma / 5;
		System.out.println("El promedio de altura es: " + promedio);
		
		
	}
	
	public void altoBajo() {
		 int alto = 0;
		 int bajo = 0;
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] > promedio) {
				alto++;
			} else if(altura[i] < promedio) {
				bajo++;
			}
		}
		System.out.println("La altura más alta es: " + alto);
		System.out.println("La altura más baja es: " + bajo);
	}
	
	public static void main(String[] args) {
		PromedioAltura pa = new PromedioAltura();
		pa.cargarDatos();
		pa.calcularPromedio();
		pa.altoBajo();
	}
	
}
