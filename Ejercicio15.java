import java.util.*;

public class Ejercicio15 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		double num;

		System.out.println("Ingrese un número: ");
		num = leer.nextDouble();


//Imprimimos resultado final y operaciones correspondientes para ver que tipo de número es

		if (num == 0) {
			System.out.println("El número es nulo");
		} else  {
			if (num > 0) {
				System.out.println("El número es positivo");
			} else {
				System.out.println("El número es negativo");
			} 
		} 

	

		 }
}