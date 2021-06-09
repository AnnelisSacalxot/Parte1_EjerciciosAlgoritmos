import java.util.*;

public class Ejercicio8 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		double num1, num2, num3, resultado;

		System.out.println("Ingrese el primer número: ");
		num1 = leer.nextDouble();
		System.out.println("Ingrese el segundo número: ");
		num2 = leer.nextDouble();
		System.out.println("Ingrese el tercer número: ");
		num3 = leer.nextDouble();


//Imprimimos resultado final y operaciones correspondientes para hacer el promedio

		resultado = (num1+num2+num3)/3;

		System.out.println("El primedio de los números ingresados es: "+resultado);

		 }
}