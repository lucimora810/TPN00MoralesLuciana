package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.edm.model.Estudiante;
import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tp00MoralesLucianaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00MoralesLucianaApplication.class, args);
		String nombre = "Luciana";
		System.out.println("Hola mundo, dice "+ nombre + " " + darNombre());
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("44949265");
		unEstudiante.setNombre("Luciana");
		unEstudiante.setApellido("Morales");
		System.out.println("El estudiante "+ unEstudiante.getNombre() +" "+ unEstudiante.getApellido() + " dice HOLA:)");
			
		Calculadora unCalculadora = new Calculadora(); 
		unCalculadora.sentN1(10);
		unCalculadora.sentN2(2);
		System.out.println("El resultado de la suma es " + unCalculadora.sumaNumero());
		System.out.println("El resultado de la resta es " + unCalculadora.restNumero());
		System.out.println("El resultado de la division es " + unCalculadora.divisionNumero());
		System.out.println("El resultado de la multiplicacion es " + unCalculadora.multiplicacionNumero());
		System.out.println("El resultado de la potencia es " + unCalculadora.potenciaNumero());
		System.out.println("El resultado de la raiz " + unCalculadora.raizNumero());
	}
	public static String darNombre() {
		String nuevoNombre = "Morales";
		return nuevoNombre;	
	}

}
