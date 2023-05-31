import java.util.Scanner;
public class Ejercicio1{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ingrese un numero (negativo para salir): ");
            int numero = input.nextInt();
            
            if (numero < 0) {
                System.out.println("Ha ingresado un numero negativo. Saliendo del programa...");
                break;
            }
            
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        }
    }
}