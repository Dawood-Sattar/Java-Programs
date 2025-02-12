public class Syntax {
    public static void main(String[] args) {
        {/* TYPE CASTING */}

        // 1. Widening Type Casting 
        int a = 10;
        double b = a;
        System.out.println(b);

        // 2. Narrowing Type Casting 
        double c = 10.5;
        int d = (int) c;
        System.out.println(d);
    }
}
