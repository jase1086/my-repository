package main;

import herencia.Alumno;
import herencia.AlumnoInternacional;
import herencia.Profesor;

public class EjemploHerencia {

	public static void main(String[] args) {

		Alumno alumno = new Alumno();

		alumno.setNombre("Javier");
		alumno.setApellido("Seguel");
		alumno.setInstitucion("Liceo las salinas");
		alumno.setNotaHistoria(5.5);
		alumno.setNotaLenguaje(6.5);
		alumno.setNotaMatematica(6.0);
		// ((Alumno)alumno).setInstitucion("Liceo las salinas");// casteo de la clase
		// hija

		AlumnoInternacional alumnoInternacional = new AlumnoInternacional();

		alumnoInternacional.setNombre("Antonio");
		alumnoInternacional.setApellido("Fuentes");
		alumnoInternacional.setPais("Alemania");
		alumnoInternacional.setEdad(23);
		alumnoInternacional.setInstitucion("Instituto Nacional");
		alumnoInternacional.setNotaIdioma(6.3);
		alumnoInternacional.setNotaHistoria(5.5);
		alumnoInternacional.setNotaLenguaje(6.5);
		alumnoInternacional.setNotaMatematica(5.9);

		Profesor profesor = new Profesor();

		profesor.setNombre("Karen");
		profesor.setApellido("Jorquera");
		profesor.setAsignatura("Lenguaje");

		System.out
				.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getInstitucion());
		System.out.println(alumnoInternacional.getNombre() + " " + alumnoInternacional.getApellido() + " "
				+ alumnoInternacional.getInstitucion() + " " + alumnoInternacional.getPais());

		System.out.println(
				"Profesor: " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

		Class clase = alumnoInternacional.getClass();

		while (clase.getSuperclass() != null) {
			String hija = clase.getName();
			String padre = clase.getSuperclass().getName();
			System.out.println(hija + " es una clase hija de la clase padre " + padre);
			clase = clase.getSuperclass();
		}
	}

}
