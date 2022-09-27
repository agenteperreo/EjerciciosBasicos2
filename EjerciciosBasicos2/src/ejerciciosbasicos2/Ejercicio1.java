package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Declaramos las varibles y abrimos el escaner
		float manzanasT = 2.35f, perasT = 1.95f;
		float kilosManzana1S, kilosPeras1S, kilosManzana2S, kilosPeras2S;
		Scanner sc = new Scanner(System.in);

		//Pedimos los kilos de manzanas y peras
		System.out.print("Cuantos kilos de manzana ha vendido en el primer semestre: ");
		kilosManzana1S = sc.nextFloat();
		System.out.print("Cuantos kilos de peras ha vendido en el primer semestres: ");
		kilosPeras1S = sc.nextFloat();
		System.out.print("Cuantos kilos de manzana ha vendido en el segundo semestre: ");
		kilosManzana2S = sc.nextFloat();
		System.out.print("Cuantos kilos de peras ha vendido en el segundo semestres: ");
		kilosPeras2S = sc.nextFloat();

		//Calculamos los beneficios
		manzanasT *= (kilosManzana1S += kilosManzana2S);
		perasT *= (kilosPeras1S += kilosPeras2S);
		
		//Mostramos los beneficios de cada uno
		System.out.printf("Beneficios manzanas: %.2f €\nBeneficios peras: %.2f €",manzanasT, perasT);
		
		//Cerramos el escaner
		sc.close();
	}

}
