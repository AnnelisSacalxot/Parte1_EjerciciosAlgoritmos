import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);
		double num1, num2, resultado;

// Le pedimos al usaurio los datos
	System.out.println("Ingrese el primer número: ");
	num1 = leer.nextDouble();
	System.out.println("Ingrese el segundo número: ");
	num2 = leer.nextDouble();

//Imprimimos resultado final
	resultado = num1+num2;
	System.out.println("La suma de los números es: "+resultado);

		    }
}