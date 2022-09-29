package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Abrimos el escanner y declaramos las variables
		Scanner sc = new Scanner(System.in);
		int nota1, nota2, nota3;
		double notaMedia;

		// Guardamos las 3 notas en las variables correspondientes
		System.out.print("Dime la nota del primer trimestre: ");
		nota1 = sc.nextInt();
		System.out.print("Dime la nota del segundo trimestre: ");
		nota2 = sc.nextInt();
		System.out.print("Dime la nota del tercer trimestre: ");
		nota3 = sc.nextInt();

		// Calculamos la media con decimales y sin decimales
		notaMedia = (double)(nota1 + nota2 + nota3) / 3;

		// Mostramos las notas medias
		System.out.printf("La nota media con decimales es %.2f y entera es %.2f", notaMedia, (int)notaMedia);

		// Cerramose el escaner
		sc.close();
	}

}
