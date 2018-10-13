public class SICI {
    public static void main(String[] args) {
        float principle = 10000.00f;
        int noofyears = 2;
        float rateofintrest = 10.00f;

        double simpleIntrest = principle + ((principle * noofyears * rateofintrest)/100);
        System.out.println("Simple Interest : " +simpleIntrest);
    }
}
