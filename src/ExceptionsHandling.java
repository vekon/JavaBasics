public class ExceptionsHandling {

    public static void main(String[] args) {
        try {
            f();
        } catch (ParentCustomException e) {
            System.out.println("Handled parent exception "+e);
        }
    }

    public static void f() throws ParentCustomException {
        try {
            g();
        } catch (CustomException e) {
            throw new ParentCustomException();
        }
    }

    public static void g() throws CustomException{
        throw new CustomException();
    }
}

class CustomException extends Exception {
    CustomException() {
        super();
    }
}

class ParentCustomException extends Exception {
    ParentCustomException() {
        super();
    }
}