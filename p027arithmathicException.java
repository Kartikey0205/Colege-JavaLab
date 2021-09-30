import java.util.*;

public class p027arithmathicException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first operand");
        int num1 = sc.nextInt();
        System.out.println("Enter the first operand");
        int num2 = sc.nextInt();
        try {
            System.out.println("num1 + num2 = " + (num1 + num2));
            System.out.println("num1 - num2 = " + (num1 - num2));
            System.out.println("num1 / num2 = " + (num1 / num2));
            System.out.println("num1 * num2 = " + (num1 * num2));
            System.out.println("num1 % num2 = " + (num1 % num2));
            System.out.println("num1 > num2 = " + (num1 > num2));
            System.out.println("num1 < num2 = " + (num1 < num2));
            System.out.println("num1 != num2 = " + (num1 != num2));

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error is " + e);
            System.out.println("Catch block Code will executed");
        }
        System.out.println("Outside block Code will executed");

    }
}
