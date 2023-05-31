import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        while (true) {
            System.out.print("Ingrese un numero (negativo para salir): ");
            int numero = input.nextInt();
            if (numero < 0) {
                System.out.println("Ha ingresado un numero negativo.");
                break;
            }
            contador++;
        }
        System.out.println("Se han introducido " + contador + " numeros.");
    }
}
