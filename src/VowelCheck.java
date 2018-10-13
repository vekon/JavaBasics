import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        System.out.print("Enter a character to check if it is a vowel : ");

        Scanner in = new Scanner(System.in);
        String charecter = in.next();

        switch (charecter.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Entered character is a vowel");
                break;
            default:
                System.out.println("Entered character is not a vowel");
                break;
        }
    }
}
