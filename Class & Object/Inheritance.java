class ParentClass {
    void methodOne() {
        System.out.println("I am Parent Class");
    }
}

class ChildClass extends ParentClass {
    void methodTwo() {
        System.out.println("I am child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        ChildClass object = new ChildClass();
        object.methodOne();
    }
}