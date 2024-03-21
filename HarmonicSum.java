import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scan.nextInt();
        double sum = 0.0;
       
      for (int i = 1; i <= N; i++) 
            sum += 1.0 / i;
        System.out.println("\nSum is: " + sum);
    }
}
