import java.util.Scanner;

public class BlackboardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 4 != 0) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
        scanner.close();
    }
}
