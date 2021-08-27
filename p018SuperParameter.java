class C1class {
    int a;

    C1class(int a) {
        System.out.println(a);
    }
}

class Cclass extends C1class {
    int b;

    Cclass(int a, int b) {
        super(a);// calling parameterised constructor of base class
    }
}

public class p018SuperParameter {
    public static void main(String args[]) {
        Cclass obj1 = new Cclass(10, 20);
    }
}
