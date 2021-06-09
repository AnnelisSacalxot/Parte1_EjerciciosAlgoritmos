import java.util.*;
import java.util.Random;
 import java.lang.Math;

public class Ejercicio7 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Random numero = new Random();
		int num = (int) (Math.random()*50+10);
		int resultado = (int) (Math.random()*50+10/15);

// Mostramos el primer número aleatorio
	System.out.println("El número aleatorio es: "+num);

//Imprimimos resultado final y operaciones correspondientes
//	resultado = numero.nextInt()*((50+10)/15);

	if (num == resultado) {
		System.out.println("El número es: "+resultado);
	} else {
		System.out.println("El número es distinto al anterior y es: "+resultado);
	}

		 }
}