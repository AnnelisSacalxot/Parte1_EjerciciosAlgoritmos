import java.util.*;

public class Ejercicio9 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		String palabra1, palabra2, resultado1, resultado2;

// Pedimos al usuario que ingrese las palabras correspondientes
		System.out.println("Ingrese la primera palabra: ");
		palabra1 = leer.next();
		System.out.println("Ingrese el segundo número: ");
		palabra2 = leer.next();

//Imprimimos resultado final y operaciones correspondientes para hacer el promedio

		resultado1 = palabra2;
		resultado2 = palabra1;

		System.out.println("Las palabras invertidas, quedan como: la primera palabra es " + resultado1+ " y la segunda palabra es: "+resultado2);

		 }
}