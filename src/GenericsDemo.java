public class GenericsDemo<T> {
    T t1;
    T t2;
    T t3;

    public GenericsDemo(T t1, T t2, T t3){
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    public T getT3() {
        return t3;
    }

    public void setT3(T t3) {
        this.t3 = t3;
    }

    public static void main(String[] args) {
        String fname = "venu";
        String lname = "konda";
        String mname = "gopal";

        GenericsDemo<String> genericsDemo = new GenericsDemo<String>(fname, lname, mname);
    }
}
