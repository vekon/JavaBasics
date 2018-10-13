import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is a prime or composite : ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean flag = false;

        if (number == 0 || number == 1) {
            System.out.println("Entered number is composite");
        } else {
            int m = number/2;
            for(int i = 2;i < m; i++) {
                if (number % i == 0) {
                    System.out.println("Entered number is composite");
                    flag = true;
                    break;
                }
            }
        }
        if (!flag)
            System.out.println("Entered number is prime");
    }
}
