import java.util.*;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Random numero = new Random();
		int num, resultado;

// Mostramos el primer número aleatorio
		num = numero.nextInt(200);
	System.out.println("El número aleatorio es: "+num);

//Imprimimos resultado final y operaciones correspondientes
	resultado = numero.nextInt(200*30);

	if (num == resultado) {
		System.out.println("El número es: "+resultado);
	} else {
		System.out.println("El número es distinto al anterior y es: "+resultado);
	}

		 }
}