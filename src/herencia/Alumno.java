package herencia;

public class Alumno extends Persona {

	private String institucion;
	private double notaMatematica;
	private double notaLenguaje;
	private double notaHistoria;

	public Alumno() {
		System.out.println("Alumno: inicializando constructor...");
	}

	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public Alumno(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
	}

	public Alumno(String nombre, String apellido, int edad, String institucion) {
		super(nombre, apellido, edad);
		this.institucion = institucion;
	}

	public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematicas,
			double notaCastellano, double notaHistoria) {
		this(nombre, apellido, edad, institucion);
		this.notaMatematica = notaMatematicas;
		this.notaLenguaje = notaCastellano;
		this.notaHistoria = notaHistoria;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public double getNotaMatematica() {
		return notaMatematica;
	}

	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}

	public double getNotaLenguaje() {
		return notaLenguaje;
	}

	public void setNotaLenguaje(double notaLenguaje) {
		this.notaLenguaje = notaLenguaje;
	}

	public double getNotaHistoria() {
		return notaHistoria;
	}

	public void setNotaHistoria(double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}
	
	@Override
	public String saludar() {
		return super.saludar() + ", desde la clase Alumno y mi nombre es: " + getNombre();
	}
	
	public double calcularPromedio() {
//		System.out.println("calcularPromedio " + this.getClass().getCanonicalName());
		return (notaHistoria + notaLenguaje + notaMatematica)/3;
	}

	@Override
	public String toString() {
		return super.toString() + " institucion=" + institucion + ", notaMatematica=" + notaMatematica + ", notaLenguaje="
				+ notaLenguaje + ", notaHistoria=" + notaHistoria + ", saludo " + this.saludar() + ", Promedio " + this.calcularPromedio();
	}
	
	

}
