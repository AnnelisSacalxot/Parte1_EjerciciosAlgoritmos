import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		double num, yardas, metros, pies, pulgadas;

//Le pedimos al usuario la entrada de datos para calcular las conversiones 
		System.out.println("Ingrese el número al que desea convertir a yardas, metros, pies y pulgadas: ");
		num = leer.nextDouble();

//Imprimimos resultado final y operaciones correspondientes para hacer el promedio

		yardas = num*0.0109361;
		metros = num*0.01;
		pies = num*0.0328084;
		pulgadas = num* 0.393701;


		System.out.println("El número ingresado pasado a yardas es: "+yardas);
		System.out.println("El número ingresado pasado a metros es: "+metros);
		System.out.println("El número ingresado pasado a pies es: "+pies);
		System.out.println("El número ingresado pasado a pulgadas es: "+pulgadas);

		 }
}