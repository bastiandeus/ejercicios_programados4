import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese los numeros del 100 al 0 de 7 en 7.");
        
        int numero = 100;
        while (numero >= 0) {
            System.out.print("Ingrese un número: ");
            int numeroIngresado = input.nextInt();
            
            if (numeroIngresado != numero) {
                System.out.println("Numero incorrecto. Intente nuevamente.");
                continue;
            }
            
            numero -= 7;
        }
        
        System.out.println("¡Has completado la secuencia de numeros de 7 en 7!");
        
        scanner.close();
    }
}
