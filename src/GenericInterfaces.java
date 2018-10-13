public class GenericInterfaces{
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.start("Start bmw");

        Bike hd = new Bike();
        hd.start(2000);
    }
}

class Car implements Vehicle<String>{
    @Override
    public void start(String  t1) {
        System.out.println("Start implementation for car");
    }
}

class Bike implements Vehicle<Integer>{
    @Override
    public void start(Integer  t1) {
        System.out.println("Start implementation for bike");
    }
}

interface Vehicle<T> {
    public void start(T t1);
}
