class BClass {
    int a;
}

class DClass extends BClass {
    int a;

    void set(int x, int y) {
        super.a = x;
        a = y;
    }

    void Sum() {
        System.out.println(super.a);
        System.out.println("SUM = " + (a + super.a));
    }
}

public class p017SuperVariable {
    public static void main(String args[]) {
        DClass d1 = new DClass();
        d1.set(50, 70);
        d1.Sum();
    }
}
