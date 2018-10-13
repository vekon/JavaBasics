import java.util.Scanner;

public class FibanocciRecursive {
    public static void main(String[] args) {
        System.out.print("Enter a number to display fibonacci series : ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print("Fibonacci series : ");
        for (int i = 0; i <= number; i++) {
            System.out.print(fibanocci(i)+", ");
        }
    }

    public static int fibanocci(int i) {
        if (i <=1) {
            return i;
        } else {
            return fibanocci(i-1) + fibanocci(i -2);
        }
    }
}
