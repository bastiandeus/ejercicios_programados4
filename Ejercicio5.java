import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int n = input.nextInt();
        
        System.out.println("Los numeros del 1 al " + n + " son:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
