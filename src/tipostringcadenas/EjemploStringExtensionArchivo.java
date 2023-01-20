package tipostringcadenas;

public class EjemploStringExtensionArchivo {

	public static void main(String[] args) {
		
		String archivo = "prueba.archivo.jsp";
		int i = archivo.indexOf(".");
		int e = archivo.lastIndexOf("."); //busca la ultima coincidencia
		System.out.println(archivo.length());
		System.out.println(archivo.substring(8));
		System.out.println(archivo.substring(i+1));
		System.out.println(archivo.substring(e+1));
		
	}
}
