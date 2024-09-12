import java.util.Scanner;

public class Main {

    public static int sumOfPrimes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Sum of prime numbers is: " + sumOfPrimes());
    }
}
