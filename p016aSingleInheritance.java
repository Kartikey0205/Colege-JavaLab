class Base {
    int a;
}

class Derived extends Base {
    int b;

    void set(int x, int y) {
        a = x;
        b = y;
    }

    void sum() {
        System.out.println("Sum " + (a + b));
    }
}

public class p016aSingleInheritance {
    public static void main(String args[]) {
        Derived d1 = new Derived();
        d1.set(23, 67);
        d1.sum();
    }
}