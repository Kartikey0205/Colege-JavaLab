public class p011cOperator {
    public static void main(String args[]) {
        int a = 789;
        int n;
        for (int i = 0; i < 3; i++) {
            n = a % 10;
            a = a / 10;
            System.out.println(n);
        }
        ;
    }
}
