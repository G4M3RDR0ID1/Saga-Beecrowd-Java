import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalEmVendas = sc.nextDouble();

        double bonus = totalEmVendas * 0.15;

        double totalAreceber = bonus + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f\n", totalAreceber);
    }

}