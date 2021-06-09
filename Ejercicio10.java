import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		double base, altura, area, perimetro;

//Le pedimos al usuario la entrada de datos para calcular el perimetro y área
		System.out.println("Ingrese la base: ");
		base = leer.nextDouble();
		System.out.println("Ingrese la altura: ");
		altura = leer.nextDouble();

//Imprimimos resultado final y operaciones correspondientes para hacer el promedio

		perimetro = 2*base + 2*altura;
		area = base*altura;


		System.out.println("El perimetro del rectángulo es: "+perimetro);
		System.out.println("El área del rectángulo es: "+area);

			

		 }
}