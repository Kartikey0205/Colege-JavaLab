class Rectangle {
    int l, b;

    void getData(int x, int y) {
        l = x;
        b = y;
    }

    int cal() {
        return (l * b);
    }
}

public class p05Rectangclass {
    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle();
        rect1.getData(10, 30);
        int area = rect1.cal();
        System.out.println(area);
    }
}
