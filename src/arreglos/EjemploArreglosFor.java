package arreglos;

import java.util.Arrays;




public class EjemploArreglosFor {
	public static void main(String[] args)
	{
		
		String[] productos = new String[7];
		int total = productos.length;
		
		
		productos[0] = "AMD";
		productos[1] = "Hola";
		productos[2] = "Feliz";
		productos[3] = "Bueno";
		productos[4] = "Malo";
		productos[5] = "Profesional";
		productos[6] = "Intel";
		
		Arrays.sort(productos);
		
		System.out.println("Usando for");
		
		for (int i = 0; i < total; i++) {
			System.out.println("para indice " + i + " : " + productos[i]);
		}
		 System.out.println("usando foreach");
		
		for (String prod : productos) {
			System.out.println("prod = " + prod);
		}
		
		System.out.println("usando While");
		int i = 0;
		while (i < total) {
			System.out.println("para indice " + i + " : " + productos[i]);
			i++;
		}
	
	}	
}
