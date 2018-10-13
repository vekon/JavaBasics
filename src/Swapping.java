public class Swapping {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 50;

        System.out.println("Before Swapping : Num1 = " +num1 + " Num2 = " + num2);
        // Swapping code

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping : Num1 = " +num1 + " Num2 = " + num2);
    }
}
