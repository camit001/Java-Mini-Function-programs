import java.util.Scanner;

public class Main {

    public static int findLargest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println("The largest number is: " + findLargest());
    }
}
