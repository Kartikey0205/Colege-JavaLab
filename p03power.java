public class p03power {
    public static void main(String args[]) {
        int base = 2;
        int power = 10;
        long result = 1;
        for (int i = 0; i < power; i++) {
            System.out.println(base + " to the power " + i + " is " + result);
            result = result * base;
        }
    }
}
