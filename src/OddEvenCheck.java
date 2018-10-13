import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is even or odd : ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number%2 == 0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }
    }
}
