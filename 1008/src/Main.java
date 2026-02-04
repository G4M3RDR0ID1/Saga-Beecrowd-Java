import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numDoFuncionario = sc.nextInt();
        int horasTrabalhada = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhada * valorPorHora;

        System.out.println("NUMBER = " + numDoFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}