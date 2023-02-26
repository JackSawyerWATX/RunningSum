import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        int runningSum = 0;
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("Enter a number (or 0 to quit): ");
            input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            runningSum += input;
            System.out.println("Running sum: " + runningSum);
        }

        scanner.close();
    }
}
