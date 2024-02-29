public class Tst {
    public static void main(String[] args) {

       // A a = new C();
        //a.myMethod();

        //Lambda Expression:
        A a = () -> System.out.println("Inside MyMethod.");
        a.myMethod();
    }
}
