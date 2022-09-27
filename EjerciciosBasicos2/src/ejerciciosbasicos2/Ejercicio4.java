package ejerciciosbasicos2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Declaramos las variable y abrimos el escaner
		Scanner sc = new Scanner(System.in);
		boolean llueve, biblio, tareas, perm;
		
		//Pedimos true o false para las variables
		System.out.println("Responde con true o false unicamente");
		System.out.print("¿Esta lloviendo?: ");
		llueve = sc.nextBoolean();
		System.out.println("¿Has hecho la tarea?: ");
		tareas = sc.nextBoolean();
		System.out.print("¿Tienes que ir a la biblioteca?: ");
		biblio = sc.nextBoolean();
		
		//Condicional para permisos
		perm = biblio==true ? true : llueve==true && tareas==false ? false : llueve==true && tareas==true ? false : llueve==false && tareas==true ? true : llueve==false && tareas==false ? false : true;
		
		//Mostramos la variable booleana
		System.out.println(perm);
	}

}
