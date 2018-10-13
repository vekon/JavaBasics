public class TypeCasting {
    public static void main(String[] args) {
        String doublePrinciple = "10000.00";
        String integerPrinciple = "10000";

        System.out.println("Principle after type casting to double: " +Double.parseDouble(doublePrinciple));
        System.out.println("Principle after type casting to integer : " +Integer.parseInt(integerPrinciple));
        System.out.println("Principle after type casting to float : " +Float.parseFloat(doublePrinciple));
    }
}
