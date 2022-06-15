package main;

import herencia.Alumno;
import herencia.AlumnoInternacional;
import herencia.Persona;
import herencia.Profesor;

public class EjemploHerenciaConstructores {

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
		System.out.println("Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido() + " Edad: "
				+ persona.getEdad() + " Email: " + persona.getEmail());

		if (persona instanceof Alumno) {
			System.out.println("Imprimiento los datos del tipo Alumno:");
			System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
			System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematica());
			System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
			System.out.println("Nota Lenguaje: " + ((Alumno) persona).getNotaLenguaje());

			if (persona instanceof AlumnoInternacional) {
				System.out.println("Imprimiento los datos del tipo AlumnoInternacional:");
				System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdioma());
				System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
			}
		}
		
		if(persona instanceof Profesor) {
			System.out.println("Imprimiento los datos del tipo Profesor:");
			System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
		}
		
		System.out.println("===================== sobre escritura saludo ===================================");
		System.out.println(persona.saludar());
		System.out.println("========================================================");
		
		System.out.println("===================== sobre escritura Promedio ===================================");
		System.out.println("Promedio: " + ((Alumno)persona).calcularPromedio());
		System.out.println("========================================================");
	}
}
