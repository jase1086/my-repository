package variables;

public class PrimitivosBoolean {

	public static void main(String[] args) {
		
		boolean dataLogica = true;
		System.out.println("datoLogico = " + dataLogica);
		
		double d = 98765.43e-3;// 98765.43
		System.out.println("d =  " + d);		
		
		float f = 1.2345e2f; //123.45
		System.out.println("f = " + f);
		
		dataLogica = d < f;
		System.out.println("dataLogica = " + dataLogica);
		
		boolean esIgual = (3-2 == 1);
		System.out.println("esIgual = " + esIgual);
	}
}
