package estructuradatovector;

import java.util.Scanner;

public class EmpresaTurno {

	private Scanner teclado;
	private float[] turnoMan;
	private float[] turnoTard;
	
	public void iniciar() {
		teclado = new Scanner(System.in);
		turnoMan = new float[4];
		turnoTard = new float[4];

			System.out.println("Ingrese empleado turno de mañana: ");
			for (int i = 0; i < turnoMan.length; i++) {
				System.out.println("Ingrese sueldo: ");
				turnoMan[i] = teclado.nextFloat();
			}
		
			System.out.println("Ingrese empleado turno de tarde: ");
			for (int f = 0; f < turnoTard.length; f++) {
				System.out.println("Ingrese sueldo: ");
				turnoTard[f] = teclado.nextFloat();
			}
	}
	
	public void turnoManTard() {
		float man = 0;
		float tard = 0;
		
		for (int i = 0; i < turnoMan.length; i++) {
			man = man + turnoMan[i];
		}
		for (int f = 0; f < turnoTard.length; f++) {
			tard = tard + turnoTard[f];
		}
		imprimir(man,tard);
	}
	
	public void imprimir(float man, float tard) {
		
		System.out.println("Los gastos de los sueldos de los empleados de turno de mañana son: " + man);
		System.out.println("Los gastos de los sueldos de los empleados de turno de tarde son: " + tard);
	}
	
	public static void main(String[] args) {
		EmpresaTurno turnos = new EmpresaTurno();
		turnos.iniciar();
		turnos.turnoManTard();
		//turnos.imprimir(0, 0);
	}
}
