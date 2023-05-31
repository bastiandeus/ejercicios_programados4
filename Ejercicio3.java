import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Generar un número aleatorio entre 1 y 100
        int numeroAdivinar = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        
        System.out.println("¡Bienvenido al juego de adivinar el numero!");
        System.out.println("Intenta adivinar el numero entre 1 y 100.");
        
        while (true) {
            System.out.print("Ingrese un numero: ");
            int numero = scanner.nextInt();
            intentos++;

            if (numero == numeroAdivinar) {
                System.out.println("¡Felicitaciones! ¡Has adivinado el numero en " + intentos + " intentos!");
                break;
            } else if (numero < numeroAdivinar) {
                System.out.println("El numero ingresado es menor. Intenta nuevamente.");
            } else {
                System.out.println("El numero ingresado es mayor. Intenta nuevamente.");
            }
        }

    }
}
