import java.util.Scanner;

/**
 * FindPowerUsingLoop
 */
public class FindPowerUsingLoop {
    static int Pow(int a, int b) {
        int power = 1;
        for (int i = 1; i <= b; ++i) {
            power = power * a;
        }
        return power;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = scanner.nextInt();
        System.out.print("Enter Power: ");
        int exponent = scanner.nextInt();
        System.out.printf("%d^%d = %d", base, exponent, Pow(base, exponent));
        // scanner.close();
    }
}
