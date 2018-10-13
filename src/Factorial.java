import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number to display factorial : ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial for given number is : "+ factorial);
    }
}
