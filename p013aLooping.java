public class p013aLooping {
    public static void main(String args[]) {
        int digit = 85, sum = 0, n;
        while (digit > 0) {
            n = digit % 10;
            digit = digit / 10;
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
