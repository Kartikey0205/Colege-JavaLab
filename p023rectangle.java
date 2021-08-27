
import java.util.*;

class Rectangle1 {

    Scanner sc = new Scanner(System.in);
    double width;

    double length;

    double area;

    String color;

    void get_length()

    {
        System.out.print("Length: ");

        length = sc.nextDouble();

    }

    void get_width()

    {
        System.out.print("Width: ");

        width = sc.nextDouble();

    }

    void get_color()

    {
        System.out.print("Color: ");

        color = sc.next();

    }

    void find_area()

    {
        area = length * width;
        System.out.println("Area is " + area);

    }

}

public class p023rectangle {
    public static void main(String[] args) {

        Rectangle1 rect1 = new Rectangle1();
        System.out.println("First Rectangle - ");
        rect1.get_length();
        rect1.get_width();
        rect1.get_color();
        rect1.find_area();
        System.out.println();

        Rectangle1 rect2 = new Rectangle1();
        System.out.println("Second Rectangle - ");

        rect2.get_length();
        rect2.get_width();
        rect2.get_color();
        rect2.find_area();
        System.out.println();

        if (rect1.area == rect2.area && rect1.color == rect2.color) {

            System.out.println("Matching");
        }

        else {

            System.out.println("Not matching");
        }

    }
}
