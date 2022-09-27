package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Decalramos las variables y abrimos el escaner
		Scanner sc = new Scanner(System.in);
		int num;
		boolean par;

		//Pedimos un numero
		System.out.print("Dime un numero: ");
		num = sc.nextInt();
		
		//Condicional para si es par = true y si no false
		par = num%2==0 ? true : false;
		
		//Mostramos la variable boolean
		System.out.println(par);
		
		//Cerramos el escaner
		sc.close();
	}

}
