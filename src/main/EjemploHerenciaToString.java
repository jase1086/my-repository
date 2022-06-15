package main;

import herencia.Alumno;
import herencia.AlumnoInternacional;
import herencia.Persona;
import herencia.Profesor;

public class EjemploHerenciaToString {

	public static void main(String[] args) {
		System.out.println("=================== Creando la instancia de Alumno ========================");
		Alumno alumno = new Alumno("Javier", "Seguel", 34, "Liceo las salinas");

		alumno.setNotaHistoria(5.5);
		alumno.setNotaLenguaje(6.5);
		alumno.setNotaMatematica(6.0);
		alumno.setEmail("javier@correo.cl");
		// ((Alumno)alumno).setInstitucion("Liceo las salinas");// casteo de la clase
		// hija
		System.out.println("===================== Creando la instancia de AlumnoInternacional ==============");
		AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Antonio", "Fuentes", "Alemania");

		alumnoInternacional.setEdad(23);
		alumnoInternacional.setInstitucion("Instituto Nacional");
		alumnoInternacional.setNotaIdioma(6.3);
		alumnoInternacional.setNotaHistoria(5.5);
		alumnoInternacional.setNotaLenguaje(6.5);
		alumnoInternacional.setNotaMatematica(5.9);
		alumnoInternacional.setEmail("antonio@correo.cl");

		System.out.println("============= Creando la instancia de profesor ===============");
		Profesor profesor = new Profesor("Karen", "Jorquera", "Lenguaje");
		profesor.setEdad(37);
		profesor.setEmail("profesor.karen@correo.cl");
		System.out.println(" ===================== - =========================");

		imprimir(alumno);
		imprimir(profesor);
		imprimir(alumnoInternacional);
	}

	public static void imprimir(Persona persona) {
		System.out.println(persona);
	}

}
