
class DtoPBase {

    DtoPBase() {
        System.out.println("This is default and its optional to write super in parameteric of derived");
    }
}

class DtoPDerived extends DtoPBase {
    int b;

    DtoPDerived(int b) {
        // super();// calling parameterised constructor of base class
        System.out.println(b + " coming from parameter");
    }
}

public class p019SuperDefaultToParameter {

    public static void main(String args[]) {
        DtoPDerived obj1 = new DtoPDerived(20);
    }
}
