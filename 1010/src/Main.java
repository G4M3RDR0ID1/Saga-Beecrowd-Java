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

        int peca1 = sc.nextInt();
        int numDepecas = sc.nextInt();
        double valorUnitario = sc.nextDouble();

        int peca2 = sc.nextInt();
        int numDepecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double valorTotalAPagar = (numDepecas * valorUnitario) + (numDepecas2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotalAPagar);
    }

}