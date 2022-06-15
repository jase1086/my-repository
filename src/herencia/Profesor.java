package herencia;

public class Profesor extends Persona {

	private String asignatura;

	public Profesor() {
		System.out.println("Profesor: inicializacion de constructor...");
	}

	public Profesor(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public Profesor(String nombre, String apellido, String asignatura) {
		super(nombre, apellido);
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String saludar() {
		return "Hola, soy profesor de " + getAsignatura() + " mi nombre es: " + getNombre();
	}

	@Override
	public String toString() {
		return super.toString() + " asignatura=" + asignatura;
	}
	
	
}
