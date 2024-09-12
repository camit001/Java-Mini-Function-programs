import java.util.Scanner;

public class Main {

    public static int sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        scanner.close();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits is: " + sumOfDigits());
    }
}
