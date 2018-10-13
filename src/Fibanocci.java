import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        System.out.print("Enter a number to display fibonacci series : ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int f1 = 0, f2 = 1;
        System.out.print("Fibonacci series : ");
        for (int i = 1; i <= number; i++) {
            System.out.print(f1+", ");
            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
    }
}
