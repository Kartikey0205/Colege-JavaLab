class BC1 {
    BC1() {
        System.out.println("I am base class constructor");
    }
}

class IBC extends BC1 {
    IBC() {
        System.out.println("I am immediate");
    }
}

class DC1 extends IBC {
    DC1() {
        super(); // optional h baki y toh immediate base class hi run krega
        System.out.println("I am derived ");
    }
}

public class p017SuperConstructorDefaultToDefault {
    public static void main(String args[]) {
        DC1 dc1 = new DC1();
    }
}
