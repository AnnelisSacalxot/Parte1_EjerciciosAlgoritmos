import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		double celsius, fahrenheit;

		System.out.println("Ingrese la temperatura que desea convertir de Celsiud a Fahrenheit: ");
		celsius = leer.nextDouble();

//Imprimimos resultado final y operaciones correspondientes para hacer el promedio

		fahrenheit = (celsius*9/5) + 32;

		System.out.println("La temperatura de Celsius a grados Fahrenheit es: "+fahrenheit);

		 }
}