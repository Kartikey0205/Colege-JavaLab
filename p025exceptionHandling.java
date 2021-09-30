public class p025exceptionHandling {
    public static void main(String[] args) {
        int a = 50;
        try {
            System.out.println(a / 0);
            System.out.println("Rest of thr code");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error is " + e);
            System.out.println("Catch block Code will executed");
        }
    }
}
