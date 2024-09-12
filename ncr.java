import java.util.Scanner;

public class Main {

    public static long fact(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long ncr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = scanner.nextInt();
        System.out.print("Enter r value: ");
        int r = scanner.nextInt();
        scanner.close();

        long fact_n = fact(n);
        long fact_r = fact(r);
        long fact_nmr = fact(n - r);

        long res = fact_n / (fact_r * fact_nmr);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Binomial Coefficient is: " + ncr());
    }
}
