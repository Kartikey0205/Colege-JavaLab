class BC {
    void display() {
        System.out.println("From BASE class");
    }
}

class DC extends BC {
    void display() {
        super.display();
        System.out.println("From DERIVED class");
    }
}

public class p017SuperMethod {
    public static void main(String args[]) {
        DC d1 = new DC();
        d1.display();
    }
}
