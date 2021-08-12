public class p07IfElse {

    public static void main(String args[]) {

        int sum = 0, count = 0;
        for (int i = 100; i < 200; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                sum = sum + i;
                count++;
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Total number between 100 and 200 divisble by 7  is " + count);

    }

}
