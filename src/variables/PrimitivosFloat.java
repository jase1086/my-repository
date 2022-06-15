package variables;

public class PrimitivosFloat {

	public static void main(String[] args) {

		float realFloat = 0.000015F;// 1.5e-5f //0.000015
		System.out.println("realFloat = " + realFloat);
		System.out.println("float corresponde en byte a = " + Float.BYTES);
		System.out.println("float corresponde en bites a = " + Float.SIZE);
		System.out.println("maximo valor para float = " + Float.MAX_VALUE);
		System.out.println("minimo valor para float = " + Float.MIN_VALUE);
		System.out.println("");
		double realDoble = 3.4028235E39;
		System.out.println("realDouble = " + realDoble);
		System.out.println("double corresponde en byte a = " + Double.BYTES);
		System.out.println("double corresponde en bite a = " + Double.SIZE);
		System.out.println("double corresponde en byte a = " + Double.MAX_VALUE);
		System.out.println("double corresponde en byte a = " + Double.MIN_VALUE);
		System.out.println("");
		float varFlotante = 3.4028235E38f;
		System.out.println("varFlotante = " + varFlotante);

	}
}
