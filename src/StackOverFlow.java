public class StackOverFlow {
    static int counter = 0;
    public static void main(String[] args) {
        recerringExecute();
    }

    private static void recerringExecute() {
        System.out.println("Counter : "+counter);
        counter++;
        recerringExecute();
    }
}
