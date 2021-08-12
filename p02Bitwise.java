
public class p02Bitwise {
    public static void main(String args[]) {
        int a = 8, b = 9;
        System.out.println("Bitwise AND of a and b is " + (a & b));
        System.out.println("Bitwise OR of a and b is " + (a | b));
        System.out.println("Bitwise XOR of a and b is " + (a ^ b));
        System.out.println("Bitwise NOT of a is " + (~a));
        System.out.println("Bitwise NOT of b is " + (~b));
        System.out.println("Bitwise LEFT-SHIFT of a and b is " + (a << b));
        System.out.println("Bitwise RIGHT-SHIFT of a and b is " + (a >> b));
        System.out.println("Bitwise RIGHT-SHIFT WITH ZERO-FILL of a  is " + (a >>> 2));
        System.out.println("Bitwise RIGHT-SHIFT WITH ZERO-FILL of b is " + (a >>> 2));

    }
}