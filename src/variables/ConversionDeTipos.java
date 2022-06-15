package variables;

public class ConversionDeTipos {
	public static void main(String[] args) {
		String numeroStr = "50";
		
		int numeroInt = Integer.parseInt(numeroStr);
		System.out.println("numeroInt = " +numeroInt);
		
		String realStr = "98765.43";
		double realDouble = Double.parseDouble(realStr);
		System.out.println("realDouble = " + realDouble);
		
		String logicoStr = "true";
		boolean realBool = Boolean.parseBoolean(logicoStr);
		System.out.println("realBool = " + realBool);
		
		int otroNumeroInt = 100;
		
		System.out.println("otroNumeroInt = " + otroNumeroInt);
		
		String otroNumeroStr = Integer.toString(otroNumeroInt);
		
		System.out.println("otroNumeroStr = " + otroNumeroStr);
		
		otroNumeroStr = String.valueOf(otroNumeroInt);
		
		System.out.println("otroNumeroStr = " + otroNumeroInt);
		
		double otroRealDouble = 1.23456e2;
		String otroRealStr = Double.toString(otroRealDouble);
		System.out.println("otroRealStr = " + otroRealStr);
		
		otroRealStr = String.valueOf(1.23456e2f);
		System.out.println("otroRealStr = " + otroRealStr);
		
		int i = 22500;
		
		short s = (short)i;
		System.out.println("s " + s);
		
		long l = i;
		System.out.println("l " + l);
		
		System.out.println(Short.MAX_VALUE);
		
		char c = (char)i;
		System.out.println("c " + c);
		
		float f = i;
		System.out.println("f " + f);
		
	}

}