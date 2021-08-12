public class p01operator {
    public static void main(String args[]) {
        // System.out.println("hello");
        float a = 2.5f, b = 6.4f;
        float c = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a+b = " + (a + b));
        System.out.println("a-b = " + (a - b));
        System.out.println("a/b = " + (a / b));
        System.out.println("a*b = " + (a * b));
        System.out.println("a%b = " + (a % b));
        System.out.println("a==b = " + (a == b));
        System.out.println("a<b = " + (a < b));
        System.out.println("a>=b = " + (a >= b));
        System.out.println("a<=b = " + (a <= b));
        System.out.println("a!=b = " + (a != b));
        System.out.println("a+3 =   " + (a += 3));
        System.out.println("a>b && c ==10 = " + (a > b && c == 10));
        System.out.println("a>b || c ==10= " + (a > b || c == 10));
        System.out.println("!(a==16)= " + (!(a == 16)));

    }
}