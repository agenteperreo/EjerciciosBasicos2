package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaramos las variables y abrimos el examen
		Scanner sc = new Scanner(System.in);
		int edad;
		boolean mayor;

		// Preguntamos su edad y la almacenamos en la variable
		System.out.print("¿Cuantos años tienes?: ");
		edad = sc.nextInt();

		// Condicional para false si es menor o true para mayor de edad
		mayor = edad > 18 ? true : false;

		// Mostramos la variable boolean
		System.out.println(mayor);

		// Cerramos el escaner
		sc.close();
	}

}
