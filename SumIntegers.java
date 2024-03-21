import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many integers will be added: ");
        int count = scan.nextInt();
        int sum = 0;
       
      for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int num = scan.nextInt();
            sum += num;
        } System.out.println("\nThe sum is " + sum);
    }
}
