import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);
		double num, doble, triple;

// Le pedimos al usaurio el dato para hcer el doble y triple
	System.out.println("Ingrese el número al que desea saber el doble y triple: ");
	num = leer.nextDouble();

//Imprimimos resultado final y operaciones correspondientes
	doble = num + num;
	triple = num + num + num;

	System.out.println("El doble del número ingresado es: "+doble);
	System.out.println("El triple del número ingresado es: "+triple);

		    }
}