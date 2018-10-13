public class Interfaces {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.m1(c1);
        c1.m2(c1);
        c1.m3(c1);
        c1.m4(c1);
    }
}

class C2 {
    public void test(){

    }
}

class C1 extends C2 implements I4{

    @Override
    public void i1M1() {
        System.out.println("i1M1");
    }

    @Override
    public void i1M2() {
        System.out.println("i1M2");
    }

    @Override
    public void i2M1() {
        System.out.println("i2M1");
    }

    @Override
    public void i2M2() {
        System.out.println("i2M2");
    }

    @Override
    public void i3M1() {
        System.out.println("i3M1");
    }

    @Override
    public void i3M2() {
        System.out.println("i3M2");
    }

    @Override
    public void i4M1() {
        System.out.println("i4M1");
    }

    public void m1(I1 i) {
        System.out.println(i);
    }

    public void m2(I2 i) {
        System.out.println(i);
    }

    public void m3(I3 i) {
        System.out.println(i);
    }

    public void m4(I4 i) {
        System.out.println(i);
    }
}

interface I1 {
    void i1M1();
    void i1M2();
}

interface I2 {
    void i2M1();
    void i2M2();
}

interface I3 {
    void i3M1();
    void i3M2();
}

interface I4 extends I1, I2, I3{
    void i4M1();
}
