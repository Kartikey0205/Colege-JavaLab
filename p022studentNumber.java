
import java.util.*;

class student {

    int Registration;

    String name;

    int total = 0;

    int a[] = new int[5];

    Scanner sc = new Scanner(System.in);

    student() {

        System.out.print("Registration: ");

        Registration = sc.nextInt();

        System.out.print("Name ");

        name = sc.next();

        for (int k = 0; k < 4; k++) {

            System.out.println("Enter marks of " + k + " th subject");

            a[k] = sc.nextInt();

        }

    }

    void print() {

        System.out.println("Name of student is " + name);
        System.out.println("Registration number is " + Registration);

        for (int k = 0; k < 5; k++) {

            total = total + a[k];

        }

        System.out.println("total= " + total);

        int lol = total / 5;

        System.out.println("average=" + lol);

        System.out.println();

    }

}

public class p022studentNumber

{

    public static void main(String[] args) {

        student stu1 = new student();

        stu1.print();

        student stu2 = new student();

        stu2.print();

        student stu3 = new student();

        stu3.print();

        student stu4 = new student();

        stu4.print();

        student stu5 = new student();

        stu5.print();

    }

}