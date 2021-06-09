import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);
		double num, resultado;

// Le pedimos al usaurio el dato para hacer el cuadrado y el cubo
	System.out.println("Ingrese el número al que desea saber el número siguiente: ");
	num = leer.nextDouble();


//Imprimimos resultado final y operaciones correspondientes
		resultado = num+1;
		System.out.println("El número siguiente al que ingreso es: "+resultado);

		 }
}