import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, produto;

        a = sc.nextInt();
        b = sc.nextInt();

        produto = a * b;

        System.out.println("PROD = " + produto);

        sc.close();
    }
}
