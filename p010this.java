class Test1 {
    int a, b;

    Test1() {
        this(10);
        System.out.println("I am from default");
        a = 1;
        b = 2;
        System.out.println("Val of a = " + a);
        System.out.println("Val of b = " + b);

    }

    Test1(int x) {
        this(100, 200);
        System.out.println("I am from single parameter");
        a = b = x;
        System.out.println("Val of a = " + a);
        System.out.println("Val of b = " + b);

    }

    Test1(int a, int b) {
        System.out.println("I am from double parameter");
        this.a = a;
        this.b = b;
        System.out.println("this.a is " + this.a);
        System.out.println("this.b is " + this.b);
        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }
}

public class p010this {
    public static void main(String args[]) {
        Test1 t1 = new Test1();
    }
}
