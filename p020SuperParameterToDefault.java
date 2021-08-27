
class PtoDBase {

    PtoDBase(int a) {
        System.out.println(
                "This is parameter of base and its compulsory to write super in derived for its calling and value which it gives = "
                        + a);
    }
}

class PtoDDerived extends PtoDBase {

    PtoDDerived() {
        super(10);// calling parameterised constructor of base class
    }
}

public class p020SuperParameterToDefault {

    public static void main(String args[]) {
        PtoDDerived obj1;
        obj1 = new PtoDDerived();
    }
}
