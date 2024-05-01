public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20;
        int a = 10, b = 11;
        int next;
        System.out.println(a + " " + b);
        for (int i = 12; i < n; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.println(next);
        }
    }
}
