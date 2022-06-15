package variables;

public class PrimitivosCaracteres {

	public static void main(String[] args) {
		char caracter = '\u0040';
		var decimal = 64;
		System.out.println("caracter = " + caracter);
		System.out.println("decimal = " + decimal);
		System.out.println("decimal = caracter : " + (decimal == caracter));
		System.out.println("");
		var simbolo = '@';
		System.out.println("simbolo = " + simbolo);
		System.out.println("simbolo = caracter : " + (simbolo == caracter));
		System.out.println("");
		
		char espacio = '\u0020';
		char retroceso = '\b';
		char tabulador = '\t';
		char nuevaLinea = '\n';
		char retornoCarro = '\r';
		
		System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
		System.out.println("char corresponde en bite: " + Character.SIZE);
		System.out.println("char corresponde en byte: " + Character.MAX_VALUE);
		System.out.println("char corresponde en byte: " + Character.MIN_VALUE);
	}
}
