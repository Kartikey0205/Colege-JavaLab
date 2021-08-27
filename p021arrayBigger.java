import java.util.*;

public class p021arrayBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int length = sc.nextInt();
        int a[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the number of array at position " + i + " = ");

            a[i] = sc.nextInt();
        }

        System.out.print("Array is - [ ");
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.print(" ] ");

        int smallest = a[0];

        int bigger = a[0];

        System.out.println(" ");
        for (int i = 0; i < 5; i++) {

            if (a[i] < smallest)

                smallest = a[i];

            else if (a[i] > bigger)

                bigger = a[i];

        }

        System.out.println("smallest=" + smallest);

        System.out.println("bigger=" + bigger);

    }
}
