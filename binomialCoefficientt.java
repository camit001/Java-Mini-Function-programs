import java.util.Scanner;

public class Main {

    public static long binomialCoefficientt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = scanner.nextInt();
        System.out.print("Enter r value: ");
        int r = scanner.nextInt();
        scanner.close();

        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Binomial Coefficient is: " + binomialCoefficientt());
    }
}
