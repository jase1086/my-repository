package herencia;

public class AlumnoInternacional extends Alumno{
	
	private String pais;
	private double notaIdioma;
	
	public AlumnoInternacional() {
		System.out.println("AlumnoInternacional: inicializacion de constructor...");
	}
	
	public AlumnoInternacional(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	public AlumnoInternacional(String nombre, String apellido, String pais) {
		super(nombre, apellido);
		this.pais = pais;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getNotaIdioma() {
		return notaIdioma;
	}
	public void setNotaIdioma(double notaIdioma) {
		this.notaIdioma = notaIdioma;
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return super.saludar() + ", soy alumno extranjero del país: " + getPais()
		+ " mi nombres es " + getNombre();
	}
	
	@Override
	public double calcularPromedio() {
//		System.out.println("calcularPromedio " + this.getClass().getCanonicalName());
		return ((super.calcularPromedio() + notaIdioma))/4;
	}

	@Override
	public String toString() {
		return super.toString() + " pais=" + pais + ", notaIdioma=" + notaIdioma;
	}
	

	
}
