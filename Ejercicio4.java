import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);
		double num, cuadraro, cubo;

// Le pedimos al usaurio el dato para hacer el cuadrado y el cubo
	System.out.println("Ingrese el número al que desea saber el cuadrado y el cubo: ");
	num = leer.nextDouble();

//Imprimimos resultado final y operaciones correspondientes
	cuadraro = num*num;
	cubo = num*num*num;

	System.out.println("El cuadrado del número ingresado es: "+cuadraro);
	System.out.println("El cubo del número ingresado es: "+cubo);

		    }
}