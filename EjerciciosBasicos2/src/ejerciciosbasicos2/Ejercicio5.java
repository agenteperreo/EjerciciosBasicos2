package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Abrimos el escanner y declaramos las variables
		Scanner sc = new Scanner(System.in);
		int mediaE;
		float nota1, nota2, nota3, mediaF;

		// Guardamos las 3 notas en las variables correspondientes
		System.out.print("Dime la nota del primer trimestre: ");
		nota1 = sc.nextFloat();
		System.out.print("Dime la nota del segundo trimestre: ");
		nota2 = sc.nextFloat();
		System.out.print("Dime la nota del tercer trimestre: ");
		nota3 = sc.nextFloat();

		// Calculamos la media con decimales y sin decimales
		mediaE = (int) ((nota1 + nota2 + nota3) / 3);
		mediaF = (nota1 + nota2 + nota3) / 3;

		// Mostramos las notas medias
		System.out.printf("La nota media con decimales es %.2f y la nota del boletin de notas es %d", mediaF, mediaE);

		// Cerramose el escaner
		sc.close();
	}

}
