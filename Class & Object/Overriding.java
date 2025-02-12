class Parent {
    void method() {
        System.out.println("I am Parent Class");
    }
}

class Child extends Parent {
    void method() {
        System.out.println("I am Child Class");
    }
}

public class Overriding {
    public static void main(String[] args) {

        Child object = new Child();
        object.method();
    }
}