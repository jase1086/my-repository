package javaya;

import java.util.Scanner;

public class Persona {
		
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public Persona() {}
	
	public void datos()
	{
		teclado = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre = teclado.next();
		System.out.println("Ingrese edad: ");
		edad = teclado.nextInt();
		
	}
	
	public void validarEdad() 
	{
		if(edad >= 18) 
		{
			imprimir();
		}else
		{
			System.out.println("eres menor de edad");
		}
	}
	
	public void imprimir() 
	{
		System.out.println("Eres mayor de edad");
	}
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		
		persona1.datos();
		persona1.validarEdad();
	}
}

