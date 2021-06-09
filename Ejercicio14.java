import java.util.*;

public class Ejercicio14 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		double numerador, denominador, resultado;

		System.out.println("Ingrese el numerador: ");
		numerador = leer.nextDouble();
		System.out.println("Ingrese el denominador: ");
		denominador = leer.nextDouble();

//Hacemos la comparación si los números son positivos

		resultado = numerador/denominador;
		
		while(denominador  > 0){
			System.out.println("Los numeros son divisibles");
		}

		 }
}