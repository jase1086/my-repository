package arreglos;

import java.util.Arrays;



public class EjemploArreglos {
	public static void main(String[] args)
	{
		
		String[] productos = new String[7];
		
		productos[0] = "AMD";
		productos[1] = "Hola";
		productos[2] = "Feliz";
		productos[3] = "Bueno";
		productos[4] = "Malo";
		productos[5] = "Profesional";
		productos[6] = "Intel";
	
		
		Arrays.sort(productos);
		
		String a = productos[0];
		String b = productos[1];
		String c = productos[2];
		String d = productos[3];
		String e = productos[4];
		String f = productos[5];
		String g = productos[6];
		
		System.out.println("Producto [0] " + a);
		System.out.println("Producto [1] " + b);
		System.out.println("Producto [2] " + c);
		System.out.println("Producto [3] " + d);
		System.out.println("Producto [4] " + e);
		System.out.println("Producto [5] " + f);
		System.out.println("Producto [6] " + g);
		
		int[] numeros = new int[4];
		
		numeros[0] = 1;
		numeros[1] = Integer.valueOf("7");
		numeros[2] = 3;
		numeros[3] = 4;
		
		Arrays.sort(numeros);
		
		int i = numeros[0];
		int j = numeros[1];
		int k = numeros[2];
		int l = numeros[3];
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("l = " + l);
	}

}
