import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int find(int x, int[] pai) {
        if (pai[x] == x) {
            return x;
        } else {
            return find(pai[x], pai);
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        int[] pai = new int[N + 1];
        // inicializa os grupos
        for (int i = 1; i <= N; i++) {
            pai[i] = i;
        }

        // lê as ligações
        for (int i = 0; i < L; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int grupoX = find(x, pai);
            int grupoY = find(y, pai);

            if (grupoX != grupoY) {
                pai[grupoY] = grupoX;
            }
        }

        // verifica se todos estão no mesmo grupo
        int grupoBase = find(1, pai);
        boolean completo = true;

        for (int i = 2; i <= N; i++) {
            if (find(i, pai) != grupoBase) {
                completo = false;
                break;
            }
        }

        if (completo) {
            System.out.println("COMPLETO");
        } else {
            System.out.println("INCOMPLETO");
        }
    }
}