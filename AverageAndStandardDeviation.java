import java.util.Scanner;

public class AverageAndStandardDeviation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int N = scan.nextInt();
        double sum = 0.0;
        double sumOfSquares = 0.0;

        System.out.println("Enter the floating point numbers:");

        for (int i = 0; i < N; i++) {
            double value = scanner.nextDouble();
            sum += value;
            sumOfSquares += value * value;
        }
        double average = sum / N;
        double avgSquare = sumOfSquares / N;
        double avg2 = average * average;
        double standardDeviation = Math.sqrt(avgSquare - avg2);

        System.out.println("\nAverage: " + average);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}
