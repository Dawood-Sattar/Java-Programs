class Overload {
    void method(int a, int b) {
        System.out.println("Sum " + (a + b));
    }

    void method(String a, String b) {
        System.out.println (a +" "+ b);
    }
}

public class Overloading {
    public static void main(String[] args) {

        Overload obj = new Overload();
        obj.method(3, 2);
    }
}
