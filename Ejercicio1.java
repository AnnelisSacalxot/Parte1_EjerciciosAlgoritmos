
import java.util.*;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double num1, num2, resultado;

    //Pediremos los datos al usuario para poder hacer la suma
        System.out.println("Ingrese primer número: ");
        num1 = leer.nextDouble();
        System.out.println("Ingrese segundo número: ");
        num2 = leer.nextDouble();
         
        //Imprimimos los resultados
         resultado = num1+num2;
        System.out.println("La suma de los números es: "+resultado);


    }
}
