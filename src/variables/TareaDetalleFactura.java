package variables;

import java.util.Scanner;

public class TareaDetalleFactura {
	public static void main(String[] args) {
	
		String nomFactura = "";
		double preUno, preDos, totalBruto, impuesto;
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese nombre de la factura, por favor: ");
		nomFactura = sc.nextLine();

		System.out.print("Ingrese el precio del producto 1: ");
		preUno = sc.nextDouble();

		System.out.print("Ingrese el precio del producto 2: ");
		preDos = sc.nextDouble();

		totalBruto = (preUno + preDos);
		impuesto = (preUno + preDos) * 0.19;
		double totalNeto = (totalBruto + impuesto);

		String resumen = ("Nombre de la factura: " + nomFactura + "," + " Monto total bruto: " + totalBruto + "," + " Impuesto: "
				+ impuesto + "," + " Monto total neto incluido: " + totalNeto);
		
		System.out.println(resumen);
	}
}
