import java.util.Scanner;

public class Main {

    public static int findSmallest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println("The smallest number is: " + findSmallest());
    }
}
