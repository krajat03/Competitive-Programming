
import java.util.Scanner;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int temp = x;
            int y = Integer.MAX_VALUE;

            while (temp != 0) {
                int digit = temp % 10;
                if (y > digit) {
                    y = digit;
                }
                temp /= 10;
            }
            System.out.println(y);

        }
        scanner.close();
    }
}
