package tipostringcadenas;

public class EjemploStringMetodos {
	public static void main(String[] args) {

		String palabra = "palabras";
		System.out.println("Mostrar posici�n: " + palabra.indexOf("s"));
		System.out.println("Mostrar posici�n: " + palabra.substring(2));
		System.out.println("Mostrar posici�n: " + palabra.substring(2,8));
		System.out.println("Mostrar posici�n: " + palabra.length());
		System.out.println("Mostrar posici�n: " + palabra.charAt(0));
		System.out.println("Mostrar posici�n: " + palabra.toLowerCase());
		System.out.println("Mostrar posici�n: " + palabra.toUpperCase());
		System.out.println("Mostrar posici�n: " + palabra.toString());
	}
}
