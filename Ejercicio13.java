import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		double pi = 3.1416;
		double radio, altura, volumen;

		System.out.println("Ingrese el radio: ");
		radio = leer.nextDouble();
		System.out.println("Ingrese el altura: ");
		altura = leer.nextDouble();

//Hacemos la comparación si los números son positivos

		volumen = (altura)*(radio)*(pi*pi);

		if (radio > 0) {
			//System.out.println("El volumen es: "+volumen);
			if (altura > 0) {
				System.out.println("El volumen es: "+volumen);
			}
		} else {
			System.out.println("número invalido");
		}


		 }
}