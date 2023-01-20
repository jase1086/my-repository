package tipostringcadenas;

public class EjemploStringArreglo {
	
	public static void main(String[] args) {
		
		String pasapalabras = "pasapalabras";
		System.out.println(pasapalabras.length());
		System.out.println(pasapalabras.toCharArray());
		
		char [] arreglo = pasapalabras.toCharArray();
		
		System.out.println(arreglo);
		System.out.println(arreglo.length);
		int largo = arreglo.length;
		
		for (int i = 0; i < largo; i++) {
			System.out.println(arreglo[i]);
		}
		System.out.println();

		System.out.println(pasapalabras.split("a")); // [.] ; \\.
		
		String [] arreglo2 = pasapalabras.split("a");
		
		int l = arreglo2.length;
		
		for (int i = 0; i < l; i++) {
			System.out.println(arreglo2[i]);
		}
		
		System.out.println();
		
		String archivo = "prueba.archivo.jsp12341243124";
		
		String [] archivoArra = archivo.split("[.]");
		
		
		int largo2 = archivoArra.length;
		
		for (int f = 0; f < largo2; f++) {
			System.out.println(archivoArra[f]);
		}
		
		System.out.println("*****");
		System.out.println(archivoArra[largo2-1]);
		
		
	}

}
