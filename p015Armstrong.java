public class p015Armstrong {
    public static void main(String args[]) {
        int a = 153;
        int original = a;
        int n, x = 0;
        while (a > 0) {
            n = a % 10;
            x = x + (n * n * n);
            a = a / 10;

        }
        System.out.println("Value = " + x);
        if (x == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong");
        }
    }
}
