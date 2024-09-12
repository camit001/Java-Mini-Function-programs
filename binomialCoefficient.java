import java.util.Scanner;

public class Main {

    public static long binomialCoefficient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = scanner.nextInt();
        System.out.print("Enter r value: ");
        int r = scanner.nextInt();
        scanner.close();

        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n) {
            return 1;
        }
        long[][] C = new long[n + 1][r + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    C[i][j] = 1;
                } else {
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
                }
            }
        }
        return C[n][r];
    }

    public static void main(String[] args) {
        System.out.println("Binomial Coefficient is: " + binomialCoefficient());
    }
}
