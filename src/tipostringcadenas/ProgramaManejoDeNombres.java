package tipostringcadenas;

public class ProgramaManejoDeNombres {

	public static void main(String[] args) {
		
		String nom1 = "Javier";
		String nom2 = "Karen";
		String nom3 = "Amanda";
		String resultado1 = "";
		String resultado2 = "";
		String resultado3 = "";
		
		String parte1 = nom1.substring(1);
		String parte2 = nom1.substring(4, 6);
		resultado1 = (parte1.toUpperCase().substring(0, 1).concat(".")+""+parte2);
		//System.out.println(resultado1);
		
		System.out.println();
		
		String parte3 = nom2.substring(1);
		String parte4 = nom2.substring(3, 5);
		resultado2 = (parte3.toUpperCase().substring(0, 1).concat(".")+""+parte4);
		//System.out.println(resultado2);
		
		System.out.println();
		
		String parte5 = nom3.substring(1);
		String parte6 = nom3.substring(4, 6);
		resultado3 = (parte5.toUpperCase().substring(0, 1).concat(".")+""+parte6);
		//System.out.println(resultado3);
		
		System.out.println(resultado1.concat("_")+""+resultado2.concat("_"+""+resultado3));
		
	}
}
