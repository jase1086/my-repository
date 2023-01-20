package tipostringcadenas;

public class EjemploStringMetodos {
	public static void main(String[] args) {

		String palabra = "palabras";
		System.out.println("Mostrar posición: " + palabra.indexOf("s"));
		System.out.println("Mostrar posición: " + palabra.substring(2));
		System.out.println("Mostrar posición: " + palabra.substring(2,8));
		System.out.println("Mostrar posición: " + palabra.length());
		System.out.println("Mostrar posición: " + palabra.charAt(0));
		System.out.println("Mostrar posición: " + palabra.toLowerCase());
		System.out.println("Mostrar posición: " + palabra.toUpperCase());
		System.out.println("Mostrar posición: " + palabra.toString());
	}
}
