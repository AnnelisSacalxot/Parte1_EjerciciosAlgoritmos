import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);
		String pais, capital;

// Le pedimos al usaurio los datos en este caso la capital y el pais
	System.out.println("Ingrese el pais: ");
	pais = leer.next();
	System.out.println("Ingrese la capital: ");
	capital = leer.next();

//Imprimimos resultado final
	System.out.println(capital+"es la capital de "+pais);

		    }
}