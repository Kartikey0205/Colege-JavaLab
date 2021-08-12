class Test {
    Test() {
        int a = 10, b = 20;
        System.out.println(a);
        System.out.println(b);

    }

    Test(int num) {
        System.out.println("Math marks is " + num);
    }

    Test(int num1, int num2) {
        System.out.println("Math marks is " + num1);
        System.out.println("Science marks is " + num2);

    }
}

public class p09constructors {
    public static void main(String args[]) {
        Test t1 = new Test();
        Test t2 = new Test(90);
        Test t3 = new Test(80, 96);

    }
}
