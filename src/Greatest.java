public class Greatest {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 120;
        int num3 = 70;

        int greatest = 0;

        if (num1 > num2) {
            greatest = num1;
        } else {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }
        System.out.println("Greatest of Num1, Num2, Num3 : "+ greatest);
    }
}
