import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cantidadSalarios = 10;
        int sumaSalarios = 0;
        int salariosMayores = 0;
        
        for (int i = 1; i <= cantidadSalarios; i++) {
            System.out.print("Ingrese el salario " + i + ": ");
            int salario = input.nextInt();
            
            sumaSalarios += salario;
            
            if (salario > 10000) {
                salariosMayores++;
            }
        }
        
        System.out.println("La suma de los salarios es: " + sumaSalarios);
        System.out.println("Cantidad de salarios mayores a 10000 colones: " + salariosMayores);
    }
}
